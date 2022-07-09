import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[][] array = new int[num][4];

        

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < 4; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        int[] result = new int[num];
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < 4; j++) {
                if (j == 0) {
                    result[i] +=Math.min(array[i][0],array[i][2]);
                    if (array[i][0]>=array[i][2]){
                        array[i][0] -=Math.min(array[i][0],array[i][2]);
                    }
                } else if (j==1){
                    result[i] +=array[i][1]/2;
                    array[i][1] = array[i][1] % 2;
                } else if (j==3){
                    result[i] +=array[i][3];
                }
            }
            result[i] +=(array[i][0]+array[i][1]*2)/4;
        }

        for (int i=0 ;i<result.length;i++){
            System.out.println(result[i]);
        }
    }
}

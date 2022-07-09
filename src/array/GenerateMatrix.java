package array;

import java.lang.reflect.GenericArrayType;
import java.util.Arrays;

public class GenerateMatrix {

    public int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];

        //循环次数
        int loop = n / 2;

        //定义每次开始的初始位置
        int startX = 0;
        int startY = 0;

        //定义偏移量
        int offset = 1;

        //定义填充数字
        int count = 1;

        //定义中间位置
        int mid = n / 2;

        while (loop > 0) {
            int i = startX;
            int j = startY;

            //模拟上侧从左到右
            for (;j<startY+n-offset;++j)
                result[startX][j]=count++;

            //模拟右侧从上到下
            for (;i<startX+n-offset;++i)
                result[i][j]=count++;

            //模拟下侧从右到左
            for (;j>startY;j--)
                result[i][j]=count++;

            //模拟左侧从下到上
            for (;i>startX;i--)
                result[i][j]=count++;

            loop--;
            startX++;
            startY++;
            offset+=2;
        }

        if (n%2==1)
            result[mid][mid]=n*n;

        return result;
    }

    public static void main(String[] args) {
//        System.out.println(Arrays.toString(new GenerateMatrix().generateMatrix(5)));
//        int a[][] = new GenerateMatrix().generateMatrix(5);
//        for (int i=0;i<5;i++){
//            for (int j = 0;j<5;j++)
//                System.out.println(a[i][j]);
//        }

//        int a[][] = new GenerateMatrix().matrix(5);
//        for (int i=0;i<5;i++){
//            for (int j = 0;j<5;j++)
//                System.out.println(a[i][j]);
//        }
        System.out.println(Math.pow(4,2));
    }


    public int[][] matrix(int n){

        int[][] result = new int[n][n];

        int loop =n/2;
        int startX=0;
        int startY=0;
        int offset=1;
        int mid=n/2;
        int count=1;

        while (loop>0){
            int i = startX;
            int j = startY;

            for (;j<startY+n-offset;++j){
                result[startX][j]=count++;
            }

            for (;i<startX+n-offset;++i){
                result[i][j]=count++;
            }

            for (;j>startY;j--){
                result[i][j]=count++;
            }

            for (;i>startX;i--){
                result[i][j]=count++;
            }

            loop--;
            offset+=2;
            startX++;
            startY++;
        }
        if (n%2==1)
            result[mid][mid]=n*n;
        return result;
    }
}

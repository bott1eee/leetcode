package codetop;

public class MySqrt {

    public static int mysqrt(int x) {

        if (x == 1)
            return 1;
        int min = 0;
        int max = x;
        while (max - min > 1) {
            int m = (max + min) / 2;
            if (x / m < m) {
                max = m;
            } else {
                min = m;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        System.out.println(mysqrt(5));
    }


    public int mysqet_2(int x) {
        if (x == 1)
            return 1;
        int min = 0;
        int max = x;
        while (max - min > 1) {
            int m = (max + min) / 2;
            if (x / m < m){
                max = m;
            } else {
                min = m;
            }
        }
        return min;
    }
}

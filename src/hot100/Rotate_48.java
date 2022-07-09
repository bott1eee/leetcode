package hot100;

public class Rotate_48 {

    public void rotate(int[][] matrix) {
        int length = matrix.length;
        int[][] matrix_sub = new int[length][length];

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                matrix_sub[j][length - i - 1] = matrix[i][j];
            }
        }
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                matrix[i][j] = matrix_sub[i][j];
            }
        }
    }
}

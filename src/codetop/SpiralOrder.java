package codetop;

import java.util.ArrayList;
import java.util.List;

public class SpiralOrder {

    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> result = new ArrayList<>();
        int left = 0;
        int right = matrix[0].length - 1;
        int top = 0;
        int bottom = matrix.length - 1;
        int count = matrix.length * matrix[0].length;
        while (count >= 1) {
            for (int i = left; i <= right && count > 0; i++) {
                result.add(matrix[top][i]);
                count--;
            }
            for (int i = top; i <= bottom && count > 0; i++) {
                result.add(matrix[i][right]);
                count--;
            }
            for (int i = right; i >= left && count > 0; i--) {
                result.add(matrix[bottom][i]);
                count--;
            }
            for (int i = bottom; i >= top && count > 0; i--) {
                result.add(matrix[i][left]);
                count--;
            }
        }
        return result;
    }
}

public class 剑指offer04_二维数组中的查找 {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix.length == 0 || 0 == matrix[0].length) {
            return false;
        }
        int h = matrix.length;
        int w = matrix[0].length;
        /*//暴力遍历
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (matrix[i][j] == target) {
                    return true;
                }
            }
        }*/
        int column = w - 1;

        return false;
    }

    public boolean findNumberIn2DArray_2(int[][] matrix, int target) {
        if (matrix.length == 0 || 0 == matrix[0].length) {
            return false;
        }
        int h = 0;
        int w = matrix[0].length - 1;
        //空
        while (h < matrix.length && w >= 0) {
            if (matrix[h][w] > target) {
                w--;
            } else if (matrix[h][w] < target) {
                h++;
            } else {
                return true;
            }
        }
        return false;
    }
}


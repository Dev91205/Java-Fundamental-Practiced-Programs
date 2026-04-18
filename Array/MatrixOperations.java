package Array;

public class MatrixOperations {

    public static void columnSum(int[][] a) {
        for (int j = 0; j < 3; j++) {
            int sum = 0;
            for (int i = 0; i < 3; i++) {
                sum += a[i][j];
            }
            System.out.println("Sum of column " + j + " = " + sum);
        }
    }

    public static int largestElement(int[][] a) {
        int max = a[0][0];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (a[i][j] > max)
                    max = a[i][j];
            }
        }
        return max;
    }

    public static void multiplyMatrix(int[][] a, int[][] b) {
        int[][] c = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void printBoundary(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (i == 0 || i == a.length-1 || j == 0 || j == a.length-1)
                    System.out.print(a[i][j] + " ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] a = {
            {10,20,30},
            {40, 50, 60},
            {70, 80, 90}
        };

        int[][] b = {
            {1, 0, 1},
            {0, 1, 0},
            {1, 0, 1}
        };

        columnSum(a);
        System.out.println("Largest element = " + largestElement(a));
        multiplyMatrix(a, b);
        printBoundary(a);
    }
}
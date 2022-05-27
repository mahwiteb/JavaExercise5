public class TwoDArray {
    import java.util.Random;

    class TwoDArray {
        public static void main(String[] args) {
            int[][] matrix = new int[10][10];
            Random rand = new Random();
            int count = 0;

            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix.length; j++) {
                    int random = rand.nextInt(8) + 1;
                    if (matrix[i][j] == 0)
                        matrix[i][j] = random;
                    // System.out.print(matrix[i][j]);
                }
            }

            for (int i = 0; i < matrix.length; i++) {
                count += matrix[i][i];
            }
            System.out.print("Sum of the diagonal 2D array is " + (count));
        }
    }

}

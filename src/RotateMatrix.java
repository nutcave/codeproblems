/**
 * Created by Nutcave on 2/1/2017.
 */
public class RotateMatrix {

    public void rotate(int[][] matrix) {

        for(int x=0; x < matrix.length /2 ; x++){

            int end= matrix.length - x - 1;

            for(int y=x; y< end ;y++){
               int offset=y - x;

                int tmp = matrix[x][y];
                matrix[x][y]=matrix[end-offset][x];
                matrix[end-offset][x]=matrix[end][end-offset];
                matrix[end][end-offset]= matrix[y][end];
                matrix[y][end]=tmp;

            }

        }



    }

    public static void main(String[] args) {
        // Test Case 1

        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        new RotateMatrix().rotate(matrix);

        printMatrix(matrix);


    }

    private static void printMatrix(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[i].length; j++)
                System.out.printf("%2d ", matrix[i][j]);

            System.out.printf("\n");
        }
        System.out.printf("\n\n");
    }
}

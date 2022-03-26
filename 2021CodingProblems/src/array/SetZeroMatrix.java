package array;

import java.util.Arrays;

public class SetZeroMatrix {

    public static void setZeroes(int[][] matrix) {

        int row[] = new int[matrix.length];
        int colomn[] = new int[matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] == 0){
                    row[i]=1;
                    colomn[j]=1;
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(row[i] == 1  || colomn[j]==1){
                    matrix[i][j]=0;
                }
            }
        }


    }

    public static void main(String[] args) {
        int[][] myArr =         {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};

        setZeroes(myArr);
        System.out.println(Arrays.deepToString(myArr));
    }

}

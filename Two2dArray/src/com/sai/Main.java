package com.sai;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3 },
                {4, 5, 6 },
                {7, 8 , 9}

        };
        System.out.println(searchMatrix(matrix, 3)) ;
    }
    static boolean searchMatrix(int[][] matrix, int target) {


        // let's take row as 0
        // col as matrix[0].length -1
        int row = 0;
        int col = matrix[0].length - 1;

        while( row < matrix.length && col >= 0) {

            if( matrix[row][col] == target ){

                // if the target is equals to matrix[row][col]
                // it means we found the element in the given matrix
                // return true

                return true;
            }
            else if( matrix[row][col] > target ) {
                // if the target is less than the matrix elements
                // it means we can eleminate that column
                // because we known the given matrix is sorted
                // col--
                col--;
            }
            else {
                // if the target is greater than the matrix elements
                // it means we can eleminate that row
                // because we known the given matrix is sorted
                // row++
                row++;
            }
        }
        // if we didn't found the element in the given matrix
        // simply return false
        return false;
    }
}

package com.bridgelabz.searching;

import java.util.Scanner;

public class BinarySearch3 {

    // Method to search the target element in the array
    public static boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int left = 0;
        int right = rows * cols - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int row = mid / cols;
            int col = mid % cols;

            if(matrix[row][col] == target) {
                return true;
            }
            else if(matrix[row][col] > target) {
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }
        return false;
    }

    //Main method
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = scanner.nextInt();

        //2d array
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.print("Enter target element: ");
        int target = scanner.nextInt();
        System.out.println(searchMatrix(matrix, target));
    }
}

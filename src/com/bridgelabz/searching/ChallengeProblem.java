package com.bridgelabz.searching;

import java.util.Arrays;
import java.util.Scanner;

public class ChallengeProblem {

    // Method to find the first missing positive integer
    public static int firstMissingPositive(int[] arr) {

        int n = arr.length;
        boolean[] visited = new boolean[n + 2];

        // Mark positive numbers
        for (int i = 0; i < n; i++) {

            if (arr[i] > 0 && arr[i] <= n + 1) {
                visited[arr[i]] = true;
            }

        }

        // Find the first missing positive integer
        for (int i = 1; i <= n + 1; i++) {

            if (!visited[i]) {
                return i;
            }

        }

        return -1;
    }

    // Binary Search Method
    public static int binarySearch(int[] arr, int target) {

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            else if (arr[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Find the first missing positive integer
        int missing = firstMissingPositive(arr);
        System.out.println("First Missing Positive Integer: " + missing);

        // Sort the array
        Arrays.sort(arr);

        System.out.println("Sorted Array:");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        System.out.print("Enter the target element: ");
        int target = scanner.nextInt();

        int index = binarySearch(arr, target);

        if (index != -1) {
            System.out.println("Target Found at Index: " + index);
        } else {
            System.out.println("Target Not Found");
        }
    }
}

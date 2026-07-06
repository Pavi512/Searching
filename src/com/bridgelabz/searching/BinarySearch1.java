package com.bridgelabz.searching;

import java.util.Scanner;

public class BinarySearch1 {

    // Method to find the rotation point in an array
    public static int findRotationPoint(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if(arr[mid] > arr[right]) {
                left = mid + 1;
            }
            else {
                right = mid;
            }
        }
        return left;
    }

    //Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = scanner.nextInt();

        //Array to store elements
        int[] arr = new int[n];

        System.out.println("Enter the rotated sorted array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int index = findRotationPoint(arr);
        System.out.println("Rotation Point Index : " + index);
        System.out.println("Smallest Element : " + arr[index]);
    }
}

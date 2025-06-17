// 1. Two Sum (Company: Amazon, Google)
//  Problem Find two indices such that their elements sum up to the target.
//  Input: nums = [2,7,11,15], target = 9
//  Output: [0,1]

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter target number: ");
        int tar = sc.nextInt();

        mithu: for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] + arr[j] == tar) {
                    System.out.println(i + "," + j);
                    break mithu;
                }
            }
        }
    }
}
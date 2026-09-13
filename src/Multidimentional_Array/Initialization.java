package Multidimentional_Array;

import java.util.Scanner;

public class Initialization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows :");
        int rows = sc.nextInt();
        System.out.println("Enter number of cols :");
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Enter element of matrix [" + i + " ]" + "[" + j + " ]");
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}

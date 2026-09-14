package Multidimentional_Array;

import java.util.Scanner;

public class Diagonal_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Rows :");
        int rows = sc.nextInt();
        System.out.println("Enter Number of cols :");
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];
        int firstCount = 0;
        int secondCount = 0;

        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Enter Value [" + i + "][" + j + "]");
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i == j){
                    firstCount += arr[i][j];
                }
            }
        }
        System.out.println("The sum of primary diagonal of matrix is :" + firstCount);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i + j == rows - 1){
                    secondCount += arr[i][j];
                }
            }
        }
        System.out.println("The sum of secondary diagonal of matrix is :" + secondCount);
        sc.close();
    }
}

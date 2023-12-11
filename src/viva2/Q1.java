/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package viva2;

import java.util.Scanner;

/**
 *
 * @author sawaz
 */
public class Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        int arr[][] = new int[][]{
//            {1,2,3},
//            {2,2,3},
//            {7,8,8}};
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Insert the row of your matrix: ");
        int row = scan.nextInt();
        System.out.println("Insert the column of your matrix: ");
        int column = scan.nextInt();
        int[][] arr = new int[row][column];
        for(int i = 0;i<row;i++){
            for(int j = 0; j<column;j++){
                System.out.println("Insert ["+i+"]["+j+"]: ");
                arr[i][j] = scan.nextInt();
            }
        }
        transpose(arr);
        System.out.println("Transposed matrix: ");
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
    public static void transpose(int[][] arr){
        
        int arr2[][] = new int[3][3];
        for(int i = 0; i<arr.length;i++){
            for(int j = 0; j<arr[i].length;j++){
                arr2[i][j] = arr[j][i];
            }
        }
        for(int i = 0; i<arr.length;i++){
            for(int j = 0; j<arr[i].length;j++){
                arr[i][j] = arr2[i][j];
            }
        }
        
    }
    
}

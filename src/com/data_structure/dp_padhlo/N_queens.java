package com.data_structure.dp_padhlo;

import java.util.Scanner;

public class N_queens {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] chess = new int[n][n];

        printNqueens(chess, "", 0);
    }

    public static void printNqueens(int[][] chess, String qsf, int row) {
        if (row == chess.length) {
            System.out.println(qsf);
            return;
        }


        for (int col = 0; col < chess.length; col++) {
            if (issafeplaceforQueen(chess, row, col) == true) {
            chess[row][col] = 1;
            printNqueens(chess, qsf + row + "-" + col + ",", row + 1); //actually we have to write the N queens place 1-0,2-9
            chess[row][col] = 0;
        }
    }
}

    public static boolean issafeplaceforQueen(int[][]chess,int row,int col){  //three corner cases will for thhis
        for(int i=row-1, j=col; i>=0; i--){ //first for chek top
            if(chess[i][j] == 1){
                return false;
            }
        }

        for(int i= row - 1, j= col - 1; i >= 0 && j >= 0; i--, j--){ // diagnally on the left side
            if(chess[i][j]==1){
                  return false;
             }
        }

        for(int i=row-1 , j=col+1;  i>=0 && j< chess.length ; i--,j++){ ///diagnally on the right side not any present on the quene
            if(chess[i][j]==1){
                return false;
            }
        }



        return true;
    }
}

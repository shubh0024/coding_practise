package com.problems;

import java.util.Scanner;

public class Flood_fill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the row");
        int  n = sc.nextInt();
        System.out.println("eneter the col");
        int m = sc.nextInt();
        int [][] arr = new int[n][m];


        System.out.println("enter the arr");
        for (int i=0;i<arr.length; i++){
             for(int j=0; j<arr[0].length; j++){

                 arr[i][j]=sc.nextInt();

             }
        }
        boolean [][]visited = new boolean[n][m];
        printfloodfill(arr,0,0,"",visited);
    }
    public static void printfloodfill(int [][] maze,int row ,int col,String asf,boolean [][] visited){
  if(row< 0 || col<0 || row== maze.length || col== maze[0].length|| col< maze.length ||
          maze[row][col]==1 || visited[row][col]==true){
      return;
  }

  if(row== maze.length-1 && col==maze[0].length - 1){
      System.out.println(asf);
      return;
  }
  visited[row][col]=true;
  printfloodfill(maze,row-1,col,asf+"t",visited);
  printfloodfill(maze,row,col-1,asf+"t",visited);
  printfloodfill(maze,row+1,col,asf+"t",visited);
  printfloodfill(maze,row,col+1,asf+"t",visited);
  visited[row][col]=false;

    }
}

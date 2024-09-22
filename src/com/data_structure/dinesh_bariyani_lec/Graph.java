package com.data_structure.dinesh_bariyani_lec;

import java.util.LinkedList;
import java.util.Queue;

public class Graph {
    private int V;
    private int E;
    private int [][] adjMatrix;

    public Graph(int node){
        this.V=node;
        this.E=0;
        this.adjMatrix=new int [node][node];

    }
    public void addEdge(int u,int v){
        adjMatrix[u][v]=1;
        adjMatrix[u][v]=1;
        E++;
    }
    public String toString(){
        StringBuilder sb=new StringBuilder();
        sb.append(V + "vertices," + E +" edges"+"\n");
        for(int v=0; v<V; v++){
            sb.append(v+ " :");
            for(int w:adjMatrix[v]){
                sb.append(w + " ");
            }
            sb.append(" \n");
        }
        return sb.toString();
    }

    public void Bfs(int s) {
        Boolean[] visited = new Boolean[V];
        Queue<Integer> q = new LinkedList<>();

        visited[s] = true;
        q.offer(s);

        while (!q.isEmpty()) {
            int temp = q.poll();//temporaray space me assign karenge value ko pop krkek
            System.out.println(temp + " ");
            for (int V: adjMatrix[temp]) {
                if (!visited[V]) {
                    visited[V] = true;
                    q.offer(V);

                }

            }


        }
    }


    public static void main(String[] args) {
        Graph g=new Graph(5);
        g.addEdge(0,1);
        g.addEdge(1,2);
        g.addEdge(2,3);
        g.addEdge(3,0);
        g.addEdge(2,4);
        g.Bfs(0);
        System.out.println(g);



    }
}

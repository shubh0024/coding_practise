package com.data_structure.dinesh_bariyani_lec;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class iterative_DFs {

    private LinkedList<Integer>[] adj;
    private int V;
    private int E;

    public iterative_DFs(int nodes) {
        this.V = nodes;
        this.E = 0;
        this.adj = new LinkedList[nodes];
        for (int v = 0; v < V; v++) {
            adj[v] = new LinkedList<>();

        }
    }

    public void addege(int u, int v) {
        adj[u].add(v);
        adj[v].add(u);
        E++;

    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(V + "vertices" + E + "egdes" + " \n");
        for (int v = 0; v < V; v++) {
            sb.append(v + " :");
            for (int w : adj[v]) {
                sb.append(w + " ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public void bfs(int s) {
        boolean[] visited = new boolean[V];

        Queue<Integer> q = new LinkedList<>();
        visited[s] = true;
        q.offer(s);
        while (!q.isEmpty()) {
            int u = q.poll();
            System.out.println(u + " ");
            for (int v : adj[u]) {
                if (!visited[v]) {
                    visited[v] = true;
                    q.offer(v);
                }
            }
        }

    }

    public void dfs(int s) {
        Boolean[] visited = new Boolean[V]; //track the node already visisted

        Stack<Integer> stack = new Stack<>();
        stack.push(s);

        while (!stack.isEmpty()) {
            int u = stack.pop();
            if (!visited[u]) {
                visited[u] = true;
                System.out.println(u + " ");
                for (int v : adj[u]) {
                    if (!visited[v]) {
                        stack.push(v);
                    }

                }
            }
        }
    }

    public static void main(String[] args) {
        iterative_DFs is=new iterative_DFs(5);
        is.addege(0,1);
        is.addege(1,2);
        is.addege(2,3);
        is.addege(3,4);
        is.addege(2,4);
        is.dfs(1);
    }
}

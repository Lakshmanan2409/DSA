package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Adjacency {
    public static void main(String[] args) {
        int v= 5;
        ArrayList<ArrayList<Integer>> adj_list = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < 5; i++) {
            adj_list.add(new ArrayList<Integer>());
        }
        boolean[] visited = new boolean[5];
        addEdge(adj_list,0,1);
        addEdge(adj_list,0,2);
        addEdge(adj_list,1,2);
        addEdge(adj_list,2,3);
        System.out.println(adj_list);
        BFS(adj_list,0,visited);
        DFS(adj_list,0,new boolean[v]);
    }
    public static void addEdge(ArrayList<ArrayList<Integer>> adj,int v, int u){
        adj.get(v).add(u);
        adj.get(u).add(v);
    }

    public static void BFS(ArrayList<ArrayList<Integer>> adj, int s, boolean[] visited){
        Queue<Integer> q =new LinkedList<Integer>();
        visited[s] = true;
        q.add(s);
        while(!q.isEmpty()){
            int x = q.poll();
            System.out.print(x +" ");
            for (int u : adj.get(x)) {
                if(!visited[u]){
                    visited[u]=true;
                    q.add(u);
                }
            }
        }
        System.out.println();
    }

    public static void DFS(ArrayList<ArrayList<Integer>> adj,int s, boolean[] visited){
        visited[s] = true;
        System.out.print(s+" ");
        for(int u : adj.get(s)){
            if(!visited[u]){
                DFS(adj,u,visited);
            }
        }
    }
}

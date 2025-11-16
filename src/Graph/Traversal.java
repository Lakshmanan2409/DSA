package Graph;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import static Graph.Adjacency.addEdge;

public class Traversal {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj_list = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < 5; i++) {
            adj_list.add(new ArrayList<Integer>());
        }
        addEdge(adj_list,0,1);
        addEdge(adj_list,0,2);
        addEdge(adj_list,1,2);
        addEdge(adj_list,2,3);
        System.out.println(adj_list);
        System.out.println(Arrays.toString(Shortest_Path(adj_list,5,0)));
        BFS(adj_list,5,0);
        DFS(adj_list,0,new boolean[5]);
    }

    public static int[] Shortest_Path(ArrayList<ArrayList<Integer>> adj, int v, int s){
        boolean[] visited = new boolean[v];
        int[] res = new int[v];
        Queue<Integer> q =new LinkedList<Integer>();
        visited[s] = true;
        res[s] = 0;
        q.add(s);
        while(!q.isEmpty()){
            int x = q.poll();
//            System.out.print(x +" ");
            for (int u : adj.get(x)) {
                if(!visited[u]){
                    res[u]=res[x]+1;
                    visited[u]=true;
                    q.add(u);
                }
            }
        }
//        System.out.println();
        return res;
    }

    public static void BFS(ArrayList<ArrayList<Integer>> adj, int v, int s){
        boolean[] visited = new boolean[v];
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

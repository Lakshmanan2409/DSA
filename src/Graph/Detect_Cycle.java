package Graph;
import java.util.ArrayList;
import static Graph.Adjacency.addEdge;

public class Detect_Cycle {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj_list = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < 5; i++) {
            adj_list.add(new ArrayList<Integer>());
        }
        addEdge(adj_list,0,1);
        addEdge(adj_list,0,2);
        addEdge(adj_list,1,2);
        addEdge(adj_list,2,3);
        boolean visited[] = {false,false,false,false,false};
        boolean visit[] = {false,false,false,false,false};
//        for (int i = 0; i < 5; i++) {
//            if(!visited[i] && DFS_undirected(adj_list,i,visited,-1)){
//                System.out.println("YES");
//                break;
//            }
//        }
        for (int i = 0; i < 5; i++) {
            if(!visited[i] && DFS_directed(adj_list,i,visited,visit)){
                System.out.println("YES");
                break;
            }
        }
    }

    public static boolean DFS_undirected(ArrayList<ArrayList<Integer>> adj, int i, boolean[] visited, int parent) {
        visited[i] = true;
        for (int u:adj.get(i)) {
            if(!visited[u]){
                if(DFS_undirected(adj,u,visited,i))
                    return true;
            }
            else if(u!=parent)
                return true;
        }
        return false;
    }
    public static boolean DFS_directed(ArrayList<ArrayList<Integer>> adj, int i, boolean[] visited, boolean[] back) {
        visited[i] = true;
        back[i] = true;
        for (int u:adj.get(i)) {
            if(!visited[u] && DFS_directed(adj,u,visited,back))
                return true;
            else if(back[u])
                return true;
        }
        back[i]=false;
        return false;
    }
}

package classics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Created by siddhahastmohapatra on 02/01/17.
 */
public class MonkIslands {


    public static void main(String args[] ) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int T = Integer.parseInt(line);

        for(int i=0;i<T;i++){
            StringTokenizer str = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(str.nextToken());
            int M = Integer.parseInt(str.nextToken());

            Graph graph = new Graph(N, M);
            for(int j =0;j<M;j++){
                str = new StringTokenizer(br.readLine());
                graph.addEdge(Integer.parseInt(str.nextToken()),
                        Integer.parseInt(str.nextToken()));
            }
            BFS b = new BFS(graph);
            System.out.println(b.distanceToLastIsland());
        }

    }

    private static class Graph{

        int[][] M ;
        int V;
        int E;
        public Graph(int V, int E){
            this.V = V;
            this.E = E;
            M = new int[V][V];
        }

        public void addEdge(int n, int m){
            M[n-1][m-1] = 1;
            M[m-1][n-1] = 1;
        }

        public List<Integer> adj(int i){
            List<Integer> adj = new ArrayList<Integer>();
            for(int j =0;j<V;j++){
                if(M[i][j]==1){
                    adj.add(j);
                }
            }
            return adj;
        }

    }

    private static class BFS{

        Graph graph;
        boolean marked[];
        int distTo[];
        int counts = 1;

        public BFS(Graph graph){
            this.graph = graph;
            marked = new boolean[graph.V];
            distTo = new int[graph.V];
            for(int a=0;a<graph.V;a++){
                distTo[a] = Integer.MAX_VALUE;
            }
            bfs(0);
        }

        public int distanceToLastIsland(){
            return distTo[graph.V-1];
        }

        public void bfs(int s){

            Queue<Integer> q = new LinkedList<Integer>();
            q.add(s);
            marked[s] = true;

            while(!q.isEmpty()){
                int v = q.poll();
                for(int w:graph.adj(v)){
                    if(!marked[w]){
                        marked[w] = true;
                        q.add(w);
                        chooseDistance(w);
                    }
                }
                counts++;
            }

        }

        public void chooseDistance(int w){
            if(counts>=distTo[w]){

            } else{
                distTo[w] = counts;
            }
        }
    }

}

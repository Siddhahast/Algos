package hackerrank.graphtheory;
import java.io.*;
import java.util.*;
/**
 * Created by siddhahastmohapatra on 09/01/17.
 */
public class EvenTree {
    private static Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
    private static Map<Integer, Node> nodesMap = new HashMap<Integer, Node>();
    private static boolean[] marked ;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());
        int V = Integer.parseInt(str.nextToken());
        marked = new boolean[V+1];
        for(int j=1;j<=V;j++){
            map.put(j, new ArrayList<Integer>());
            nodesMap.put(j, new Node(j));
        }
        int E = Integer.parseInt(str.nextToken());

        for(int i=1;i<=E;i++){

            str = new StringTokenizer(br.readLine());
            int w = Integer.parseInt(str.nextToken());
            int v = Integer.parseInt(str.nextToken());
            addEdge(w, v);

        }
        dfs(1);
        System.out.println(getEdgesToRemove());
    }

    private static int dfs(int v){
        marked[v] = true;
        int c = 0;
        for(Integer i:map.get(v)){
            if(!marked[i]){
                c = 1+dfs(i);
            }
        }
        nodesMap.get(v).children = c;
        return c;
    }

    private static int getEdgesToRemove(){

        int remove =0;
        for(Map.Entry<Integer, Node> entry : nodesMap.entrySet()){

            if(entry.getValue().children%2==1){
                remove++;
            }

        }
        return remove/2;
    }

    private static void addEdge(int w, int v){
        map.get(v).add(w);
    }

    private static class Node{

        int v;
        int children;

        public Node(int v){
            this.v = v;
            this.children = 0;
        }

    }
}

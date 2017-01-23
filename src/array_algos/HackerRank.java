package array_algos;
import java.io.*;
import java.util.*;
/**
 * Created by siddhahastmohapatra on 09/01/17.
 */
public class HackerRank {

    private static Queue<Edge> mst = new LinkedList<Edge>();
    private static Map<Integer, List<String>> nodesMap = new HashMap<Integer, List<String>>();
    private static Set<Integer> vertices = new HashSet<Integer>();
    private static Queue<Edge> q = new PriorityQueue<Edge>();
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());

        int V = Integer.parseInt(str.nextToken());
        int E = Integer.parseInt(str.nextToken());
        nodesMap.get(2);


        for(int i=0;i<E;i++){
            str = new StringTokenizer(br.readLine());
            int v = Integer.parseInt(str.nextToken());
            int w = Integer.parseInt(str.nextToken());
            int weight = Integer.parseInt(str.nextToken());
            Edge edge = new Edge(v,w,weight);
            q.add(edge);
        }

        constructMST(q, V);
        System.out.println(getMinWeight());

    }

    private static void constructMST(Queue<Edge> edges, int v){

        Edge e = edges.poll();
        vertices.add(new Integer(e.either()));
        vertices.add(new Integer(e.other(e.either())));
        mst.add(e);
        while(!edges.isEmpty() && mst.size() != (v -1)){
            e = edges.poll();

            int w = e.other(v);
            if(validateTreeConstruct(v,w)){
                mst.add(e);
            }
        }
    }

    private static int getMinWeight(){
        int sum = 0;
        while(!mst.isEmpty()){
            sum = sum + mst.poll().weight;
        }
        return sum;
    }

    public static boolean validateTreeConstruct(int v, int w){
        if(vertices.contains(v) && vertices.contains(w)){
            return false;
        } else{
            vertices.add(v);
            vertices.add(w);
            return true;
        }
    }

    private static class Edge implements Comparable<Edge>{

        int v;
        int w;
        int weight;

        public Edge(int v, int w, int weight){
            this.v = v;
            this.w = w;
            this.weight = weight;
        }

        public int either(){
            return v;
        }

        public int other(int v){
            if(this.v == v){
                return w;
            } else{
                return v;
            }
        }

        public int compareTo(Edge e1){
            if(this.weight>e1.weight){
                return 1;
            } else if(this.weight<e1.weight){
                return -1;
            } else{
                return 0;
            }
        }

    }
}

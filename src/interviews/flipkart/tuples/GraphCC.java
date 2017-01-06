package interviews.flipkart.tuples;

/**
 * Created by siddhahastmohapatra on 05/01/17.
 */
public class GraphCC {

    Graph graph;
    private int[] cc;
    boolean marked[];
    private int counts;

    public GraphCC(Graph graph){
        cc = new int[graph.V()];
        marked = new boolean[graph.V()];
        counts = 0;
        this.graph = graph;
        for(int i=0;i<graph.V();i++){
            if(!marked[i]){
                dfs(i);
                counts++;
            }
        }
    }

    public void dfs(int v){
        marked[v] = true;
        cc[v] = counts;
        for(int w: graph.adj.get(v).adj()){
            if(!marked[w]){
                dfs(w);
            }
        }
    }

    public int roots(){
        return counts;
    }

}

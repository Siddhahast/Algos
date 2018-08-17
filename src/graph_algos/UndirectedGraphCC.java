package graph_algos;

/**
 * Created by siddhahastmohapatra on 16/12/16.
 */
public class UndirectedGraphCC {

    private boolean[] marked;
    private int[] cc;
    private int counts;
    private UndirectedGraph g;

    public UndirectedGraphCC(UndirectedGraph g){
        this.g = g;
        counts = 0;
        marked = new boolean[g.getV()];
        cc = new int[g.getV()];
        for(int i =0;i<g.getV();i++){
            if(!marked[i]){
                dfs(g, i);
                counts++;
            }
        }
    }

    public boolean connected(int v, int w){
        return (cc[v]==cc[w]);
    }

    public int id(int v){
        return cc[v];
    }

    public void dfs(UndirectedGraph g, int v){
        marked[v] = true;
        cc[v] = counts;
        for(int w:g.adj(v)){
            if(!marked[w]){
                dfs(g, w);
            }
        }
    }

    public int getConnectedComponents(){
        return counts;
    }
}

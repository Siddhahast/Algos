package graph_algos;

/**
 * Created by siddhahastmohapatra on 15/12/16.
 */
public class GraphUtil {

    public static int degreeV(Graph G, int v){
        int degree = 0;
        for(int i:G.adj(v)){
            degree++;
        }
        return degree;
    }

    public static int maxDegree(Graph G){
        int maxDegree = 0;
        for(int v = 0; v<G.getV(); v++){
            if(degreeV(G, v)>maxDegree){
                maxDegree = degreeV(G, v);
            }
        }
        return maxDegree;
    }


    public static int selfCounts(Graph G){
        int counts = 0;
        for(int v=0;v<G.getV(); v++){
            for(int w:G.adj(v)){
                if(w==v){
                    counts++;
                }
            }
        }
        return counts/2;
    }


    public static boolean cycleInGraph(Graph graph){
        DepthFirstPaths path = new DepthFirstPaths(graph, 0);


        return false;
    }
}

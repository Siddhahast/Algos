package graph_algos;

/**
 * Created by siddhahastmohapatra on 15/12/16.
 */
public class UndirectedGraphUtil {

    public static int degreeV(UndirectedGraph G, int v){
        int degree = 0;
        for(int i:G.adj(v)){
            degree++;
        }
        return degree;
    }

    public static int maxDegree(UndirectedGraph G){
        int maxDegree = 0;
        for(int v = 0; v<G.getV(); v++){
            if(degreeV(G, v)>maxDegree){
                maxDegree = degreeV(G, v);
            }
        }
        return maxDegree;
    }


    public static int selfCounts(UndirectedGraph G){
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


    public static boolean cycleInGraph(UndirectedGraph graph){
        DepthFirstPaths path = new DepthFirstPaths(graph, 0);


        return false;
    }
}

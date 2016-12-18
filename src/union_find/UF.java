package union_find;

/**
 * Created by siddhahastmohapatra on 18/12/16.
 */
public class UF {

    private int n;
    private int[] points;

    public UF(int n){
        this.n = n;
        points = new int[n];
        for(int i=0;i<n;i++){
            points[i]= i;
        }
    }

    public int root(int p){
        while(p!=points[p]){
            p = points[p];
        }
        return p;
    }

    public void union(int p, int q){
        int pid = root(p);
        int qid = root(q);
        points[pid] = qid;
    }

    public boolean connected(int p, int q){
        return (root(p)==root(q));
    }

    public int find(int p){
        return points[p];
    }

    public void displayPoints(){
        for (int i: points){
            System.out.println(i);
        }
    }
}

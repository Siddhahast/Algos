package interviews.flipkart.com;

/**
 * Created by siddhahastmohapatra on 01/01/17.
 */
public class Vertex<T extends Comparable<T>>  {

    private T data;
    public Vertex[] parents;
    public int nParents = 1;
    public Vertex[] children;
    public int nChildren = 2;

    public Vertex(T t){
        this.data = t;
        this.parents = new Vertex[nParents];
        this.children = new Vertex[nChildren];
    }

    public T getData(){
        return data;
    }

    public void setParent(Vertex x, int index){
        parents[index] = x;
    }

    public void setChildren(Vertex x, int index){
        children[index] = x;
    }

}

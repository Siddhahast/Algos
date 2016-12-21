package graph_algos;

/**
 * Created by siddhahastmohapatra on 18/12/16.
 */
public class Vertex<T>{

    T t;
    Vertex parent;

    public void setParent(Vertex parent){
        this.parent = parent;
    }

    public Vertex(T t){
        this.t = t;
        this.parent = this;
    }

    public T getT(){
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Vertex<?> vertex = (Vertex<?>) o;

        if (t != null ? !t.equals(vertex.t) : vertex.t != null) return false;
        return parent != null ? parent.equals(vertex.parent) : vertex.parent == null;

    }

    @Override
    public int hashCode() {
        int result = t != null ? t.hashCode() : 0;
        result = 31 * result + (parent != null ? parent.hashCode() : 0);
        return result;
    }


    public Vertex getParent(){
        return parent;
    }


}

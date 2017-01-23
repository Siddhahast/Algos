package interviews.flipkart.tuples;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by siddhahastmohapatra on 05/01/17.
 */
public class app {

    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        TupleTree t = new TupleTree();
        for(int i=0;i<N;i++){
            StringTokenizer str = new StringTokenizer(br.readLine());
            char c1 = str.nextToken().charAt(0);
            char c2 = str.nextToken().charAt(0);
            t.addEdge(c1, c2);
        }
        //t.multipleRootsExist();
    }

}

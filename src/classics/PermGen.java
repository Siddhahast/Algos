package classics;

import java.util.ArrayList;
import java.util.List;
/**
 * Created by siddhahastmohapatra on 09/02/17.
 */
public class PermGen {

    private static List<String> colors;
    private static List<String> sizes;
    private static List<String> collars;
    public static void main(String[] args) {

        colors = new ArrayList<String>();
        sizes = new ArrayList<String>();
        collars = new ArrayList<String>();

        List<List<String>> lists = new ArrayList<List<String>>();
        generateLists();

        lists.add(colors);
        lists.add(sizes);
        lists.add(collars);

        List<String> results = new ArrayList<String>();
        String current = "";
        generatePermutations(lists, results, 0, current);

        for(String s: results){
            System.out.println(s);
        }

    }

    private static void generatePermutations(List<List<String>> lists, List<String> result, int depth, String current){

        if(depth == lists.size()){
            result.add(current);
            return;
        }

        for (int i=0;i<lists.get(depth).size();i++){
            generatePermutations(lists, result, depth+1, lists.get(depth).get(i) + " " + current);
        }

    }

    private static void generateLists(){

        colors.add("RED");
        colors.add("GREEN");
        colors.add("BLUE");

        sizes.add("M");
        sizes.add("S");
        sizes.add("L");
        sizes.add("XL");

        collars.add("ROUND");
        collars.add("VEE");

    }

}

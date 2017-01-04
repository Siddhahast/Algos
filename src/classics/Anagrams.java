package classics;

/**
 * Created by siddhahastmohapatra on 03/01/17.
 */
public class Anagrams {

    private static int NUMBERS = 26;

    public static int difference(int[] charCounts1, int[] charCounts2){
        if(charCounts1.length!=charCounts2.length){
            return -1;
        }
        int diff = 0;
        for(int i=0;i<charCounts1.length;i++){
            int d = Math.abs(charCounts1[i] - charCounts2[i]);
            diff = diff + d;
        }
        return diff;
    }

    public static int[] createCharCounts(String input){

        int[] charCounts = new int[NUMBERS];
        int boundary = (int) 'a';
        for(int i=0;i<input.length();i++){
            int code = (int) input.charAt(i) - boundary;
            charCounts[code]++;
        }
        return charCounts;
    }

    public static int anagramDifference(String input1, String input2){

        int[] charCounts1 = createCharCounts(input1);
        int[] charCounts2 = createCharCounts(input2);

        int diff = difference(charCounts1, charCounts2);
        return diff;
    }

    public static void main(String[] args) {
        String input1 = "gaps";
        String input2 = "gape";

        System.out.print(anagramDifference(input1, input2));

    }
}

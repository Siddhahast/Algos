package classics;

/**
 * Created by siddhahastmohapatra on 19/02/17.
 */
public class BoggleGame {

    private static int m = 3;
    private static int n = 3;
    private static String[] dictionary = {"GEEKS", "FOR", "QUIZ", "GO"};

    public static void main(String[] args) {
        char[][] boggle =  {{'G','I','Z'},
                            {'U','E','K'},
                            {'Q','S','E'}};
        boolean[][] visited = new boolean[m][n];
        String s = "";
        findWordUtil(boggle, visited, 0, 0, s);
    }

    private static boolean isWord(String word){
        for (int i=0;i<dictionary.length;i++){
            if(word.equals(dictionary[i])){
                return true;
            }
        }
        return false;
    }

    private static void findWordUtil(char[][] boggle, boolean[][] visisted, int i, int j, String s){

        visisted[i][j] = true;
        s= s+boggle[i][j];
        if(isWord(s)){
            System.out.println(s);
        }

        for (int row = i-1; row<=i+1 && row<m;row++){
            for (int col= j-1;col<=j+1 && col<n;col++){
                if(col>=0 && row>=0 && !visisted[row][col]){
                    findWordUtil(boggle, visisted, row, col, s);
                }
            }
        }

        eraseLast(s);
        visisted[i][j] = false;
    }

    private static void eraseLast(String s){
        if(s.equalsIgnoreCase("")){
            return;
        } else{
            if(s.length()==1){
                s = "";
            } else{
                s = s.substring(0, s.length()-1);
            }
        }
    }

}

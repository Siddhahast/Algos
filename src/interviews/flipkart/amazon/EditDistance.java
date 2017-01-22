package interviews.flipkart.amazon;

/**
 * Created by siddhahastmohapatra on 12/01/17.
 */
public class EditDistance {

    private static int countOps(String str1, String str2, int m, int n){
        int[][] T = new int[m+1][n+1];
        for(int i=1;i<=m; i++){
            for(int j=1;j<=n;j++){
                if(i==0){
                    T[i][j] = j;
                } else if(j==0){
                    T[i][j] = i;
                } else if(str1.charAt(i-1)==str2.charAt(j-1)){
                    T[i][j] = T[i-1][j-1];
                } else{
                    T[i][j] = 1+ min(T[i][j-1], T[i-1][j-1], T[i-1][j]);
                }
            }
        }
        return T[m][n];
    }

    private static int min(int x, int y, int z){
        if(x>z && y>z){return z;}
        if(x>y && z>y){return y;}
        else{return x;}
    }

    public static void main(String[] args) {
        String s1 = "CAT";
        String s2 = "CUT";
        System.out.print(countOps(s1, s2, s1.length(), s2.length()));
    }

}

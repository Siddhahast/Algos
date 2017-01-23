package HackerEarth;

/**
 * Created by siddhahastmohapatra on 11/01/17.
 */


import java.util.*;
import java.io.*;

public class BreakUp {

    private static Map<String, Integer> map = new HashMap<String, Integer>();

    public static void main(String args[] ) throws Exception {
        map.put("19", 0);
        map.put("20", 0);
        map.put("other", 0);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for(int i=0;i<N;i++){
            String message = br.readLine();
            detectDateNight(message);
        }

        System.out.println(getDateNight());

    }

    private static void detectDateNight(String input){
        StringTokenizer str = new StringTokenizer(input);
        String c = str.nextToken();
        char ch = c.charAt(0);
        while(str.hasMoreElements()){
            String s = str.nextToken();
            if(s.equals("19") || s.equals("20")){
                int w = map.get(s)+((ch=='G')?2:1);
                map.put(s, w);
            } else{
                try {
                    if (Integer.valueOf(s) instanceof Number) {
                        if(map.get(s)==null){
                            map.put(String.valueOf(s), (ch=='G')?2:1);
                        } else{
                            int w = map.get(s) + ((ch == 'G') ? 2 : 1);
                            map.put(s, w);
                        }
                    }
                } catch(NumberFormatException ex){

                }
            }
        }
    }

    private static String getDateNight(){
        int max = 0;
        String maxKey = null;
        for(Map.Entry<String, Integer> entry: map.entrySet()){
            if(entry.getValue()>max){
                max = entry.getValue();
                maxKey = entry.getKey();
            }
        }
        if(maxKey.equals("19")){
            return "19";
        } else if(maxKey.equals("20")){
            return "20";
        } else{
            return "No Date";
        }
    }
}


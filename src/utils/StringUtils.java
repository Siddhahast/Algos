package utils;

/**
 * Created by siddhahastmohapatra on 21/10/16.
 */
public class StringUtils {

    public static void capitalizeString(String name){
        if(name== null){
            throw new NullPointerException();
        }
        char ch;
        int c = name.charAt(0);
        if(c>=97 && c<=122){
            c = c-32;
            ch = (char)c;
        }
        StringBuffer buffer = new StringBuffer(name);

    }

}

package array_algos;

import java.util.Map;
import java.util.HashMap;

/**
 * Created by siddhahastmohapatra on 11/04/17.
 */
public enum YesNo {

    Y, N;

    private static final String YES = "yes";
    private static final String NO = "no";

    private static Map<String, YesNo> MAP = new HashMap<String, YesNo>();

    static{

        MAP.put("Yes", YesNo.Y);
        MAP.put("No", YesNo.N);



    }

    public static YesNo getInstance(String code){
        return MAP.get(code);
    }

    public YesNo getCode(String code){
        return MAP.get(code);
    }

}

package stringToInt;


import inordertraversal.Solution;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author: chenhuang
 * @date: 2019/3/10
 * @description:
 */
public class StringToInt {
    private Pattern pattern = Pattern.compile("(([+-]?)[0-9]+)(\\D)*(.*)");

    public static void main(String[] args) {
        StringToInt stringToInt = new StringToInt();
        System.out.println(stringToInt.stringToInt("   -1232fsg"));
    }

    public int stringToInt(String s) {
        String sign = "";
        Long val;
        try {
            Matcher matcher = pattern.matcher(s);
            if (matcher.matches()) {
                sign = matcher.group(2);
                val = Long.valueOf(matcher.group(1));
            }else {
                return 0;
            }
            if(val>Integer.MAX_VALUE || val<Integer.MIN_VALUE)
            {
                throw new NumberFormatException();
            }
            return val.intValue();
        } catch (NumberFormatException e) {
            return sign.equals("-")?Integer.MIN_VALUE:Integer.MAX_VALUE;
        }
    }
}

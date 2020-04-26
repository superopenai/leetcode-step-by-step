package ValueOf;

/**
 * @author superning
 * @Classname Main
 * @Description 第一题实现一个Long类的valueOf（String）方法
 * @Date 2020/4/21 16:03
 * @Created by superning
 */
public class Main {
    public static void main(String[] args) {

        System.out.println(testValueof("-1000"));

    }

    public static Long testValueof(String s) {
        boolean negative = false;
        if (s.charAt(0)=='-'){
            negative=true;
            s =s.substring(1);
        }
        int i = 0, len = s.length();
        int radix = 10;
        long result = 0;
        while (i < len) {
            int digit = Character.digit(s.charAt(i++), radix);
            result *= radix;
            result -= digit;
        }
        return negative ? result : -result;
    }

}
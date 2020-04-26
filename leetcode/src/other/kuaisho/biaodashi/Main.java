package kuaisho.biaodashi;

import java.util.ArrayDeque;

/**
 * @Classname Main
 * @Description 表达式求值 “10+8*3-3*2-5==>10+24-6-5=23”
 * @Date 2020/4/18 11:14
 * @Created by superning
 */
public class Main {
    public static void main(String[] args) {
        String ss = new String("48*65-43+8*1");
        char[] chars = ss.toCharArray();
        ArrayDeque<String> list = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '*' || chars[i] == '/' || chars[i] == '+' || chars[i] == '-') {
                if (sb.length()>0){
                    list.addLast(sb.toString());
                    sb =new StringBuilder();
                }
                if (chars[i] == '+' || chars[i] == '-') {
                    list.addLast(String.valueOf(chars[i]));

                } else {
                    if (chars[i]=='*') {
                        String num1 = list.removeLast();
                        i++;
                        if (chars[i] != '*' || chars[i] != '/' || chars[i] != '+' || chars[i] != '-'){
                            sb.append(chars[i]);
                            i++;
                        }
                        int temp = Integer.parseInt(num1) * Integer.parseInt(sb.toString());
                        list.addLast(String.valueOf(temp));

                    }else {
                        String num1 = list.removeLast();
                        i++;
                        if (chars[i] != '*' || chars[i] != '/' || chars[i] != '+' || chars[i] != '-'){
                            sb.append(chars[i]);
                            i++;
                        }
                        int temp = Integer.parseInt(num1) / Integer.parseInt(sb.toString());
                        list.addLast(String.valueOf(temp));

                    }

                }

            } else {
                sb.append(chars[i]);

            }
        }
        if (sb.length()>0){
            list.addLast(sb.toString());
        }
        System.out.println(list);
        int res =Integer.parseInt(list.removeFirst());
        while (!list.isEmpty()){
            String s = list.removeFirst();
                if ("+".equals(s)){
                    res = res+Integer.parseInt(list.removeFirst());
                }else {
                    res = res-Integer.parseInt(list.removeFirst());
                }
        }
        System.out.println(res);
    }
}

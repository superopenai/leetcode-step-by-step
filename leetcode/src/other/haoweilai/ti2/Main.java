package haoweilai.ti2;

import java.util.Scanner;

/**
 * Created by  IDEA.
 * User: SuperNing
 * Date: 2020/5/20
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        if (s==null){
            System.out.println(0);
            return;
        }
        s= s.trim();
        String[] sp = s.split(" ");
        if (sp.length==1){
            System.out.println(sp[0].length());
        }else {
            System.out.println(sp[sp.length-1].length());
        }


    }
}

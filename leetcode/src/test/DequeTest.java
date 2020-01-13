import java.util.*;

public class DequeTest {
    public static void main(String[] args) {

        String s="anagram";
        String t = "anagram";


        char[] schars = s.toCharArray();
        char[] tchars = t.toCharArray();
        Arrays.sort(schars);
        Arrays.sort(tchars);

        System.out.println(schars);
        System.out.println(tchars);
        System.out.println(schars==tchars);
        System.out.println(schars.equals(tchars));

    }




}

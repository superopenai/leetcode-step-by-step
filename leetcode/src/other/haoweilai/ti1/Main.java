package haoweilai.ti1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by  IDEA.
 * User: SuperNing
 * Date: 2020/5/20
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        String s = scanner.nextLine();
        if (s==null){
            System.out.println(list);
            return;
        }
        String[] split = s.split(" ");
        int target =Integer.parseInt(split[1]);
        String[] nums = split[0].split(",");
        for (String num : nums) {
            list.add(Integer.parseInt(num));
        }
        ArrayList<Integer> res = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            map.put(list.get(i),i);
        }
        for (Integer integer : list) {
            int temp = target - integer;
            if (map.containsKey(temp)&& !map.get(integer).equals(map.get(temp))){
                res.add(map.get(integer));
                res.add(map.get(temp));
                break;

            }
        }
        System.out.println(res);
    }
}

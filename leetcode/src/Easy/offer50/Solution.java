package offer50;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2020/4/11 17:33
 * @Created by superning
 */
class Solution {
    public char firstUniqChar(String s) {
        if(s==null){
            return ' ';
        }
        char[] chars = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for (char aChar : chars) {
            if (map.containsKey(aChar)){
                map.put(aChar,map.get(aChar)+1);
            }else {
                map.put(aChar,1);
            }
        }
        for (char aChar : chars) {
            if (map.get(aChar)==1){
                return aChar;
            }
        }
        return ' ';
    }
}
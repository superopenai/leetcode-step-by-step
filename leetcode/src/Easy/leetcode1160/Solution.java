package leetcode1160;

import java.util.HashMap;

/**
 * @author superning
 * @Classname Solution
 * @Description 1160. 拼写单词
 * @Date 2020/3/17 16:31
 * @Created by superning
 */
class Solution {
    public static int countCharacters(String[] words, String chars) {
        boolean flag ;
        int res =0;
        HashMap<Character, Integer> charMap = new HashMap<>();
        for (char c : chars.toCharArray()) {
            charMap.put(c,charMap.getOrDefault(c,0)+1);
        }
        for (String word : words) {
            flag =true;
            HashMap<Character, Integer> map = new HashMap<>(charMap);
            for (char c : word.toCharArray()) {
                if (!map.containsKey(c)){
                    flag =false;
                    break;
                }
                if (map.containsKey(c)&&map.getOrDefault(c,0)!=0){
                    map.put(c,map.get(c)-1);
                }else{
                    flag=false;
                    break;
                }

            }
            if (flag){
                res+=word.length();
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String[] strings = new String[]{"cat","bt","hat","tree"};
        countCharacters(strings,"atach");
    }
}
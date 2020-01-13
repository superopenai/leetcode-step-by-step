package leetcode49;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> strMap = new HashMap<>();
        for (String str : strs) {
            //先转成数组
            char chars[] = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            //检查哈希表里有没有相应的字母异位词，有就在value中add新的str，没有就添加新key。
            if (!strMap.containsKey(key)) {
                strMap.put(key, new ArrayList<>());
            }
            strMap.get(key).add(str);
        }
        return new ArrayList(strMap.values());

    }
}
package leetcode820;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;

/**
 * @author superning
 * @Classname Solution
 * @Description 820. 单词的压缩编码
 * @Date 2020/3/28 18:34
 * @Created by superning
 */
class Solution {
    public int minimumLengthEncoding(String[] words) {
        // 先按字符串长度进行排序
        Arrays.sort(words, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.length()-o1.length();
            }
        });

        // 然后在进行匹配的计算
//        String sb = new String();
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            if (sb.indexOf(word+"#")==-1){
                sb.append(word).append("#");
            }
        }
        return sb.length();
    }
}
//class Solution {
//    public int minimumLengthEncoding(String[] words) {
//        // 先按字符串长度进行排序
//        Arrays.sort(words, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o2.length()-o1.length();
//            }
//        });
//
//        // 然后在进行匹配的计算
//        String sb = new String();
//        for (String word : words) {
//            if (!sb.contains(word+"#")) {
//                sb = sb.concat(word + "#");
//            }
//        }
//        return sb.length();
//    }
//}








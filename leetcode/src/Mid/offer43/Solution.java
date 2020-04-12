package offer43;

import java.util.Arrays;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2020/4/7 10:16
 * @Created by superning
 */
class Solution {
    public static int countDigitOne(int n) {
        String[] demo = new String[n];
        int cot = 0;
        for (int i = 1; i <= n; i++) {
            if (String.valueOf(i).contains("1")) {
                demo[cot++] = String.valueOf(i);
            }
        }
        int length =cot;
        cot = 0;
        for (int i = 0; i < length; i++) {
            if (demo[i].contains("1")) {

                for (int j = 0; j < demo[i].length(); j++) {
                    if (demo[i].charAt(j) == '1') {
                        cot++;
                    }
                    
                }
            }
        }
        return cot;
    }

//   class Solution {
//    public int countDigitOne(int n) {
//        int res = 0;
//        for (long m = 1; m <= n; m *= 10) {
//            long a = n / m;
//            long b = n % m;
//            res += (a + 8) / 10 * m + (a % 10 == 1 ? b + 1 : 0);
//        }
//        return res;
//    }
//}
}
package yuewen.ti2;

import java.util.*;


public class Solution {
    /**
     *
     * @param ops string字符串ArrayList 操作步骤
     * @return string字符串
     */
    public String doQueue (ArrayList<String> ops) {
        // write code here
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        for (String op : ops) {
            String[] split = op.split(" ");
            int len =split.length;
            if (len==2){
                // push 数字
                    deque.addLast(Integer.parseInt(split[1]));
            }else{
                // 如果栈为空
                if (deque.isEmpty()){
                    sb.append("null").append(",");
                }else {
                    sb.append(deque.removeFirst()).append(",");
                }
            }
        }

        return sb.substring(0, sb.length() - 1);
    }


}
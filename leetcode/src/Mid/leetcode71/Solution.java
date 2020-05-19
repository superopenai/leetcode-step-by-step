package leetcode71;

import java.util.ArrayDeque;
import java.util.ArrayList;

class Solution {
    public String simplifyPath(String path) {
        ArrayDeque<String> stack = new ArrayDeque<>();
        ArrayList<int[]>list= new ArrayList<>();
        int[] ints = new int[2];
        
        list.add(ints);
        // 首先将字符串以 “/” 分隔存储到新的字符数组 str 中
        String[] str = path.split("/");
        for (String s : str) {
            // 如果数组非空,且访问到的是 “..” 则说明要返回上一级,要将当前元素出栈
            if ("..".equals(s)) {
                // 这里用到增强型 for 循环不能同时判断，需要再次判空
                // 而普通 for 循环则可写成( !stack.isEmpty() && s.equals("..") )
                if (!stack.isEmpty()) {
                    stack.pollLast();
                }
                // 如果数组非空并且当前元素不是 “.” 说明当前元素是路径信息，要入栈
            } else if (!"".equals(s) && !".".equals(s)) {
                stack.addLast(s);
            }
        }
        // 如果栈内没有元素说明没有路径信息，返回 “/” 即可
        if (stack.isEmpty()) {
            return "/";
        }
        // 这里用到 StringBuilder 操作字符串，效率高
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.append("/").append(stack.pollFirst());
        }
        return sb.toString();
    }

}
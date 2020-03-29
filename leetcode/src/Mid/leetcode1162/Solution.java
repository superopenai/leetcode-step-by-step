package leetcode1162;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2020/3/29 15:00
 * @Created by superning
 */

//BFS
class Solution {

    public int maxDistance(int[][] grid) {
        int n = grid.length;
        if(n <= 1) {
            return -1;
        }
        int[][] directions = {{0,1}, {1,0}, {0,-1}, {-1,0}};
        Queue<node> queue = new LinkedList<>();
        //首先将所有陆地都放进队列，进行层序遍历
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == 1){
                    queue.offer(new node(i,j));
                }
            }
        }
        //全是陆地或者海洋返回-1
        if(queue.size() == 0 || queue.size() == n*n){
            return -1;
        }

        int len = -1;
        while(!queue.isEmpty()){
            int size = queue.size();
            while(size-- > 0){
                node node = queue.poll();
                int x = node.x;
                int y = node.y;

                for(int[] direction : directions){
                    int x1 = x + direction[0];
                    int y1 = y + direction[1];
                    //只要是海洋就放入队列,填海造陆,为了防止重复，将值变更为2
                    if(x1 >= 0 && x1 < n && y1 >= 0 && y1 < n
                            && grid[x1][y1] == 0){
                        grid[x1][y1] = 2;
                        queue.add(new node(x1,y1));
                    }

                }
            }
            len++;
        }
        //遍历结束，所有的海洋都变为2
        return len;
    }
    static class node{
        int x;
        int y;
        public node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

}





//class Solution {
//    public static int maxDistance(int[][] grid) {
//
//
//        int row =grid.length;
//        int col =grid[0].length;
//        Deque<node> oeacnDeque = new ArrayDeque<>();
//        Deque<node> landDeque = new ArrayDeque<>();
//        for (int i = 0; i < row; i++) {
//            for (int k = 0; k < col; k++) {
//                if (grid[i][k]==1){
//                  landDeque.addLast(new node(i, k));
//                }else{
//                    oeacnDeque.addLast(new node(i, k));
//                }
//            }
//        }
//        if (landDeque.isEmpty()||oeacnDeque.isEmpty()){
//            return -1;
//        }
//        final int[] res = new int[oeacnDeque.size()];
//        Arrays.fill(res,row+col-2);
//        final int[] i = {0};
//        oeacnDeque.forEach(oeacn -> {
//            landDeque.forEach(land -> {
//                int abs = Math.abs(oeacn.x-land.x)+Math.abs(oeacn.y - land.y);
//                res[i[0]] =Math.min(res[i[0]],abs);
//            });
//            i[0] +=1;
//        });
//        Arrays.sort(res);
//        return res[res.length-1];
//    }
//    static class node{
//        int x;
//        int y;
//
//        public node(int x, int y) {
//            this.x = x;
//            this.y = y;
//        }
//    }
//}
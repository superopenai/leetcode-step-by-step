package leetcode994;

import java.util.ArrayDeque;

/**
 * @author superning
 * @Classname Solution
 * @Description TODO
 * @Date 2020/3/4 9:13
 * @Created by superning
 */
public class Solution {
    public int orangesRotting(int[][] grid) {
        ArrayDeque<orange> deque = new ArrayDeque<>();
        int c = grid[0].length;
        int r = grid.length;
        int time = 0;
        //找烂橘子
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (grid[i][j]==2){
                    deque.addLast(new orange(i,j));
                }
            }
        }

        while (!deque.isEmpty()){
            int size = deque.size();
            //每一轮重置flag
            boolean flag =false;
            for (int i = 0; i < size; i++) {
                orange badOrange = deque.removeFirst();
                int x = badOrange.x;
                int y = badOrange.y;

                //感染左边
                if (x>0){
                    if (grid[x-1][y]==1){
                        grid[x-1][y]=2;
                        deque.addLast(new orange(x-1,y));
                        flag=true;
                    }
                }
                //感染右边
                if (x<r-1){
                    if (grid[x+1][y]==1){
                        grid[x+1][y]=2;
                        deque.addLast(new orange(x+1,y));
                        flag=true;
                    }
                }
                //感染下边
                if (y<c-1){
                    if (grid[x][y+1]==1){
                        grid[x][y+1]=2;
                        deque.addLast(new orange(x,y+1));
                        flag=true;
                    }
                }
                //感染上边
                if (y>0){
                    if (grid[x][y-1]==1){
                        grid[x][y-1]=2;
                        deque.addLast(new orange(x,y-1));
                        flag=true;
                    }
                }
            }
            //如果flag 为真 ，就代表有新橘子感染。
            if(flag){
                time+=1;
            }
        }
        //找有没有新鲜橘子
        for (int i = 0; i < r; i++) {
            for (int k = 0; k < c; k++) {
                if (grid[i][k]==1){
                    return -1;
                }
            }
        }
        return time;
    }
}

class orange{
    int x;
    int y;
    public orange(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
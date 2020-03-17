package offer12;

import java.util.Arrays;
import java.util.Collections;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2020/3/16 17:07
 * @Created by superning
 */
class Solution {
    public boolean exist(char[][] board, String word) {
        int rows = board.length;
        int cols = board[0].length;
        char[] words = word.toCharArray();
        if(board == null || rows < 1 || cols < 1 || word == null){
            return false;
        }
        int[] visited = new int[rows*cols];//标记是否访问过

        int count = 0;
        ///循环遍历矩阵，找到起点等于str第一个元素的值，再递归判断四周是否有符合条件的格子
        for(int row=0;row<rows;row++){
            for(int col=0;col<cols;col++){
                if(hasPathCore(board,rows,cols,row,col,words,count,visited)){
                    return true;
                }
            }
        }
        return false;
    }

    boolean hasPathCore(char[][] matrix,int rows,int cols,int i,int j,char[] str,int count,int[] visited){

        int index = i * cols + j;//矩阵对应的下标

        if(i>=rows || i< 0 || j>= cols || j< 0 || matrix[i][j]!=str[count] || visited[index]==1){
            return false;
        }

        if(count == str.length - 1) {
            return true;//字符串已经查找结束，说明找到该路径了
        }
        visited[index] = 1;//标记访问过

        //向四个方向【向左，向右，向上，向下】进行递归查找
        if(hasPathCore(matrix, rows, cols, i - 1, j,     str, count + 1, visited)
                ||hasPathCore(matrix, rows, cols, i + 1, j,     str, count + 1, visited)
                ||hasPathCore(matrix, rows, cols, i,     j - 1, str, count + 1, visited)
                ||hasPathCore(matrix, rows, cols, i,     j + 1, str, count + 1, visited)){
            return true;
        }

        visited[index] = 0;
        return false;
    }
}


////        char[][] chars = {new String("ABCE").toCharArray(),new String("SFCS").toCharArray(),new String("ADEE").toCharArray()};
//
//       char[][] chars = {"a".toCharArray()};
//
//        exist(chars,"ab");
//    }
//
//




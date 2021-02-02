package com.wnswdwy.niuke.others;

/**
 * @author yycstart
 * @create 2021-02-02 12:25
 */
public class _12_Matrix_Path {

    public boolean exist(char[][] board, String word) {
        if(board == null || board.length == 0 || board[0].length == 0)
            return false;
        char[] chars = word.toCharArray();
        boolean[][] visited = new boolean[board.length][board[0].length];
        for(int i = 0; i < board.length; i++)
            for(int j = 0; j < board[0].length; j++)
                if(dfs(board,chars,visited,i,j,0))
                    return true;

        return false;
    }

    private boolean dfs(char[][] board,char[] chars,boolean[][] visited,int i,int j,int start){
        if(i < 0 || i >= board.length || j < 0 || j >= board[0].length
                || chars[start] != board[i][j] || visited[i][j])
            return false;

        if(start == chars.length - 1)
            return true;
        visited[i][j] = true;

        boolean ans = false;
        ans = dfs(board,chars,visited,    i + 1,j,    start + 1)
                ||dfs(board,chars,visited,i - 1,j,    start + 1)
                ||dfs(board,chars,visited,  i , j + 1,start + 1)
                ||dfs(board,chars,visited,  i , j - 1,start + 1);

        visited[i][j] = false;
        return ans;


    }
}

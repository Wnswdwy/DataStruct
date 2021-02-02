package com.wnswdwy.niuke.others;

/**
 * @author yycstart
 * @create 2021-02-02 13:29

 *      13. 机器人的运动范围
 * 题目描述
 *      地上有一个 m 行和 n 列的方格。一个机器人从坐标 (0, 0) 的格子开始移动，
 *      每一次只能向左右上下四个方向移动一格，但是不能进入行坐标和列坐标的数位之和大于 k 的格子。
 *
 *      例如，当 k 为 18 时，机器人能够进入方格 (35,37)，因为 3+5+3+7=18。
 *      但是，它不能进入方格 (35,38)，因为 3+5+3+8=19。请问该机器人能够达到多少个格子？
 */
public class _13_movingCount {

    public int movingCount(int m, int n, int k) {
        boolean[][] visited = new boolean[m][n];
        return dfs(0,0,m,n,k,visited);
    }
    private int dfs(int i,int j,int m,int n,int k,boolean visited[][]){
        if(i < 0 || i >= m || j < 0 || j >= n
                || (i / 10 + i % 10 + j / 10 + j % 10) > k || visited[i][j]){
            return 0;
        }
        visited[i][j] = true;
        return dfs(i - 1, j, m, n, k, visited)
                + dfs(i + 1, j, m, n, k, visited)
                + dfs(i, j + 1, m, n, k, visited)
                + dfs(i, j - 1, m, n, k, visited) + 1;
    }
}

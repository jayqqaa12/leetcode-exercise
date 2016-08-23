package com.jayqqaa12.other;

import java.util.LinkedList;
import java.util.List;


/**
 * 同 no.51
 *
 * 这次只求不同排列的数量
 *
 * 难度3星
 */
public class Solution52 {

    char[][] board;
    int n;
    int totalCnt;
    

    public int totalNQueens(int n) {
        
        board = new char[n][n];
        this.n = n;
        
        for (int i=0; i<n; i++) 
            for (int j=0; j<n; j++)
                board[i][j] = '.';
            
        List<String> path = new LinkedList<>();
        totalCnt = 0;
        
        dfs(n, 0, path);
        
        return totalCnt;
    }
    
    void dfs(int n, int start, List<String> path) {
        if (path.size() == n) {
            totalCnt++;
            return;
        }
        
        for (int i=0; i<n; i++) {
            if (!isValid(start, i)) {
                continue;
            }
            board[start][i] = 'Q';
            String str=new String(board[start]);
            path.add(str);
            dfs(n, start+1, path);
            path.remove(path.size()-1);
            board[start][i] = '.';
        }
    }
    
    boolean isValid(int row, int col) {
        for (int i=0; i<n; i++) {
            if (board[i][col] == 'Q')
                return false;
        }

        for (int i=0; i<n; i++) {
            if (board[row][i] == 'Q')
                return false;
        }
        
        for (int i=row, j=col; i>=0 && j>=0; i--, j--) {
            if (board[i][j] == 'Q')
                return false;
        }
        
        for (int i=row, j=col; i<n && j<n; i++, j++) {
            if (board[i][j] == 'Q')
                return false;
        }
        
        for (int i=row, j=col; i<n && j>=0; i++, j--) {
            if (board[i][j] == 'Q')
                return false;
        }
        
        for (int i=row, j=col; i>=0 && j<n; i--, j++) {
            if (board[i][j] == 'Q')
                return false;
        }
        
        return true;
    }
}
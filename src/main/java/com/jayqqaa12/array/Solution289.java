package com.jayqqaa12.array;


/**
 * 给定一个由0，1组成的矩阵，每一个元素表示一个细胞的存活，1存活，0死亡，其中下一次更新每个细胞的存活由上、下、左、右、左上、左下、右上、右下，八个细胞决定，存活规则如下：
 * 1、周围存活细胞小于2个，则死亡。
 * 2、周围存活细胞2个或3个，则存活到下一次更新。
 * 3、周围存活细胞3个以上，则死亡。
 * 4、周围存活细胞3个的死细胞，将会成为一个活细胞。
 *
 *
 * 计算下一个状态 存活的情况
 *
 * 难度2星
 *
 */
public class Solution289 {
    public void gameOfLife(int[][] board) {
        if(board == null || board.length == 0) return;
        int m = board.length, n = board[0].length;

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                int lives = liveNeighbors(board, m, n, i, j);
                // In the beginning, every 2nd bit is 0;
                // So we only need to care about when the 2nd bit will become 1.
                if(board[i][j] == 1 && lives >= 2 && lives <= 3) {
                    board[i][j] = 3; // Make the 2nd bit 1: 01 ---> 11
                }
                if(board[i][j] == 0 && lives == 3) {
                    board[i][j] = 2; // Make the 2nd bit 1: 00 ---> 10
                }
            }
        }

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                board[i][j] >>= 1;  // Get the 2nd state.
            }
        }
    }

    public int liveNeighbors(int[][] board, int m, int n, int i, int j) {
        int lives = 0;
        for(int x = Math.max(i - 1, 0); x <= Math.min(i + 1, m - 1); x++) {
            for(int y = Math.max(j - 1, 0); y <= Math.min(j + 1, n - 1); y++) {
                lives += board[x][y] & 1;
            }
        }
        lives -= board[i][j] & 1;
        return lives;
    }
}
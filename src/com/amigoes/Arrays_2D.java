package com.amigoes;

import java.util.Arrays;

public class Arrays_2D {
    public static void main(String[] args) {
        char[][] board =new char[3][3];
        for (int i=0 ;i<3;i++){
            for(int j=0;j<3;j++){
                board[i][j]='-';
            }
        }

        board[0][0]='0';
        board[1][0]='0';
        board[2][0]='0';
        board[0][1]='x';
        board[1][1]='x';
        board[1][2]='x';
        board[0][2]='0';
        board[2][1]='0';
        System.out.println(Arrays.deepToString(board));
    }
}

package com.sagar.function.concept;

class Solution {
    static int[][] directions={{0,1},{0,-1},{1,0},{-1,0}};
    public boolean exist(char[][] board, String word) {
        int row=board.length;
        int col=board[0].length;

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(board[i][j]==word.charAt(0)){
                    if(find(board,i,j,0,word)) return true;
                }
            }
        }
        return false;
    }

    static boolean find(char[][] board, int i,int j,int wordIndex,String word){

        if(word.length()==wordIndex) return true;

        if(i<0 || j<0 || i>=board.length || j>=board[0].length || board[i][j]=='$') return false;

        if(word.charAt(wordIndex)!=board[i][j]) return false;

        char temp=board[i][j];
        board[i][j]='$';
        for(int dir=0;dir<directions.length;dir++){
            int newI=i+directions[dir][0];
            int newJ=j+directions[dir][1];
            if(find(board,newI,newJ,wordIndex+1,word)) return true;
        }
        board[i][j]=temp;

        return false;

    }

}

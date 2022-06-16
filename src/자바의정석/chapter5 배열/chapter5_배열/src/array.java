import java.util.Arrays;

public class array {
    public static void main(String[] args) {
//        int[] score = {100,90,80,70,60} ;
//        int[] score1 = new int[] {100,90,80,70,60};
//
//        System.out.println("매개변수의 개수:" + args.length);
//        for (int i=0;i<args.length;i++) {
//            System.out.println("args["+i+"] =\"");
//        }

        final int SIZE = 10;
        int x=0,y=0;

        int[][] board = new int[SIZE][SIZE]; //입력한 좌표 표시
        int[][] shipBoard = new int[][]{   //상대방의 배의 위치
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0}
        };

        for(int i=1;i<SIZE;i++) {
            board[0][i] = board[i][0] = i;  //행과열 표시 board에
        }
       // System.out.println(Arrays.toString(board));
        System.out.println(Arrays.deepToString(board));





    }
}

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.TransferQueue;

public class array {
    public static void main(String[] args) {
//        int[] score = {100,90,80,70,60} ;
//        int[] score1 = new int[] {100,90,80,70,60};
//
//        System.out.println("매개변수의 개수:" + args.length);
//        for (int i=0;i<args.length;i++) {
//            System.out.println("args["+i+"] =\"");
//        }

//        final int SIZE = 10;
//        int x=0,y=0;
//
//        int[][] board = new int[SIZE][SIZE]; //입력한 좌표 표시
//        int[][] shipBoard = new int[][]{   //상대방의 배의 위치
//                {1, 0, 0, 0, 0, 0, 0, 0, 0},
//                {0, 0, 0, 0, 0, 0, 0, 0, 0},
//                {0, 0, 0, 0, 0, 0, 0, 0, 0},
//                {0, 0, 0, 0, 0, 0, 0, 0, 0},
//                {0, 0, 0, 0, 0, 0, 0, 0, 0},
//                {0, 0, 0, 0, 0, 0, 0, 0, 0},
//                {0, 0, 0, 0, 0, 0, 0, 0, 0},
//                {0, 0, 0, 0, 0, 0, 0, 0, 0},
//                {0, 0, 0, 0, 0, 0, 0, 0, 0}
//        };
//
//        for(int i=1;i<SIZE;i++) {
//            board[0][i] = board[i][0] = i;  //행과열 표시 board에
//        }
//       // System.out.println(Arrays.toString(board));
//    //    System.out.println(Arrays.deepToString(board));
//        Scanner scanner = new Scanner(System.in);
//
//        while (true) {
//            System.out.printf("입력");
//            String input = scanner.nextLine(); //입력받기
//
//            x = input.charAt(0) -'0';
//            y = input.charAt(1) -'0';   //char에서 '0'을 빼면 문자가 숫자로 바뀜 형변환
//           // System.out.println(x);
//            //System.out.println(y);
//
//            board[x][y] = shipBoard[x-1][y-1] ==1 ? 'O' : 'X';
//
//            for(int i=0;i<SIZE;i++) {
//                System.out.println(Arrays.toString(board[i]));
//            }
//            System.out.println();
//
//
//        }

        //빙고판
//        final int SIZE = 5;
//        int x = 0, y = 0, num = 0;
//
//        int[][] bingo = new int[SIZE][SIZE];
//        Scanner scanner = new Scanner(System.in);
//
//        for (int i = 0; i < SIZE; i++) {
//            for (int j = 0; j < SIZE; j++) {
//                bingo[i][j] = i * SIZE + j + 1;
//            }
//        }
//        //for(int i=0;i<SIZE;i++) {
//        //      System.out.println(Arrays.toString(bingo[i]));
//        //}
//
//        //빙고판 섞기기
//        for (int i=0;i<SIZE;i++) {
//            for(int j=0;j<SIZE;j++){
//                x = (int)(Math.random()*SIZE);
//                y = (int)(Math.random()*SIZE);
//
//                int tmp = bingo[i][j];
//                bingo[i][j] = bingo[x][y];
//                bingo[x][y] = tmp;
//            }
//        }
//
//
//
//        }



    }
}

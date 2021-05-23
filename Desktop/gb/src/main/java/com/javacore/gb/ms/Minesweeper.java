package com.javacore.gb.ms;

import java.util.Random;
import java.util.Scanner;

public class Minesweeper {


    private static final  int BOARD_HEIGHT =10;
    private static final  int BOARD_WIDTH =10;
    private static final  int MINES_COUNT =10;
    private static final  int MINE =1000;
    private static final  int EMPTY =0;
    private static final  int CELL_OPEN = 1;
    private static final  int CELL_CLOSE =0;
    private static final  int CELL_FLAG  = -1;

    public static void main(String[] args) {
        boolean win = play();
        if(win) {
            System.out.println("Congratulations you have  won!!!");
        } else {
            System.out.println("Booom!!! You lost");
        }
    }

    private static boolean play() {
        int[][] board = generateBoard();
        int[][] moves = new int[BOARD_HEIGHT][BOARD_WIDTH];
        boolean isPassMove;
        boolean win;
        do {
            win = isWiner(moves);
            isPassMove =  makeMove(board, moves);
        }while (isPassMove && !win);
        return isPassMove;
    }

    private static boolean isWiner(int[][] moves) {
        int openCells = 0;
        for (int[] lines : moves) {
            for (int cell : lines) {
                if (cell == CELL_OPEN) {
                    openCells++;
                }
            }
         }
        return openCells + MINES_COUNT == BOARD_HEIGHT * BOARD_HEIGHT;
        


    }

    private static boolean makeMove(int[][] board, int[][] moves) {
        printBoard(board, moves);

        Scanner scanner = new Scanner(System.in);
        int row, line;
        boolean flag = false;
        while (true) {
            System.out.println("Your move: ");
            String move = scanner.nextLine().trim().toUpperCase();
            if (move.length() == 2 || move.length() == 3) {
                row = move.charAt(0) - 'A';
                line = move.charAt(1) - '0';
                if (move.length() == 3) {
                    flag = move.charAt(2) == '*';
                }
                if (row < BOARD_WIDTH && row >= 0 && line < BOARD_HEIGHT && line >= 0 )
                break;
            }
            System.out.println("Wrong move!!! :(");
        }
//        System.out.printf("row = %d; line  = %d; flag = %b", row, line, flag);

        if (flag) {
            moves[line][row] = CELL_FLAG;
            return true;
        }

        if (board[line][row] != MINE) {
            moves[line][row] = CELL_OPEN;
            return true;
         }

        return false;
    }

    private static void printBoard(int[][] board, int[][] moves) {
        System.out.print("   ");
        for (char i = 'A'; i < 'A' + BOARD_WIDTH ; i++) {
            System.out.print(" " + i);
        }
        System.out.println();
        for (int i = 0; i < BOARD_HEIGHT; i++) {
            System.out.printf("%3d",i);
            for (int j = 0; j <BOARD_WIDTH ; j++) {
                if (moves[i][j] == CELL_CLOSE) {
                    System.out.print("[]");
                    continue;
                }

                if (moves[i][j] == CELL_FLAG) {
                    System.out.print("+");
                    continue;
                }

                switch (board[i][j]) {
                    case EMPTY:
                        System.out.print(" .");
                        break;
                    case MINE:
                        System.out.print(" *");
                        break;
                    default:
                        System.out.printf("%2d",board[i][j]);

                }
            }
            System.out.println();

        }

    }

    private static int[][] generateBoard() {
        int[][] board = new int[BOARD_HEIGHT][BOARD_WIDTH];
        placeMines(board);
        calculateMines(board);
        return board;
    }

    private static void placeMines(int[][] board) {
        Random random = new Random();
        int mines = MINES_COUNT;
        while (mines > 0) {
            int x, y ;
            do {
                x = random.nextInt(BOARD_HEIGHT);
                y = random.nextInt(BOARD_WIDTH);
            } while (board[x][y] == MINE);
            board[x][y] = MINE;
            mines--;
        }
    }

    private static void calculateMines(int[][] board) {
        for (int i = 0; i < BOARD_HEIGHT; i++) {
            for (int j = 0; j <BOARD_WIDTH ; j++) {
                if (board[i][j] == MINE) {
                    continue;
                }
                board[i][j] = calculateMinesAround(board, i, j);

            }

        }
    }

    private static int calculateMinesAround(int[][] board, int i, int j) {
        int mCount = 0;
        for (int k = i - 1; k < i + 1 ; k++) {
            for (int l = j - 1; l < j + 1 ; l++) {
                if (k < 0 ||  k >= BOARD_HEIGHT || l < 0 || l >= BOARD_WIDTH) {
                    continue;
                }
                if (board[k][l] == MINE) {
                    mCount++;
                }
            }
        }
        return mCount;
    }
}

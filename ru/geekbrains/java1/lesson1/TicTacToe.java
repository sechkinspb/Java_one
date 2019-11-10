package ru.geekbrains.java1.lesson1;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    private static char[][] field;
    private static int fieldSizeX;
    private static int fieldSizeY;
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final Random RANDOM = new Random();
    private static final char DOT_HUMAN = 'X';
    private static final char DOT_AI = 'O';
    private static final char DOT_EMPTY = '.';

    private static void initField() {
        fieldSizeX = 3;
        fieldSizeY = 3;
        field = new char[fieldSizeY][fieldSizeX];
        for (int i = 0; i < fieldSizeY; i++) {
            for (int j = 0; j < fieldSizeX; j++) {
                field[i][j] = DOT_EMPTY;
            }
        }
    }
    private static void showField() {
        for (int i = 0; i < fieldSizeY; i++) {
            System.out.print("|");
            for (int j = 0; j < fieldSizeX; j++) {
                System.out.print(field[i][j] + "|");
            }
            System.out.println();
        }
        System.out.println("-------");
    }
    private static void humanTurn() {
        int x;
        int y;
        do {
            System.out.printf("Введити координаты X и Y (от 1 до %d) через %s>>>", fieldSizeX, "пробел");
            x = SCANNER.nextInt() - 1;
            y = SCANNER.nextInt() - 1;
        } while (!isValidCell(x, y) || !isEmptyCell(x, y));
        field[y][x] = DOT_HUMAN;
    }

    private static boolean isValidCell(int x, int y) {
        return x >= 0 && x < fieldSizeX && y >= 0 && y < fieldSizeY;
    }
    private static boolean isEmptyCell(int x, int y) {
        return field[y][x] == DOT_EMPTY;
    }
    private static void aiTurn() {
        int x;
        int y;
        do {
            x = RANDOM.nextInt(fieldSizeX);
            y = RANDOM.nextInt(fieldSizeY);
        } while (!isEmptyCell(x, y));
        field[y][x] = DOT_AI;
    }
    private static boolean checkWin(char c){
        int checksum = fieldSizeX;
        int check1 = 0;
        int check2 = 0;
        for(int i = 0; i < fieldSizeY; i++) {                                               // <<< this is bad =(
            if (field[i][0] == c && field[0][1] == c && field[0][2] == c) return true;      //
            if (field[0][i] == c && field[1][i] == c && field[2][i] == c) return true;      //
        }                                                                                   //
        for (int k = 0; k < fieldSizeY; k++){
            for(int j = 0; j < fieldSizeX; j++){
                if( k == j && field[k][j] == c ){
                    check1 = check1 + 1;
                }
                if(k + 1 == fieldSizeX - j && field[k][j] == c){
                    check2 = check2 + 1;
                }
            }

        }
        if(check1 == checksum || check2 == checksum){
            return true;
        }
     return false;
    }
//    private static boolean checkWin(char c) {
//        if (field[0][0] == c && field[0][1] == c && field[0][2] == c) return true;
//        if (field[1][0] == c && field[1][1] == c && field[1][2] == c) return true;
//        if (field[2][0] == c && field[2][1] == c && field[2][2] == c) return true;
//
//        if (field[0][0] == c && field[1][0] == c && field[2][0] == c) return true;
//        if (field[0][1] == c && field[1][1] == c && field[2][1] == c) return true;
//        if (field[0][2] == c && field[1][2] == c && field[2][2] == c) return true;
//
//        if (field[0][0] == c && field[1][1] == c && field[2][2] == c) return true;
//        if (field[0][2] == c && field[1][1] == c && field[2][0] == c) return true;
//        return false;
//    }
    private static boolean isDraw() {
        for (int i = 0; i < fieldSizeY; i++) {
            for (int j = 0; j < fieldSizeX; j++) {
                if (field[i][j] == DOT_EMPTY)
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        initField();
        showField();
        while (true) {
            humanTurn();
            showField();
            if (checkWin(DOT_HUMAN)) {
                System.out.println("Вы выиграли");
                break;
            }
            if (isDraw()) {
                System.out.println("Ничья!");
                break;
            }
            aiTurn();
            showField();
            if (checkWin(DOT_AI)) {
                System.out.println("Вы проиграли!");
                break;
            }
            if (isDraw()) {
                System.out.println("Ничья!");
                break;
            }
        }

    }

    private static void method(String s, Object... b) {
        b[0] = 1;
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println();
    }


}
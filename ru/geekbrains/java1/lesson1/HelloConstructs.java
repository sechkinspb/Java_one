package ru.geekbrains.java1.lesson1;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.lang.reflect.Array;
import java.util.Arrays;

public class HelloConstructs {
    public static void main(String[] args){
        int[] testBalance = {5,5,5,5,5,5,5,5};
        int[] zeroAndOne = {0, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 1, 0,};
        int[] arrSize8 = new int[8];
        int[] arrSize12 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int[][] arrSquare = new int[10][10];
        System.out.println("Задание 1");
        System.out.println(Arrays.toString(zeroAndOne));
        binarInverter(zeroAndOne); //task 1, invert 1 to 0 or 0 to 1
        System.out.println("Задание 2");
        autoFill(arrSize8); // task2, auto fill arrays
        System.out.println("Задание 3");
        System.out.println(Arrays.toString(arrSize12));
        x2(arrSize12); //task3, if [i] < 6 then x2
        System.out.println("Задание 4");
        minInArr(arrSize8);
        maxInArr(arrSize8);
        System.out.println("Задание 5");
        autoFillSquare(arrSquare);
        System.out.println("Задание 6");
        System.out.println(checkBalance(testBalance));










    }

    public static boolean checkBalance(int[] nameArr){
        int amountArr = 0;
        int halfAmount = 0;
        for(int i = 0; i < nameArr.length; i++){
            amountArr = amountArr + nameArr[i];

        }
        if(amountArr % 2 == 0){
            for(int i = 0; halfAmount != (amountArr / 2); i++){
                halfAmount = halfAmount + nameArr[i];
            }
        }

        return halfAmount == (amountArr / 2);

    }
    public static void autoFillSquare(int[][] nameArr){
        for (int i = 0; i < nameArr.length; i++){
            for(int j = 0; j < nameArr[i].length; j++){
                if( i == j ){
                    nameArr[i][j] = 1;
                }
                if(i + 1 == nameArr.length - j){   // +1    т.к нумерация массива с 0, а не с 1.
                    nameArr[i][j] = 1;
                }
            }
            System.out.println(Arrays.toString(nameArr[i]));

        }
    }
    public static void maxInArr(int [] nameArr){

        int max = nameArr[0];
        for ( int i = 0; i < nameArr.length; i++){
            if(nameArr[i] > max){
                max = nameArr[i];
            }

        }
        System.out.println("Максимальное число массива "+ max);
    }
    public static void minInArr(int [] nameArr){
        int min = nameArr[0];
        for ( int i = 0; i < nameArr.length; i++){
            if(nameArr[i] < min){
                min = nameArr[i];
            }

        }
        System.out.println("Минимальное число массива "+ min);
    }
    public static void x2(int[] nameArr){
        for (int i = 0; i < nameArr.length; i++){
            if(nameArr[i] < 6){
                nameArr[i] = nameArr[i]*2;
            }
        }
        System.out.println(Arrays.toString(nameArr));
    }
    public static void autoFill(int[] nameArr){
        nameArr[0] = 1;
        for (int i = 1; i < nameArr.length; i++){
            nameArr[i] = nameArr[i - 1] + 3;
        }
       System.out.println(Arrays.toString(nameArr));
    }
    public static void binarInverter(int[] nameArr){
        for (int i = 0; i < nameArr.length; i++){
            if (nameArr[i] == 0){
                nameArr[i] = 1;
            }
            else if (nameArr[i] == 1){
                nameArr[i] = 0;
            }
            else {
                break;
            }
        }
        System.out.println(Arrays.toString(nameArr));


    }



}
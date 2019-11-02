package ru.geekbrains.java1.lesson1;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.lang.reflect.Array;
import java.util.Arrays;

public class HelloConstructs {
    public static void main(String[] args){
        int[] zeroAndOne = {0, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 1, 0,};
        int[] arrSize8 = new int[8];
        int[] arrSize12 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(zeroAndOne));

        binarInverter(zeroAndOne); //task 1, invert 1 to 0 or 0 to 1
        autoFill(arrSize8); // task2, auto fill arrays
        x2(arrSize12); //task3, if [i] < 6 then x2





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
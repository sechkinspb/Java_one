package ru.geekbrains.java1.lesson1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class HelloConstructs {
    public static void main(String[] args){
        int[] zeroAndOne = {0, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 1, 0,};
        System.out.println(Arrays.toString(zeroAndOne));

        binarInverter(zeroAndOne); //task 1, invert 1 to 0 or 0 to 1

//


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
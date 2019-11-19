package ru.geekbrains.java1.lesson5;

public class Main {

    public static void main(String[] args){
        dog a = new dog("Chelsi", "White");
        cat b = new cat("Nusha", "Grey");
        bird c = new bird("CarCar", "Black");
        horse d = new horse("Igogo", "Red");
        animals[] zoo = {a, b, c, d};


        toJump(zoo,100f );

    }

    public static void toJump(animals[] arr, float a){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].jump <= a){
                System.out.println(arr[i].name + " прыгнул");
            }
            else System.out.println(arr[i].name + "  не прыгнул");



        }
    }
}

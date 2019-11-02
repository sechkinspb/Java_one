package ru.geekbrains.java1.lesson1;

public class HelloWorld {


    public static void main(String[] args){ //task 1
        String s = "Сергей";
        //vars(); //task 2
        System.out.println(task3(5,2,1,3)); // calculate a*(b+(c/d))
        System.out.println(task4(10, 5)); //task 10and20
        task5(5); //positive or negative
        System.out.println(task6(-1)); //is negative
        System.out.println(task7(s)); //print Hello, name
        task8(2020); // what is year this






    }

    private static void vars() {
        byte a = 127;
        short b = 32767;
        int c = 2147483647;
        long d = 9223372036854775807L;

        float pi = 3.14f;
        double long_pi = 3.141592653589793238462643;
        char e = 65535;


        //System.out.println(e+1);
        //System.out.println(s);
    }

    public static float task3(int a, int b, int c, int d){
        float e = a;
        float f = b;
        float g = c;
        float h = d;
        return  e*(f+(g/h));
    }

    public static boolean task4(int a, int b){
        int c = 10;
        int d = 20;
        return (c <= a + b & a + b <= d);
    }

    public static void task5( int a){
        if (a >= 0){
            System.out.println(a+" это положительное число.");
        }
        else
            System.out.println(a+" это отрицательное число");
    }

    public static boolean task6(int a){
        return (a < 0);
    }

    public  static String task7(String a){
        return ("Привет, "+a+'!');

    }

    public static void task8(int a){
        if (a % 100 == 0 & a % 400 == 0 & a != 0){
            System.out.println(a+" год високосный.");
        }
        else if (a % 4 == 0 & a % 100 != 0 & a != 0){
            System.out.println(a+" год високосный.");
        }
        else if (a <= 0 ){
            System.out.println("Укажите год Н.Э");
        }
        else
            System.out.println(a+ " невисокосный год.");
    }


}

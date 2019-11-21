package ru.geekbrains.java1.lesson6;

import java.io.*;
import java.util.Random;

public class Main {
    public static void main(String[] args){
        getTxtFile("txt1", 100);
        getTxtFile("txt2", 50);
        gluing("txt1.txt", "txt2.txt", "result");
//        try {
//            InputStream in;
//            OutputStream out;
//
//            FileOutputStream fout = new FileOutputStream("file.txt", true);
//            String msg = "HelloWorld";
//            fout.write(msg.getBytes());
//            fout.close();
//
//            FileInputStream fin = new FileInputStream("file.txt");
//            int i;
//            while((i = fin.read()) != -1){
//                System.out.print((char) i);
//            }
//            fin.close();
//
//
//
//        }catch (IOException e){
//            e.printStackTrace();
//        }
//

    }
    public static void getTxtFile(String fileName, int size){
        //float startTime = System.nanoTime();
        try {
            Random random = new Random();
            OutputStream out;
            FileOutputStream fout = new FileOutputStream(fileName+".txt", true);
            PrintStream ps = new PrintStream(fout);
            for(int i = 0; i < size; i++){
                fout.write(i);
            }
            fout.close();

        }catch (IOException e){
            e.printStackTrace();
        }
        //float finishTime = (startTime - System.nanoTime() * 0.000000001f);
        //System.out.println("Sec : " + finishTime);

    }
    public static void gluing(String fileName1, String fileName2, String ResultFile){

        try{
            InputStream in;
            OutputStream out;
            FileInputStream fin1 = new FileInputStream(fileName1);
            FileInputStream fin2 = new FileInputStream(fileName2);
            FileOutputStream outf = new FileOutputStream(ResultFile + ".txt");
            int i;
            while((i = fin1.read()) != -1){
                outf.write(i);
            }
            fin1.close();
            int b;
            while((b = fin2.read()) != -1){
                outf.write(b);
            }
            fin2.close();
            outf.close();

        }catch (IOException e){
            e.printStackTrace();

        }
    }
}

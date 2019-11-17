package ru.geekbrains.java1.lesson4;

import java.util.Calendar;
import java.util.Random;

public class Employee{

    Calendar now = Calendar.getInstance();
    int thisYear = now.get(Calendar.YEAR);
    String name;
    String position;
    String tel;
    int salary;
    int birthday;
    int id;

    public Employee(String name, String position, String tel, int salary, int birthday){
        this.name = name;
        this.position = position;
        this.tel = tel;
        setSalary(salary);
        setBirthday(birthday);
        //setID();
    }

    private void setBirthday(int birthday){
        if(birthday < thisYear  && birthday > thisYear - 65){
            this.birthday = birthday;
        }
        else{
            this.birthday = 0;
            System.out.println("Укажите правильный год рождения");
        }
    }

    public String getName(){
        return name;
    }
    public String getPosition(){
        return position;
    }
    public String getTel(){
        return tel;
    }
    public int getSalary(){
        return salary;
    }
    public int  getAge(){
        return thisYear - birthday;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getID(){
        return id;
    }
//    private setID();{
//        //сгенерировать id
//        //проверить id на уникальность
//        //если id уникален присвоить, если нет повторяем цикл
//        //
//        this.id = id;
//
//    }
}

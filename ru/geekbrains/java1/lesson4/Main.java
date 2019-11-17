package ru.geekbrains.java1.lesson4;

import java.time.Year;
import java.util.Arrays;
import java.util.Calendar;

public class Main {
    public static void main(String[] args){
        //Random random = new Random();
        Calendar now = Calendar.getInstance();
        int thisYear = now.get(Calendar.YEAR);
        Employee[] arrEmpl = new Employee[5];
        arrEmpl[0] = new Employee("Змеегорынович Змей Змеевич", "Ответственный за пожаробезопасность", "Стучать черпаком по ведру пока не прилетит", 100500, 1985);
        arrEmpl[1]= new Employee("Дарт Вейдер Иванович", "Астроном", "112", 95000, 1989);
        arrEmpl[2]= new Employee("Двортерьерова Челси Лабрадоровна", "Утилизатор пищевых отходов", "Гав гав гав", 500, 2016);
        arrEmpl[3]= new Employee("Наполео́н I Бонапа́рт", "Кондитер", "123", 35000, 1967);
        arrEmpl[4]= new Employee("Иванов Иван Иванович", "плагиатор", "+7999999999", 52000, 1963);
//        checkOverAge(arrEmpl, 40);
//        salIncrease(arrEmpl, 45, 5000);
//        checkOverAge(arrEmpl, 40);
//        System.out.println(arrEmpl[0].getName());
    }
    private static void checkOverAge(Employee[] arr, int year){
        for(int i = 0; i < arr.length; i++) {
            if (arr[i].getAge() > year) {
                System.out.println(arr[i].getName() + " " + arr[i].getPosition() + " " + arr[i].getTel() + ' ' + arr[i].getSalary() + " " + arr[i].getAge());
            }
        }

    }
    private static void salIncrease(Employee[] arr, int year, int bonus){
        for(int i = 0; i < arr.length; i++){
            if(arr[i].getAge() > year){
                int old = arr[i].getSalary();
                arr[i].setSalary(old + bonus);
            }
        }
    }
//    public boolean checkID(Employee[] arr, int id){
//        for(int i = 0; i < arr.length; i++){
//            if(id == arr[i].getID()){
//                return false;
//            }
//        }
//        return true;
//    }

//    public static int genID(){
//        int id = random.nextInt(100);
//        return id;
//    }

}

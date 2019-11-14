package ru.geekbrains.java1.lesson5;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

public class animals {

    protected String  name;
    protected String color;
    protected int run;
    protected int swim;
    protected float jump;
    protected animals (String name, String color){
        this.name = name;
        this.color = color;
    }
    protected void jump(int a){
        System.out.println(name + "перепрышнул через планку" + a + " метров");
    }
    protected void swim(int a){
        System.out.println(name + "проплыл " + a + "метров");
    }

    protected void run(int a){
        System.out.println(name + "пробежал " + a + "метров");
    }
    public void setJump(int a){
        jump(a);
    }
    public void setSwim(int a){
        swim(a);
    }
    public void setRun(int a){
        run(a);
    }

}

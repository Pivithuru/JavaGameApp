package com.app.classes.bean;

import com.app.interfaces.NormalFighter;

/**
 * Created by pivithuru on 4/3/17 3:00 PM.
 */
public class Princess implements NormalFighter {

    private String name;
    private int age;
    private String country;

    @Override
    public void eat() {
        System.out.println("Princess " + name + " eat something");
    }

    @Override
    public void talk() {
        System.out.println("Princess " + name + " talk something");
    }

    @Override
    public void arrowFight() {
        System.out.println("Princess " + name + " fight with dragon using arrows");
    }

    @Override
    public void swordFight() {
        System.out.println("Princess " + name + " fight with dragon using sword");
    }

    public void dance() {
        System.out.println("Princess " + name + " dance to the music");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0)
            this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

}

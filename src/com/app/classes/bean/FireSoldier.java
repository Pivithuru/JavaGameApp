package com.app.classes.bean;

import com.app.interfaces.NormalFighter;
import com.app.interfaces.SpecialFighter;

/**
 * Created by pivithuru on 4/3/17 2:31 PM.
 */
public class FireSoldier implements NormalFighter, SpecialFighter {

    private String name;
    private int age;
    private String country;

    @Override
    public void eat() {
        System.out.println("Fire soldier " + name + " eat something");
    }

    @Override
    public void talk() {
        System.out.println("Fire soldier " + name + " talk something");
    }

    @Override
    public void arrowFight() {
        System.out.println("Fire soldier " + name + " fight with dragon using arrows");
    }

    @Override
    public void swordFight() {
        System.out.println("Fire soldier " + name + " fight with dragon using sword");
    }

    @Override
    public void fireFight() {
        System.out.println("Fire soldier " + name + " fight with dragon using fire");
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
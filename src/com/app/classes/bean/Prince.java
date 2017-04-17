package com.app.classes.bean;

import com.app.interfaces.NormalFighter;
import com.app.interfaces.SpecialFighter;

/**
 * Created by pivithuru on 4/3/17 2:52 PM.
 */
public class Prince implements NormalFighter, SpecialFighter {

    private String name;
    private int age;
    private String country;

    @Override
    public void eat() {
        System.out.println("Prince " + name + " eat something");
    }

    @Override
    public void talk() {
        System.out.println("Prince " + name + " talk something");
    }

    @Override
    public void arrowFight() {
        System.out.println("Prince " + name + " fight with dragon using arrows");
    }

    @Override
    public void swordFight() {
        System.out.println("Prince " + name + " fight with dragon using sword");
    }

    @Override
    public void fireFight() {
        System.out.println("Prince " + name + " fight with dragon using fire");
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

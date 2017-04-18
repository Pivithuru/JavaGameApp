package com.app.classes.bean;

import com.app.classes.abstracts.Fighter;

import java.util.Random;

/**
 * Created by pivithuru on 4/3/17 3:00 PM.
 */
public class Princess extends Fighter {

    private String[] strategies = {"arrows", "sword"};

    @Override
    public void eat() {
        System.out.println("Princess " + name + " eat something");
    }

    @Override
    public void talk() {
        System.out.println("Princess " + name + " talk something");
    }

    @Override
    public void fight(String beast) {
        Random random = new Random();
        int strategyId = random.nextInt(strategies.length);
        System.out.println("Princess " + name + " fight with " + beast + " using " + strategies[strategyId]);
    }

    public void dance() {
        System.out.println("Princess " + name + " dance to the music");
    }

    @Override
    public String toString() {
        return super.toString();
    }

}

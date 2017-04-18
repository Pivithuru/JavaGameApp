package com.app.classes.bean;

import com.app.classes.abstracts.Fighter;

import java.util.Random;

/**
 * Created by pivithuru on 4/3/17 2:31 PM.
 */
public class FireSoldier extends Fighter {

    private String[] strategies = {"fire", "arrows", "sword"};

    @Override
    public void eat() {
        System.out.println("Fire soldier " + name + " eat something");
    }

    @Override
    public void talk() {
        System.out.println("Fire soldier " + name + " talk something");
    }

    @Override
    public void fight(String beast) {
        Random random = new Random();
        int strategyId = random.nextInt(strategies.length);
        System.out.println("Fire soldier " + name + " fight with " + beast + " using " + strategies[strategyId]);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

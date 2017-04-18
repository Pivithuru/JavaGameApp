package com.app.classes.bean;

import com.app.classes.abstracts.Fighter;

import java.util.Random;

/**
 * Created by pivithuru on 4/3/17 2:52 PM.
 */
public class Prince extends Fighter {

    private String[] strategies = {"fire", "arrows", "sword"};

    @Override
    public void eat() {
        System.out.println("Prince " + name + " eat something");
    }

    @Override
    public void talk() {
        System.out.println("Prince " + name + " talk something");
    }

    @Override
    public void fight(String beast) {
        Random random = new Random();
        int strategyId = random.nextInt(strategies.length);
        System.out.println("Prince " + name + " fight with " + beast + " using " + strategies[strategyId]);
    }

    @Override
    public String toString() {
        return super.toString();
    }

}

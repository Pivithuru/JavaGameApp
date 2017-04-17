package com.app.classes.helper;

import com.app.classes.bean.FireSoldier;
import com.app.classes.bean.Prince;
import com.app.classes.bean.Princess;

/**
 * Created by pivithuru on 4/6/17 11:51 AM.
 */
public class PrinterHelper {

    static void printHealthStatus(int numOfHealthBars) {
        System.out.print("Health Status ");
        for (int i = 0; i < numOfHealthBars; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    static void printScore(long survivalTime) {
        System.out.println("Final Score " + survivalTime * 10);
    }

    static void printDetails(Object object) {
        System.out.println("---------------GAME OVER---------------");
        if (object instanceof FireSoldier) {
            FireSoldier fireSoldier = (FireSoldier) object;
            System.out.println("Name: " + fireSoldier.getName() + "\tCountry: " + fireSoldier.getCountry());
        } else if (object instanceof Princess) {
            Princess princess = (Princess) object;
            System.out.println("Name: " + princess.getName() + "\tCountry: " + princess.getCountry());
        } else {
            Prince prince = (Prince) object;
            System.out.println("Name: " + prince.getName() + "\tCountry: " + prince.getCountry());
        }
    }

    static void printPrincessDetails(long survivalTime, Princess princess) {
        printDetails(princess);
        printScore(survivalTime);
    }

    static void printPrinceDetails(long survivalTime, Prince prince) {
        printDetails(prince);
        printScore(survivalTime);
    }

    static void printFireSoldierDetails(long survivalTime, FireSoldier fireSoldier) {
        printDetails(fireSoldier);
        printScore(survivalTime);
    }

}

package com.app.classes.helper;

import com.app.classes.abstracts.Fighter;

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

    static void printDetails(Fighter fighter) {
        fighter.toString();
    }

}

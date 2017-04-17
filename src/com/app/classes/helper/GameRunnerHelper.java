package com.app.classes.helper;

import com.app.classes.bean.FireSoldier;
import com.app.classes.bean.Prince;
import com.app.classes.bean.Princess;
import com.app.classes.enums.Variable;

import java.util.Random;

import static com.app.classes.enums.Variable.*;
import static com.app.classes.helper.PrinterHelper.*;

/**
 * Created by pivithuru on 4/3/17 3:13 PM.
 */
public class GameRunnerHelper {

    public static Object setCharacterDetails(Variable characterId, String name, int age, String country) {
        if (characterId == FIRESOLDIER) {
            FireSoldier fireSoldier = new FireSoldier();
            fireSoldier.setName(name);
            fireSoldier.setAge(age);
            fireSoldier.setCountry(country);
            return fireSoldier;
        } else if (characterId == PRINCE) {
            Prince prince = new Prince();
            prince.setName(name);
            prince.setAge(age);
            prince.setCountry(country);
            return prince;
        } else if (characterId == PRINCESS) {
            Princess princess = new Princess();
            princess.setName(name);
            princess.setAge(age);
            princess.setCountry(country);
            return princess;
        } else
            return null;
    }

    public static void fightWithDragon(Object object, Variable strategy) {
        long survivalTime;

        if (object instanceof FireSoldier) {
            FireSoldier fireSoldier = (FireSoldier) object;
            if (strategy == ARROWFIGHT) {
                survivalTime = calculateSurvivalTime(fireSoldier, ARROWFIGHT);
                printFireSoldierDetails(survivalTime, fireSoldier);
            } else if (strategy == SWORDFIGHT) {
                survivalTime = calculateSurvivalTime(fireSoldier, SWORDFIGHT);
                printFireSoldierDetails(survivalTime, fireSoldier);
            } else if (strategy == FIREFIGHT) {
                survivalTime = calculateSurvivalTime(fireSoldier, FIREFIGHT);
                printFireSoldierDetails(survivalTime, fireSoldier);
            }
        } else if (object instanceof Prince) {
            Prince prince = (Prince) object;
            if (strategy == ARROWFIGHT) {
                survivalTime = calculateSurvivalTime(prince, ARROWFIGHT);
                printPrinceDetails(survivalTime, prince);
            } else if (strategy == SWORDFIGHT) {
                survivalTime = calculateSurvivalTime(prince, SWORDFIGHT);
                printPrinceDetails(survivalTime, prince);
            } else if (strategy == FIREFIGHT) {
                survivalTime = calculateSurvivalTime(prince, FIREFIGHT);
                printPrinceDetails(survivalTime, prince);
            }
        } else if (object instanceof Princess) {
            Princess princess = (Princess) object;
            if (strategy == ARROWFIGHT) {
                survivalTime = calculateSurvivalTime(princess, ARROWFIGHT);
                printPrincessDetails(survivalTime, princess);
            } else if (strategy == SWORDFIGHT) {
                survivalTime = calculateSurvivalTime(princess, SWORDFIGHT);
                printPrincessDetails(survivalTime, princess);
            }
        } else
            System.out.println("There is no hero here");

    }

    private static long calculateSurvivalTime(Object object, Variable strategy) {
        Random random = new Random();
        int healthStatus = 10;
        long survivalTime = 0;

        while (healthStatus > 0) {
            long startTime = System.nanoTime();
            if (object instanceof FireSoldier) {
                FireSoldier fireSoldier = (FireSoldier) object;
                if (strategy == ARROWFIGHT) {
                    fireSoldier.arrowFight();
                    printHealthStatus(healthStatus);
                } else if (strategy == SWORDFIGHT) {
                    fireSoldier.swordFight();
                    printHealthStatus(healthStatus);
                } else if (strategy == FIREFIGHT) {
                    fireSoldier.fireFight();
                    printHealthStatus(healthStatus);
                }
            } else if (object instanceof Prince) {
                Prince prince = (Prince) object;
                if (strategy == ARROWFIGHT) {
                    prince.arrowFight();
                    printHealthStatus(healthStatus);
                } else if (strategy == SWORDFIGHT) {
                    prince.swordFight();
                    printHealthStatus(healthStatus);
                } else {
                    prince.fireFight();
                    printHealthStatus(healthStatus);
                }
            } else if (object instanceof Princess) {
                Princess princess = (Princess) object;
                if (strategy == ARROWFIGHT) {
                    princess.arrowFight();
                    printHealthStatus(healthStatus);
                } else if (strategy == SWORDFIGHT) {
                    princess.swordFight();
                    printHealthStatus(healthStatus);
                }
            }

            long endTime = System.nanoTime();
            survivalTime += (endTime - startTime);
            healthStatus = random.nextInt(11);
        }
        return survivalTime;
    }

}

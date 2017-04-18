package com.app.classes.helper;

import com.app.classes.abstracts.Fighter;
import com.app.classes.bean.FireSoldier;
import com.app.classes.bean.Prince;
import com.app.classes.bean.Princess;
import com.app.enums.CharacterEnum;

import java.util.Random;

import static com.app.classes.helper.PrinterHelper.*;
import static com.app.enums.CharacterEnum.*;

/**
 * Created by pivithuru on 4/3/17 3:13 PM.
 */
public class GameRunnerHelper {

    public static Fighter setCharacterDetails(CharacterEnum characterId, String name, int age, String country) {
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

    public static void fightWithDragon(Fighter fighter) {
        long survivalTime;
        survivalTime = calculateSurvivalTime(fighter);
        printScore(survivalTime);
        printDetails(fighter);
    }

    private static long calculateSurvivalTime(Fighter fighter) {
        Random random = new Random();
        int healthStatus = 10;
        long survivalTime = 0;

        while (healthStatus > 0) {
            long startTime = System.nanoTime();
            fighter.fight("dragon");
            printHealthStatus(healthStatus);

            long endTime = System.nanoTime();
            survivalTime += (endTime - startTime);
            healthStatus = random.nextInt(11);
        }
        return survivalTime;
    }

}

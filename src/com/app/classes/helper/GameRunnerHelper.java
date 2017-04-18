package com.app.classes.helper;

import com.app.classes.abstracts.Fighter;
import com.app.classes.factory.FighterFactory;
import com.app.enums.CharacterEnum;

import java.util.Random;

import static com.app.classes.helper.PrinterHelper.*;

/**
 * Created by pivithuru on 4/3/17 3:13 PM.
 */
public class GameRunnerHelper {

    public static Fighter setCharacterDetails(CharacterEnum characterId, String name, int age, String country) {
        FighterFactory fighterFactory = new FighterFactory();
        Fighter fighter = fighterFactory.getFighter(characterId);

        if (fighter != null) {
            fighter.setName(name);
            fighter.setAge(age);
            fighter.setCountry(country);
        }

        return fighter;
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

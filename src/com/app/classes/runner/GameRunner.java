package com.app.classes.runner;

import com.app.classes.bean.FireSoldier;
import com.app.classes.bean.Prince;
import com.app.classes.bean.Princess;

import java.util.InputMismatchException;
import java.util.Scanner;

import static com.app.classes.helper.GameRunnerHelper.fightWithDragon;
import static com.app.classes.helper.GameRunnerHelper.setCharacterDetails;
import static com.app.enums.CharacterEnum.*;

/**
 * Created by pivithuru on 4/3/17 3:13 PM.
 */
public class GameRunner {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        while (true) {
            System.out.print("\nChoose your character\n 1. Fire soldier\n 2. Prince\n 3. Princess\n Enter your choice: ");
            int characterChooser;

            try {
                characterChooser = reader.nextInt();
            } catch (InputMismatchException  ex) {
                System.out.println("Invalid input: Please enter a number");
                break;
            }

            String name;
            int age;
            String country;

            Prince prince;
            Princess princess;
            FireSoldier fireSoldier;

            if (characterChooser > 0 && characterChooser < 4) {
                System.out.println("\nEnter details of the soldier");
                System.out.print("Name : ");
                reader.nextLine();
                name = reader.nextLine();
                System.out.print("Age : ");
                try {
                    age = reader.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input: Please enter a number");
                    break;
                }
                System.out.print("Country : ");
                reader.nextLine();
                country = reader.nextLine();

                if (characterChooser == 1) {
                    fireSoldier = (FireSoldier) setCharacterDetails(FIRESOLDIER, name, age, country);
                    Boolean play = true;

                    while (play && (fireSoldier != null)) {
                        System.out.print("\nSelect an action\n 1. Eat\n 2. Talk\n 3. Fight\n Enter your choice: ");
                        int actionChooser;

                        try {
                            actionChooser = reader.nextInt();
                        } catch (InputMismatchException ex) {
                            System.out.println("Invalid input: Please enter a number");
                            break;
                        }

                        if (actionChooser == 1) {
                            fireSoldier.eat();
                        } else if (actionChooser == 2) {
                            fireSoldier.talk();
                        } else if (actionChooser == 3) {
                            fightWithDragon(fireSoldier);
                            System.out.print("Do you want to play another round?\n 1.Yes\n 2. No\nEnter your choice: ");
                            int playAgain;
                            try {
                                playAgain = reader.nextInt();
                            } catch (InputMismatchException ex) {
                                System.out.println("Invalid input: Please enter a number");
                                break;
                            }

                            if (playAgain == 1)
                                play = true;
                            else if (playAgain == 2)
                                play = false;
                            else {
                                System.out.println("Invalid choice");
                                break;
                            }
                        } else {
                            System.out.println("Invalid action selection");
                            break;
                        }
                    }

                } else if (characterChooser == 2) {
                    prince = (Prince) setCharacterDetails(PRINCE, name, age, country);
                    Boolean play = true;

                    while (play && (prince != null)) {
                        System.out.print("\nSelect an action\n 1. Eat\n 2. Talk\n 3. Fight\n Enter your choice: ");
                        int actionChooser;

                        try {
                            actionChooser = reader.nextInt();
                        } catch (InputMismatchException ex) {
                            System.out.println("Invalid input: Please enter a number");
                            break;
                        }

                        if (actionChooser == 1) {
                            prince.eat();
                        } else if (actionChooser == 2) {
                            prince.talk();
                        } else if (actionChooser == 3) {
                            fightWithDragon(prince);
                            System.out.print("Do you want to play another round?\n 1.Yes\n 2. No\nEnter your choice: ");
                            int playAgain;
                            try {
                                playAgain = reader.nextInt();
                            } catch (InputMismatchException ex) {
                                System.out.println("Invalid input: Please enter a number");
                                break;
                            }

                            if (playAgain == 1)
                                play = true;
                            else if (playAgain == 2)
                                play = false;
                            else {
                                System.out.println("Invalid choice");
                                break;
                            }
                        } else {
                            System.out.println("Invalid action selection");
                            break;
                        }
                    }

                } else if (characterChooser == 3) {
                    princess = (Princess) setCharacterDetails(PRINCESS, name, age, country);
                    Boolean play = true;

                    while (play && (princess != null)) {
                        System.out.print("\nSelect an action\n 1. Eat\n 2. Talk\n 3. Fight\n 4. Dance\n Enter your choice: ");
                        int actionChooser;

                        try {
                            actionChooser = reader.nextInt();
                        } catch (InputMismatchException ex) {
                            System.out.println("Invalid input: Please enter a number");
                            break;
                        }

                        if (actionChooser == 1) {
                            princess.eat();
                        } else if (actionChooser == 2) {
                            princess.talk();
                        } else if (actionChooser == 3) {
                            fightWithDragon(princess);
                            System.out.print("Do you want to play another round?\n 1.Yes\n 2. No\nEnter your choice: ");
                            int playAgain;
                            try {
                                playAgain = reader.nextInt();
                            } catch (InputMismatchException ex) {
                                System.out.println("Invalid input: Please enter a number");
                                break;
                            }

                            if (playAgain == 1)
                                play = true;
                            else if (playAgain == 2)
                                play = false;
                            else {
                                System.out.println("Invalid choice");
                                break;
                            }
                        } else if (actionChooser == 4) {
                            princess.dance();
                        } else {
                            System.out.println("Invalid action selection");
                            break;
                        }
                    }

                } else {
                    System.out.println("Invalid character selection");
                }

                System.out.print("\nDo you want to exit?\n 1. Yes\n 2. No\n Enter your choice: ");
                int finalizer;

                try {
                    finalizer = reader.nextInt();
                } catch (InputMismatchException ex) {
                    System.out.println("Invalid input: Please enter a number");
                    break;
                }

                if (finalizer == 1) {
                    System.out.println("Exit From the game");
                    break;
                } else if (finalizer == 2) {
                    //Do nothing
                } else {
                    System.out.println("Invalid choice");
                    break;
                }

            } else {
                System.out.println("Invalid character selection");
            }

        }
    }
}

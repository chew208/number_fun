package com.mpn.number_fun.model;

import java.util.Random;
import java.util.Scanner;

public class RussianRoulette {


    private Scanner choice = new Scanner(System.in);
    private int finalChoice;
    private Random kill  = new Random();
    private int killShot;

    public void chanceGame() {

        System.out.println("You feelin lucky, punk!\n(Choose number 1-6)");
        finalChoice = choice.nextInt();

        killShot = kill.nextInt(6) + 1;

        do {
            if (killShot == finalChoice) {
                System.out.println("BANG! You are dead.");
            } else {
                System.out.println("You live to fight another day!");
            }
            System.out.println("\nYou feelin lucky, punk!\n(Choose number 1-6)\nEnter 0 to stop");
            finalChoice = choice.nextInt();
        } while (finalChoice != 0);
    }
}

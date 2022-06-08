package homework;

import java.util.Random;
import java.util.Scanner;

public class ExtraHomeWork {
    public static void main(String[] args) {
        int attempts = 1;
        int guess = 0;
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int x = random.nextInt(51);
        System.out.println("Minēšanas spēle.");

        do {
            System.out.println("Ievadi skaitli 1 - 50!");
            if (sc.hasNextInt()) {
                guess = sc.nextInt();
                if (guess == x) {
                    System.out.println("Skaitlis atminēts pareizi." +
                            " \nTava atbilde: " + x + " \nUzminēji ar: " + attempts + ". reizi!");
                    break;

                } else if (guess < x)
                    System.out.println("Tavs minētais skaitlis ir mazāks!");

                else if (guess > x)
                    System.out.println("Tavs minētais skaitlis ir lielāks!");

                if (attempts == 10) {
                    System.out.println("Tu zaudēji! Mēģini vēlreiz!");
                    break;

                }
                attempts++;
            } else {
                    System.out.println("Ievadi veselu skaitli!");
                    break;
                    }


        }while (guess != x);

    }


    }

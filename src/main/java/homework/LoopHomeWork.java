package homework;

import java.util.Scanner;

public class LoopHomeWork {
    public static void main(String[] args) {
        whileLoop();
        primeNumber();
        arrays1();
        arrays2();
        arrays3();
        evenNumber();
        factorial();

    }

    // Pirmais uzdevums
    static void whileLoop() {

        int i = 0;
        while (i <= 101) {
            System.out.println(i);
            i++;

        }
        System.out.println("GATAVS!");

    }
    // Otrais uzdevums
    static void primeNumber() {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("Ievadi skaitli: ");
        number = scanner.nextInt();
        boolean num = false;

        for (int i = 2; i <= number / 2; i++) {

            if (number % i == 0) {
                num = true;
                break;
            }
        }
        if(!num)
            System.out.println(number + " ir pirmskaitlis.");
        else
            System.out.println(number + " nav pirmskaitlis.");


    }
    // Trešais uzdevums

    static void arrays1() {
// while
        int i = 1, o = 10;
        while (i <= o) {
            System.out.println(i);
            i++;
        }
// do while
        int a = 1, b= 10;
        do {
            System.out.println(a);
            a++;
        } while (a <= b);
// for loop
        int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int j = 0; j < number.length; j++) {
            System.out.println(number[j]);

        }
        int[] number1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int numb: number1){
            System.out.println(numb);
        }


    }

    static void arrays2() {
// while
        String[] names = new String[3];
        names[0] = "Matīss";
        names[1] = "Jānis";
        names[2] = "Pēteris";
        int interator = 0;
        while (interator < names.length) {
            System.out.println(names[interator]);
            interator++;
        }
// do while
        Scanner scanner = new Scanner(System.in);
        String name1 = "Matīss";
        String yourName;
        do {
            System.out.println("Ievadi vārdu: ");
            yourName = scanner.nextLine();

            } while (!yourName.equals(name1));
        System.out.println("Tavs Vārds!");
// for loop
        String[] drinks = {"Ūdens", "Sula", "Limonāde"};
        for (int j = 0; j < drinks.length; j++) {
            System.out.println(drinks[j]);

        }
//for each
        String[] drinks1 = {"Ūdens", "Sula", "Limonāde"};
        for (String drin : drinks1) {
            System.out.println(drin);
        }

    }

    static void arrays3() {
// while
        char[] character = {'a', 'b', 'c', 'd', 'e'};
        int interator = 0;
        while (interator < character.length) {
            System.out.println(character[interator]);
            interator++;
        }
// do while
        char[] character2 = {'a', 'b', 'c', 'd', 'e'};
        int interator1 = 0;
        do {
            System.out.println(character2[interator1]);
            interator1++;
        } while (interator1 < character2.length);



// for loop
        char[] charac= {'a', 'b', 'c', 'd', 'e'};
        for(int j = 0; j < charac.length; j++) {
            System.out.println(charac[j]);

        }
//for each
        char[] character1= {'a', 'b', 'c', 'd', 'e'};
        for (char chara : character1) {
            System.out.println(chara);
        }

    }
            // ceturtais uzdevums
    static void evenNumber(){
        int[] list = new int[100];
        for (int i = 1; i <= list.length ; i++) {

            if(i % 2 == 0){
                System.out.print(i + ",");
            }

        }
    }
          // Piektais uzdevums
    static void factorial() {
        int number = 4, i = 1;
        long factorial = 1;
        for (i = 1; i <= number; i++) {
            factorial = factorial * i;
        }
        System.out.println("\nFaktoriāls no " + number + " ir: " + factorial);
    }

        // Sestais uzdevums

    static void pin(){
        
    }
}

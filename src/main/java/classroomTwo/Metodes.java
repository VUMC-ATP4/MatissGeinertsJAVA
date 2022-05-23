package classroomTwo;

import java.util.Scanner;

public class Metodes {
    public static void main(String[] args) {
        System.out.println("Sākas koda izpilde");
        printetText();
        System.out.println("beidzās koda izpilde");
        switchPiemērs();
        int laukums = aprekinatKvadrataLaukumu(5, 10);
        System.out.println(laukums);
        checkPersonAge();

    }
    static void checkPersonAge(){
        Scanner scanner = new Scanner(System.in);
        int vecums;
        System.out.println("Paskaties cilvēka pasē?");

        vecums = scanner.nextInt();
        if (vecums>=18) {
            System.out.println("Drīkst balsot");
        } else {
            System.out.println("Nedrīkst balsot");
        }
    }

    static int aprekinatKvadrataLaukumu(int a, int b) {
        return a*b;
    }

    static void switchPiemērs() {
        int month = 3;

        switch (month) {
            case 1:
                System.out.println("Janvāris");
                break;
            case 2:
                System.out.println("Februāris");
                break;
            case 12:
                System.out.println("Decembris");
            default:
                System.out.println("Mēnesis " + month + " nav definēts.");

        }
    }

    static void printetText() {
        System.out.println("Šī ir mana metode");
        System.out.println("Es izsaucu šo metodi");
    }
}

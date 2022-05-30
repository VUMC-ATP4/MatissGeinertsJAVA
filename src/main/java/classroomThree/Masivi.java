package classroomThree;

import java.util.Scanner;

public class Masivi {

    public static void main(String[] args) {

        String[] gadalaiki = {"Pavasaris", "Vasara", "Rudens", "Ziema"};
        int[] fibonacciNumber = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34};
        double[] randomSkaitli = {1.14, 1.15, 1.16};
        System.out.println(gadalaiki.length);

        System.out.println(gadalaiki[0]);
        System.out.println(fibonacciNumber[4]);

        //Masīvi ar cilvēka vārdiem
        String[] cilveki = {"Juris", "Peteris", "Anna"};
        int[] vecums = {15, 45, 70};
        System.out.println("Vārds: " + cilveki[0] + "\n" + "Vecums: " + vecums[0]);

        String[] germanCars = new String[4];
        germanCars[0] = "mercades";
        germanCars[1] = "BMW";
        germanCars[2] = "Audi";
        germanCars[3] = "VW";

        int iterators = 0;
        while (iterators < germanCars.length) {
            System.out.println(germanCars[iterators]);
            iterators++;
        }


        System.out.println(germanCars[2]);

//        int[] mansMasivs = generateArray();
//        System.out.println(mansMasivs[0]+ "" + mansMasivs[1]+ "" + mansMasivs[2]);

        int i = 0;
        while (i <= 5) {

            System.out.println("I ir: " + i);
            i++;

        }
        System.out.println("Cikla izeja");

        int q = 10;
        while (q > 1) {

            System.out.println("I ir: " + q);
            q--;

        }
        System.out.println("Cikla izeja");

        int[] bingoLotoLaimigieSkaitli = {3, 5, 46, 71, 82, 90};
        int counter = 0;
        while (counter < bingoLotoLaimigieSkaitli.length) {
            System.out.println(bingoLotoLaimigieSkaitli[counter]);
            counter++;
        }

        String [] kartis = {"Pīķa dūzis","Ercena kalps","Kārava dāma"};
        int karts = 0;
        System.out.println(String.format("Man rokā ir %s kārtis ", kartis.length));
        while(karts<kartis.length){
            System.out.println(kartis[karts]);
            karts++;
        }

        printIntArray(fibonacciNumber);
//        sumPositiveNumbers();
        Scanner scanner = new Scanner(System.in);

//        String parole = "Parole123";
//        String lietotajaParole;
//        do{
//            System.out.println("Ievadi paroli: ");
//            lietotajaParole = scanner.nextLine();
//            System.out.println("Pārbaudām paroli. ");
//        } while (!lietotajaParole.equals(parole));
//        System.out.println("pareiza parole");

//        int number;
//        do{
//            System.out.println("Ievadi skaitli lielaku par 0, bet mazaku par 10");
//            number = scanner.nextInt();
//        } while(number < 0 && number > 10);

//        for (int j = 0; j < 10; j++) {
//
//            System.out.println(j);
//
//        }

        for (int j = 0; j < gadalaiki.length; j++) {
            System.out.println(gadalaiki[j]);

        }

        for (int j = 1; j <= 50; j++)
        {

            //System.out.println(j);
            if((j%3==0) || (j%5==0)){
                System.out.println("Šis nr. mums neder " + j);
            }
            else {
                System.out.println("šis nr. mums der " + j);
            }

        }

        int[] skaitlis = {1, 2, 3, 4, 5, 6, 4, 3 };
        int summa = 0;
        //for each array
        for(int j:skaitlis){
            summa = summa + j;
            System.out.println(summa);
        }

        String[] vardi = {"abols", "bumbiers", "melone"};
        for (String vards : vardi) {
            System.out.println(vards);

        }

        for (int j = 0; j < 10; j++) {
            if(j==5){
                break;
            }
            System.out.println(j);

        }

        int[] skaitluMasivs = {1, 2, 3, 4, 5, -3, 4, 6, 9};
        for (int j = 0; j < skaitluMasivs.length; j++) {
            if(skaitluMasivs[j]==-3){
                System.out.println(skaitluMasivs[j]);
                break;
            }
            System.out.println(skaitluMasivs[j]);

        }





    }



    static int[] generateArray(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ievadi pirmo skaitli: ");
        int a = scanner.nextInt();
        System.out.println("Ievadi otro skaitli: ");
        int b = scanner.nextInt();
        System.out.println("Ievadi treso skaitli: ");
        int c = scanner.nextInt();
        int[] skaitluMasisvs = {a, b, c};
        return skaitluMasisvs;
    }

    static void printCilveks(String[] humans, int[] ages, int index){
        System.out.println("Vārds: " + humans[index] + "\n" + "Vecums: " + ages[index]);


    }
    static void printIntArray(int[] randomMasivs){
        int counter = 0;
        while (counter < randomMasivs.length){
            System.out.println(randomMasivs[counter]);
            counter++;
        }

    }


    static int sumPositiveNumbers(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scanner.nextInt();
        int summa = 0;
        while(number >= 0){
            summa = summa + number;
            System.out.println("Enter number: ");
            number = scanner.nextInt();

        }
        System.out.println("Positive number sum is " + summa);
        return summa;
    }

}

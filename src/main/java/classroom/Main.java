package classroom;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello Matiss");

        int x = 5;
        int y = 10;
        System.out.println("x ir vienāds:");
        System.out.println(x);
        System.out.println("y ir vienāds:");
        System.out.println(y);
        System.out.println("x + y ir vienāds:");
        System.out.println(x+y);

        //[Mainīgā tips] [Mainīgā nosaukums] = [Vērtība]
        //Vārdi un teikumi JAVA valodā tiek saglabāti mainīgā tipā 'String'
        //Veseli skaitļi tiek definēti ar mainīgā tipu 'int'
        //daļskaitļi tiek definēti ar mainīgā tipu 'double' vai 'float'


        String dogName = "Reksis";
        int dogAge = 10;
        double dogWeight = 15.5;
        String dogBreed = "Hasky";
        // Jā(true) nē(false) jautājums tiek definēts ar mainīgā tipu 'boolean'
        boolean isHungry = true;
        // vienu simbolu definē ar mainīgā tipu 'char'
        char dogGender = 'M';
        char currency = '€';
        int dogPrice = 100;

        // \n - new line

        System.out.println("Suņa vārds: " + dogName);
        System.out.println("\nSuņa vecums: " + dogAge);
        System.out.println("Suņa svars: " + dogWeight);
        System.out.println("Suņa šķirne: " + dogBreed);
        System.out.println("Vai suns ir izsalcis: " + isHungry);
        System.out.println("Suņa dzimums ir: " + dogGender);
        System.out.println("Suņa kucēni maksā: " + dogPrice + currency);


        byte age = 10;
        short deepestSeeLevel = 11000;
        int  highestIntNumber = 2147483647;
        long USACountryDebt = 2147483647123L; // long mainīgajam vienmēr aizmugurē jāliek klāt lielais L burts

        System.out.println(age);
        System.out.println(deepestSeeLevel);
        System.out.println(highestIntNumber);
        System.out.println(USACountryDebt);

        float highestTemperature = 40.655423F; // Aiz float mainīgā vienmēr liek burtu F
        System.out.println(highestTemperature);

        int summa;
        int pirmaisSkaitlis = 22;
        int otraisSkaitlis = 10;


        int starpiba = pirmaisSkaitlis - otraisSkaitlis;
        summa = pirmaisSkaitlis + otraisSkaitlis;
        int dalijums = pirmaisSkaitlis / otraisSkaitlis;
        int reizinajums = pirmaisSkaitlis * otraisSkaitlis;
        int atlikums = pirmaisSkaitlis % otraisSkaitlis;

        // tests

        int a = 2;
        int b = 4;
        int c = 7;

        System.out.println("#####" +b/a);

        System.out.println("Ja atlikums ir nulle 0, tad para skaitlis" + b%2 );


        System.out.println(pirmaisSkaitlis + "+" + "(" + otraisSkaitlis + ")" + "=" + summa);

        System.out.println("starpiba" + starpiba);
        System.out.println("summa" + summa);
        System.out.println("dalijums" + dalijums);
        System.out.println("reizinajums" + reizinajums);
        System.out.println("atlikums" + atlikums);





       }

}



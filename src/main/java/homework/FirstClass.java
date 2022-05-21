package homework;

public class FirstClass {
    public static void main(String[] args) {
        System.out.println("\tTHIS IS HOMEWORK: ");

        // Valsts apraksts.

        String countryName = "Igaunija";
        double countryPopulation = 1.331;
        int countryTotalArea = 45339;
        String countryCapitalCity = "Tallina";
        String countryOfficialLanguage = "Igauņu valoda";
        boolean isEuropeanMemberState = true;
        char currency = '€';
        float temperatureEstonia = 8.4F;

        System.out.println("Valsts nosaukums:" + " " + countryName);
        System.out.println("Iedzīvotāju skaits: " + countryPopulation + " Miljoni");
        System.out.println("Platība: " + countryTotalArea + "km²");
        System.out.println("Galvaspilsēta: " + countryCapitalCity);
        System.out.println("Officiālā valoda: " + countryOfficialLanguage);
        System.out.println("Vai " + countryName + " ir Eiropas dalībvalsts? " + isEuropeanMemberState);
        System.out.println("Valts Valūta: " + currency);
        System.out.println("Šī brīža gaisa temperatūra " + countryName + "ā: " + temperatureEstonia + "°C");



        // concatenation


        double populationLatvia = 1.902;

        double sum = populationLatvia + countryPopulation;

        System.out.println("Latvijas iedzīvotāju skaits ir " + populationLatvia + "M" + ", bet " + countryName +"s - " + countryPopulation + "M" + "." + ("\nPa abām valstīm kopā: " + String.format("%.2f", sum)) + "M" );


        // Matemātiskas darbības
        System.out.println("Dažas matemātiskās darbības:");

        int a = 100;
        int b = 49;
        int c = 50;
        int d = 300;

        System.out.println(a%b);
        System.out.println(b-a);
        System.out.println(c+d);
        System.out.println(a*d);
        System.out.println((double) b/a);

        int summa;
        int first = 28;
        int second = 4;

        int subtraction = first - second;
        summa = first + second;
        int division = first / second;
        int multiplication = first * second;
        int modulo = second % first;

        System.out.println("Subtraction: " + first + " - " + second + " = "  + subtraction);
        System.out.println("Summa: " + first + " + " + second + " = " + summa);
        System.out.println("Division: " + first + " / " + second + " = " + division);
        System.out.println("Multiplication: " + first + " * " + second + " = " + multiplication);
        System.out.println("Modulo: " + second + " % " + first + " = " + modulo);






















    }
}

package homeworkTwo;
import java.util.Scanner;

public class HomeworkTwo {
    public static void main(String[] args) {
        logicalExpressions();
        swt();
        greatestNumber();
        ifSent();
        printBusinessCard();
        printBusinessCard();
        printBusinessCard();
        String card = printBuisnessCardTwo("Matīss ", "Geinerts ", "+371 29971260 ", 1993);
        String card1 = printBuisnessCardTwo("Kristīne", "Kalniņa", "+371 29999999", 1991);
        System.out.println("VIZĪTKARTE \n" +  card);
        System.out.println("VIZĪTKARTE \n" +  card1);
        int sum = summa(7,9);
        System.out.println(sum);
        double ave = avr(14, 5, 3);
        System.out.println(ave);


    }

    // Pirmais uzdevums

    static void logicalExpressions() {
        int x = 9;
        int x1 = -9;
        System.out.println(x > 0);
        System.out.println(x1 > 0);
        System.out.println(x > 5 && x <= 10);
        System.out.println(!(x <= 5) || x < 10);
        System.out.println(x == 0 || x == 10);
        System.out.println((x * x) > 10);

    }



    //Otrais uzdevums
    static void swt() {


        int month = 11;

        switch (month) {
            case 1:
                System.out.println("Janvāris");
                break;
            case 2:
                System.out.println("Februāris");
                break;
            case 3:
                System.out.println("Marts");
                break;
            case 4:
                System.out.println("Aprīlis");
                break;
            case 5:
                System.out.println("Maijs");
                break;
            case 6:
                System.out.println("Jūnijs");
                break;
            case 7:
                System.out.println("Jūlijs");
                break;
            case 8:
                System.out.println("Augusts");
                break;
            case 9:
                System.out.println("Septembris");
                break;
            case 10:
                System.out.println("Oktobris");
                break;
            case 11:
                System.out.println("Novembris");
                break;
            case 12:
                System.out.println("Decembris");
                break;
            default:
                System.out.println("Mēnesis " + month + " nav definēts.");

        }

    }


    // Trešais uzdevums
    static void greatestNumber() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int a = scanner.nextInt();
        System.out.println("Enter second number: ");
        int b = scanner.nextInt();
        System.out.println("Enter third number: ");
        int c = scanner.nextInt();

        int g = Math.max(a, b);
        g = Math.max(g, c);

        System.out.println("Greatest Number = " + g);

    }


    // Ceturtais uzdevums
    static void ifSent() {

        String color = "Zaļš"; // Sarkans, Dzeltens, Zaļš, Nedeg


        if (color.equals("Sarkans") ) {
            System.out.println("Ja luksaforā deg " + color + " -Nedrīkst šķērsot gājēju pāreju.");
        } else if (color.equals("Dzeltens")){
            System.out.println("Ja luksaforā deg " + color + " -Gājējs sagatavojas.");
        } else if (color.equals("Zaļš")) {
            System.out.println("Ja luksaforā deg " + color + " -Drīkst šķērsot gājēju pāreju.");
        } else {
            System.out.println("Ja tomēr luksafors nestrādā, pārliecinies un šķērso pāreju.");
        }

    }

    // Piektais uzdevums

static void printBusinessCard() {
    System.out.println("VIZĪTKARTE");
    System.out.println("##########");
    System.out.println("Vārds: Matīss");
    System.out.println("Uzvārds: Geinerts");
    System.out.println("Telefona numurs: +371 29971260");
    System.out.println("Dzimšans gads: 1993");
    System.out.println("##########");
}


    //Sestais uzdevums
static String printBuisnessCardTwo(String name, String surname, String telephone, int dateOfBirth) {
        return "Vārds: " + name + "\nUzvārds: " + surname + "" + "\nTelefona nr: " + telephone + "\nDzimšanas gads: " + dateOfBirth + "\n##########";}

    // Septītais uzdevums

    static int  summa(int a, int b) {
        return a+b;
    }

    // Astotais uzdevums

    static  double avr(double a, double b, double c) {
        return (a + b + c) / 3;

    }
}

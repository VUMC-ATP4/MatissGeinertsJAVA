package classroomTwo;
import java.sql.SQLOutput;
import java.util.Scanner;

public class PracticalTaskTwo {
    public static void main(String[] args) {
        System.out.println("Praktiskie darbi 2");
//        Scanner scanner = new Scanner(System.in);
//        int vecums;
//        System.out.println("Paskaties cilvēka pasē?");
//
//        vecums = scanner.nextInt();
//        if (vecums>=18) {
//            System.out.println("Drīkst balsot");
//        } else {
//            System.out.println("Nedrīkst balsot");
//        }

//        int x = 10;
//        int y = 20;
//
////        if (y > x && x > 5) { // && - UN
////            System.out.println("True");
////        }
////
////        if (y > x || x > 25) { // || -  VAI
////            System.out.println("True");
////        }
//
//        int skaitlis = 13;
//
//        if (skaitlis == 10)
//        {
//            System.out.println("Skaitlis  = 10");
//        } else if (skaitlis == 15)
//        {
//                System.out.println("Skaitlis = 15");
//        } else if (skaitlis == 20)
//        {
//            System.out.println("skaitlis = 20");
//        } else {
//            System.out.println("Skaitlis nezināms");
//        }




//        System.out.println("Ievadi savu vārdu");

//        int a;
//        int b;
//        int summa;

//        System.out.println("Ievadi skaitli a");
//        a = scanner.nextInt();
//        System.out.println("Ievadi skaitli b");
//        b = scanner.nextInt();
//
//        System.out.println(a>b);
//        System.out.println("šeit jabut nepatiesas: " + (5>10));
//        System.out.println(5<10);
//        System.out.println(6==5);
//        System.out.println(5==5);
//        System.out.println(6!=5);
//        System.out.println(5!=5);
//        int vecums = 18;
//        System.out.println(vecums >= 18);
//        int bernaVecums = 5;
//        System.out.println(bernaVecums <=5);
//        System.out.println(vecums > bernaVecums);
//        boolean isEligableToVote = vecums >= 18;
//        System.out.println("Vai cilvēks drīkst balsot? " + isEligableToVote);
//
//        String name2 = "Matīss";
//        String name3 = "Matīss";
//        System.out.println(name3.equals(name2));
//        System.out.println(true == true);
//
//        System.out.println(5>3 && 4>3);

//        System.out.println("Ievadi X");
//        int x = scanner.nextInt();
//        boolean vaiIrPatiess = (x < 5 && x < 10);
//        System.out.println(vaiIrPatiess);

//        System.out.println("Ievadi X");
//        int x = 4
//        boolean vaiIrPatiess = (x < 5 && x < 10);
//        x = 5;
//        System.out.println(vaiIrPatiess);

//        int a = 10;
//        int b = 20;
//        int c = 20;
//        int d = 0;
//
//        System.out.println((a < b) && (b == c));
//        System.out.println(a > b || c == d);
//        System.out.println(!(a>b));

//        String name = "Matīss";
//        String surname = "Geinerts";
//        String role = "Students";
//        double videjaAtzime = 7.3214;
//
//        String concatTeikums = "Mani sauc " + name + " Mans uzvārds ir " + surname + " Es esmu " + role;
//        String teikums = String.format("Mani sauc %s. Mans uzvārds ir %s. Es esmu %s. Mana vid atz ir %.1f",name,surname,role,videjaAtzime);
//
//        System.out.println(teikums);
//        System.out.println(concatTeikums);

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

//        int q = 10;
//
//        if (q > 0) {
//            System.out.println("Skaitlis ir lielāks par nulli");
//        }

//        int cilvekaVecums = 40;
//        char dzimums = 'S';
//
//        if (dzimums == 'V' && cilvekaVecums >= 65 ) {
//            System.out.println("Drīkst doties");
//        } else if (dzimums == 'S' && cilvekaVecums >= 60) {
//            System.out.println("Drīkst doties");
//        } else {
//            System.out.println("Nedrīkst");
//        }

//        int cilvekaVecums=65;
//        char dzimums = 'V';
//        boolean drikstDoties = false;
//
//        if(dzimums=='V' && cilvekaVecums >=65){
//            drikstDoties = true;
//        } else if(dzimums=='S' && cilvekaVecums>=60){
//            drikstDoties=true;
//        }
//
//        System.out.println("Cilveks drikst doties pensija " + drikstDoties);

        int skaitlisX = 13;
        if (skaitlisX % 2 == 0) {
            System.out.println("Skaitlis ir pāra");
        } else {
            System.out.println("Skaitlis ir nepāra");
        }








    }
}

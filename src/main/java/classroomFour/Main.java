package classroomFour;

public class Main {
    public static void main(String[] args) {
    // Objekts viens
    House majaViens = new House();
//    majaViens.majasNummurs = 1;
//    majaViens.ielasNosaukums = "Brīvības iela";
//    majaViens.printetAdresi();
        majaViens.cena = new Cena();



    //Objekts divi
    House majaDivi = new House();
    majaDivi.majasNummurs = 2;
    majaDivi.ielasNosaukums = "Ģertrūdes iela";
    majaDivi.stavuSkaits = 3;
    majaDivi.istabuSkaits = 4;
    majaDivi.ieejuSkaits = 2;
    majaDivi.platiba = 165.3;
    majaDivi.cena = new Cena();
    majaDivi.irStavvieta = true;
    majaDivi.valuta = '€';
    majaDivi.printetVisu();

    //velosipeds


        Velosipeds velosipeds1 = new Velosipeds();
        Velosipeds velosipeds2 = new Velosipeds();
        velosipeds2.bremzuTips= "Disku";
        velosipeds2.spiedPedalus();
        velosipeds2.spiedPedalus();
        velosipeds2.spiedPedalus();
        System.out.println("Velosipēda 2 ātrums ir = " + velosipeds2.atrums);
        velosipeds2.bremze();
        velosipeds2.bremze();
        System.out.println("Velosipēda 2 ātrums ir = " + velosipeds2.atrums);
        System.out.println(velosipeds1.atrumi);
        System.out.println(velosipeds1.nosaukums);
        velosipeds1.atrumi = 28;
        System.out.println(velosipeds1.atrumi);

        Koks koks1 = new Koks();
        koks1.augstums = 9.5;
        koks1.vecums = 50;
        koks1.skirne = "Parastais Ozols";
        koks1.printet();
        koks1.pecGada();
        System.out.println("Pēc gada: " + koks1.augstums );


        Rinkis laukums = new Rinkis();
        laukums.printetLaukumu();












//    majaDivi.ielasNosaukums = "Izmainits nosaukums";
//        majaDivi.printetAdresi();


    }
}

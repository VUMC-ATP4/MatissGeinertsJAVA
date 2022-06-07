package classroomFour;

public class House {
    String ielasNosaukums;
    int majasNummurs;
    int stavuSkaits;
    int ieejuSkaits;
    int istabuSkaits;
    double platiba;
    boolean irStavvieta;
    Cena cena;
    char valuta;

    public double cenaKv(){
        return cena.cena / platiba;
    }



    public void printetVisu() {
        System.out.println("Mājas adrese ir: " + ielasNosaukums + " " + majasNummurs);
        System.out.println("Stāvu skaits ir: " + stavuSkaits);
        System.out.println("Istabu skaits ir: " + istabuSkaits);
        System.out.println("Ieeju skaits: " + ieejuSkaits);
        System.out.println("Platība: " + platiba + " " + "kvm");
        System.out.println("Cena: " + cena + valuta);
        System.out.println("Ir stāvvieta? " + irStavvieta);
        System.out.println("Cena kvadrātmetrā ir: " + String.format("%.2f", cenaKv()) + valuta);

    }

}

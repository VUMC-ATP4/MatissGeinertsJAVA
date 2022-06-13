package classroomFive.encapsulation;

public class Main {
    public static void main(String[] args) {
        Bird putns = new Bird();
//        putns.name = "Vista"; // jo private!
        putns.setKrasa("zila");
        System.out.println(putns.getKrasa());
        putns.printText();
        putns.printDefaultMethodExample();
        Human cilveks = new Human();
        cilveks.setAge(20);
        System.out.println(cilveks.getAge());
        cilveks.setName("Matīss");
        System.out.println(cilveks.getName());
        cilveks.setSurname("Geinerts");
        System.out.println(cilveks.getSurname());
        cilveks.setHeight(1.86);
        System.out.println(cilveks.getHeight());

        cilveks.setAge(2);
        System.out.println(cilveks.getAge());

        Matematika matematika = new Matematika();
        matematika.add(30, 20);
        matematika.add(1.3, 3.5);
        System.out.println(matematika.add(30, 20));
        System.out.println(matematika.add(1.3, 3.5));

        matematika.paraditTekstu("Juris");
        matematika.paraditTekstu("Juris", true );
        matematika.paraditTekstu("Anna", false);



    }


}

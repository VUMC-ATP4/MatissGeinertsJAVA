package classroomFive.inheritance;

public class Animal {
    int legCount;
    String name;
    Animal(int legCount, String name) {
        this.legCount = legCount;
        this.name = name;
    }

    public void printLegCount(){
        System.out.println("Kāju skaits ir: " + legCount + " Vārds: " + name);
    }

    public void makeSound(){
        System.out.println("Es esmu dzīvnieks. Arhghhhh...");
    }

}

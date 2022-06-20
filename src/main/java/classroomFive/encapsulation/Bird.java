package classroomFive.encapsulation;

import lombok.Getter;


public class Bird {
    private String name;
    private String colour;

    public void setKrasa(String krasa) {
        this.colour = krasa;
    }
    public String getKrasa(){
        return colour;
    }

    public void printText(){
        System.out.println("šī ir publiska metode");
        System.out.println("Printēju putnu");
    }
    private void printTextSpecial(){
        System.out.println("šī ir privāta metode");
    }
    void printDefaultMethodExample(){
        System.out.println("šī ir default metode");
    }
}

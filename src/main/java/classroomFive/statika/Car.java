package classroomFive.statika;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Car {


    private String name;
    private String color;
    public static String klasesApraksts;
    public static int countOfCarsCreatedInSystem;

    public Car(String name, String color) {
        this.name = name;
        this.color = color;
        countOfCarsCreatedInSystem++;

    }

    public static void makeSound(){
        System.out.println("Beep beep");
    }


}

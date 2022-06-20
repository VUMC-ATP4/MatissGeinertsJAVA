package classroomFive.encapsulation;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Human {
    private int age;
    private String name;
    private String surname;
    private double height;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0) {
            System.out.println("Vecums nav pareizs");
            throw new IllegalArgumentException();

        } else {
            this.age = age;
        }
    }

}

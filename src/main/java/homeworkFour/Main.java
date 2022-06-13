package homeworkFour;

public class Main {
    public static void main(String[] args) {

    Triangle triangle1 = new Triangle();
    triangle1.a = 5;
    triangle1.b = 5;
    triangle1.c = 5;

    triangle1.printText();

    Triangle triangle2 = new Triangle(6, 5, 6);

    triangle2.printText2();

    }


}

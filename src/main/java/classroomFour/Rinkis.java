package classroomFour;

public class Rinkis {
   private final double  PI = 3.14;
    double radiuss = 4;

    public double rinkaLaukums(){
        return PI * (radiuss*radiuss);
    }

    public void printetLaukumu(){
        System.out.println("Riņķa laukums ir: " + rinkaLaukums());
    }

}

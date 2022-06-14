package homeworkFour;


public class Triangle {
    public int a, b, c;


    Triangle() {
        System.out.println("Veidojam pirmo trīsstūra laukumu: ");
    }

    Triangle(int a, int b, int c) {
        System.out.println("Veidojam otro trīsstūra laukumu: ");
        this.a = a;
        this.b = b;
        this.c = c;
    }


    public double sabc() {
        double p = pabc();
        return  Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    private double pabc() {
        return (double) (a + b + c) / 2.0;

    }

    public boolean isEquilateral() {
        if      ((a == b) &&
                (b == c) &&
                (c == a)) {
            return true;
        }
        else
            return false;
    }

    public boolean isIsosceles() {
        if      ((a == b && b != c) ||
                (a != b && c == a) ||
                (c == b && c != a)) {
            return true;
        } else
            return false;
    }

    public void printText(){
        System.out.println("Trīsstūra laukums: " + String.format("%.2f", sabc()) + "cm²");
        System.out.println("Tas ir vienādsānu trīsstūris? " + isIsosceles());
        System.out.println("Tas ir vienādmalu trīsstūris? " + isEquilateral());
        }
    public void printText2(){
        System.out.println("Trīsstūra laukums: " + String.format("%.2f", sabc()) + "cm²");
        System.out.println("Tas ir vienādsānu trīsstūris? " + isIsosceles());
        System.out.println("Tas ir vienādmalu trīsstūris? " + isEquilateral());
    }
}


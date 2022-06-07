package classroomFour;

public class Velosipeds {
    int atrumi = 21;
    String nosaukums = "Specialzed";
    String krasa ="Melns";
    int svarsGramos;
    double rataIzmers;
    int atrums = 0;
    String bremzuTips = "";


    public void bremze1() {
        if (bremzuTips.equals("V-veida")) {
            atrums = atrums - 2;
        } else if (bremzuTips.equals("Disku")) {
            atrums = atrums - 3;
        } else {
            atrums = atrums - 1;
        }
    }


    public void bremze(){
        atrums--;
    }

    public void spiedPedalus(){
        atrums++;
    }



}

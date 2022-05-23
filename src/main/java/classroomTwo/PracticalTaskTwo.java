package classroomTwo;

public class PracticalTaskTwo {
    public static void main(String[] args) {


        String name = "Matīss";
        String surname = "Geinerts";
        String role = "Students";
        double videjaAtzime = 7.3214;

        String concatTeikums = "Mani sauc " + name + " Mans uzvārds ir " + surname + " Es esmu " + role;
        String teikums = String.format("Mani sauc %s. Mans uzvārds ir %s. Es esmu %s. Mana vid atz ir %.1f",name,surname,role,videjaAtzime);

        System.out.println(teikums);
        System.out.println(concatTeikums);




    }
}

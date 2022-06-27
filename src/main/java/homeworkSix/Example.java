package homeworkSix;


import java.util.Date;


public class Example {

        public static void main (String[] args) {

            Customer customer1 = new Customer("Matīss Geinerts", true, "Premium");
            Customer customer2 = new Customer("Anna Bērziņa", true, "Gold");
            Customer customer3 = new Customer("Jana Kalniņa", true, "Silver");
            System.out.println(customer1.toString());
            System.out.println(customer2.toString());
            System.out.println(customer3.toString());

            Visit visit = new Visit(customer1, new Date());
            System.out.println(visit.toString());

            visit.setProductExpense(8.5);
            visit.setServiceExpense(8.0);
            visit.setProductExpense(1.5);

            Visit visit2 = new Visit(customer2, new Date());
            System.out.println(visit2.toString());

            visit2.setProductExpense(5.0);
            visit2.setServiceExpense(10.5);
            visit2.setProductExpense(2.0);

            Visit visit3 = new Visit(customer3, new Date());
            System.out.println(visit3.toString());

            visit3.setProductExpense(7.4);
            visit3.setServiceExpense(9.0);
            visit3.setProductExpense(3.6);

            System.out.println(visit.toString());
            System.out.println("Kopējie izdevumi " + visit.getCustomerName() + " = " + String.format("%.2f",visit.getTotalExpense()));

            System.out.println(visit2.toString());
            System.out.println("Kopējie izdevumi " + visit2.getCustomerName() + " = " + String.format("%.2f",visit2.getTotalExpense()));

            System.out.println(visit3.toString());
            System.out.println("Kopējie izdevumi " + visit3.getCustomerName() + " = " + String.format("%.2f",visit3.getTotalExpense()));

        }


}

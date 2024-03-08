package Task1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Customer c1 = new Customer("Casper", "Gervig", "Gervig91");
        Customer c2 = new Customer("Jens", "Jensen", "Jense");

//        System.out.println(c1);
//        System.out.println(c2);

//        En anden måde at instantiere og add et nyt objekt til en array list på en linje
//        customerList.add(new Customer("Peter", "Parker","Spiderman"));

//        customerList.get(1) retunere dataypen Customer
//        Customer Mathias = customerList.get(1);

        customerList.add(c1);
        customerList.add(c2);
        printCustomers(customerList);
    }

    static ArrayList<Customer> customerList = new ArrayList<>();

    //  1.e + 1.f
    public static void printCustomers(ArrayList<Customer> customerList) {
        for (Customer c : customerList) {
//            toString() er ikke nødvendigt at skrive
//            kunne bare skrive System.out.println(c);
            System.out.println(c.toString());

//            System.out.println(c.getUserName());
//            Vil printe kun usernames, men for hele listen

//            System.out.println(customerList.get(1).getUserName());
//            Vil printe username for objektet nr 2 i listen (index 1),
//            Men den vil printe det 2 gange, pga. vores for each loop
        }
    }
}
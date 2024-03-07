package Task1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Customer c1 = new Customer("Casper", "Gervig", "Gervig91");
        Customer c2 = new Customer("Jens", "Jensen", "Jense");
//        System.out.println(c1);
//        System.out.println(c2);
        customers.add(c1);
        customers.add(c2);
        printCustomers(customers);
    }

    static ArrayList<Customer> customers = new ArrayList<>();

    //  1.e + 1.f
    static void printCustomers(ArrayList<Customer> list) {
        for (Customer c : list)
            System.out.println(c);
    }
}

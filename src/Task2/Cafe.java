package Task2;

import Task1.Customer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

//  2.a
public class Cafe {
    private ArrayList<String> coffeeMenu = new ArrayList<>();

    //  Constructor start
    Cafe() {
    }   // Constructor end

    //  2.c
    public void loadMenuData() {
        File file = new File("src/Task2/coffees.txt");
        try {
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()) {
                // Gemmer det i en String, men er ikke nødvendigt,
                // Kunne bare skrive coffeeMenu.add(scan.nextLine());
                String data = scan.nextLine();
                coffeeMenu.add(data);
            }
            System.out.println("Menu data loaded. Total items: " + coffeeMenu.size());
            // Continue with reading the file and processing data
        } catch (FileNotFoundException e) {
            System.out.println("File not found. Check path and filename");
            System.out.println("Current directory: " + System.getProperty("user.dir"));
        }
    }

    public void getCoffeMenu() {
        for (String c : this.coffeeMenu)
            System.out.println(c);
    }
}
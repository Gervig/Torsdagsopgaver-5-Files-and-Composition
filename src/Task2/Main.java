package Task2;

import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

//  2.b
public class Main {
    public static void main(String[] args) {
        Cafe cafe1 = new Cafe ();
        cafe1.loadMenuData();
        cafe1.getCoffeMenu();
    }
}
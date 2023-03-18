package project;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class laptopMain {
    public static void main(String[] args) {
        
        Laptop asus = new Laptop("Asus", 11.6, "Windows", 4, 64, false);
        Laptop apple = new Laptop("Apple", 13.0, "MacOS", 8, 512, false);
        Laptop lenovo = new Laptop("Lenovo", 15.6, "Windows", 8, 256, false);
        Laptop dell = new Laptop("Dell", 15.6, "Linux", 16, 1024, true);
        Laptop acer = new Laptop("Acer", 15.6, "Linux", 16, 512, true);
        Laptop samsung = new Laptop("Samsung", 11.6, "Linux", 8, 32, false);
        Laptop razer = new Laptop("Razer", 17.3, "Linux", 32, 512, true);
        Laptop microsoft = new Laptop("Microsoft", 13.5, "Linux", 8, 256, false);

        // List<Laptop> laptops = new ArrayList<>();
        List<Laptop> laptopss = List.of(asus, apple, lenovo, dell, acer, samsung, razer, microsoft);

        Options filters = new Options();
        filters.userInterface();


    }

    

}

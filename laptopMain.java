package project;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class laptopMain {
    public static void main(String[] args) {
        
        Laptop asus = new Laptop("Asus", 11.6, "Windows", 4, 64, false);
        Laptop apple = new Laptop("Apple", 13.0, "MacOS", 8, 512, false);
        Laptop lenovo = new Laptop("Lenovo", 15.6, "Windows", 8, 256, false);
        Laptop dell = new Laptop("Dell", 15.6, "Linux", 16, 1024, true);
        Laptop acer = new Laptop("Acer", 15.6, "Windows", 16, 512, true);
        Laptop samsung = new Laptop("Samsung", 11.6, "Windows", 8, 32, true);
        Laptop razer = new Laptop("Razer", 17.3, "Linux", 32, 512, true);
        Laptop microsoft = new Laptop("Microsoft", 13.5, "Windows", 8, 256, false);

        List<Laptop> allLaptops = List.of(asus, apple, lenovo, dell, acer, samsung, razer, microsoft);
        List<Laptop> selectedLaptops = new ArrayList<>(List.copyOf(allLaptops));
        // System.out.println(laptopss);
        // System.out.println(selection);

        Options selectOptions = new Options();
        Map<Integer, Object> filters = selectOptions.userInterface();
        // filters.put(1, "Windows");
        // filters.put(2, 0.0);
        // filters.put(3, 8);
        // filters.put(4, 512);
        // filters.put(5, true);
        // System.out.println(filters);

        filtration(selectedLaptops, filters);  
    }
    
    private static void filtration(List<Laptop> selection, Map<Integer, Object> filter) {
        for (int i = 0; i < selection.size(); i++) {
            if (filter.containsKey(1)) {
                if (!selection.get(i).OS.equals(filter.get(1))) {
                    selection.remove(i);
                    i--;
                }
            }
        }
        for (int i = 0; i < selection.size(); i++) {
            if (filter.containsKey(2)) {
                if ((Double) filter.get(2) == 0.0) {
                    if (selection.get(i).screenSize > 15.0) {
                        selection.remove(i);
                        i--;
                    }
                }
                if ((Double) filter.get(2) == 15.0) {
                    if (selection.get(i).screenSize < 15.0) {
                        selection.remove(i);
                        i--;
                    }
                }
            }
        }
        for (int i = 0; i < selection.size(); i++) {
            if (filter.containsKey(3)) {
                if (selection.get(i).RAM < (Integer) filter.get(3)) {
                    selection.remove(i);
                    i--;
                }
            }
        }
        for (int i = 0; i < selection.size(); i++) {
            if (filter.containsKey(4)) {
                if (selection.get(i).HDsize < (Integer) filter.get(4)) {
                    selection.remove(i);
                    i--;
                }
            }
        }
        for (int i = 0; i < selection.size(); i++) {
            if (filter.containsKey(5)) {
                if (!selection.get(i).gaming.equals(filter.get(5))) {
                    selection.remove(i);
                    i--;
                }
            }
        }
        for (Laptop laptop : selection) {
            System.out.println(laptop);
        }
    }
}

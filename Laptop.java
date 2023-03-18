package project;
/* Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
Создать множество ноутбуков.
Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например: “Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет …
Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
Отфильтровать ноутбуки из первоначального множества и вывести проходящие по условиям. */

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Laptop {
    String unit;
    int RAM;
    int HDsize;
    double screenSize;
    String OS;
    boolean gaming;

    Map<Integer, String> mapp = new HashMap<>();    // Map - интерфейс, HashMap - реализация
        // mapp.put(1, "text");

    public  Laptop(String unit, double screenSize, String OS, int RAM, int HDsize, boolean gaming) {
        this.unit = unit;
        this.RAM = RAM;;
        this.HDsize = HDsize;
        this.screenSize = screenSize;
        this.OS = OS;
        this.gaming = gaming;
    }

    void addtomap (int key, String val) {
        mapp.put(key, val);
    }
    
    // void userInterface() {
    //     // Scanner scan = new Scanner(System.in);
    //     System.out.println("Select filter option:\n1 - OS\n2 - screen size\n3 - RAM\n4 - HD size\n5 - suitable for gaming\n0 - exit");
    //     // System.out.println("Choose OS: enter 1 for Windows, 2 for MacOS, 3 for Linux, 0 if no matter");
    //     // int select = scan.nextInt();
    //     // System.out.printf("Привет, %s!", select);
    //     // scan.close();
    // }

/*    private static void userInterface() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Select filter option:\n1 - OS\n2 - screen size\n3 - RAM\n4 - HD size\n5 - suitable for gaming\n0 - exit");
        int select = scan.nextInt();
        switch (select) {
            case 1:
                System.out.println("Choose OS: enter 1 for Windows, 2 for MacOS, 3 for Linux, 0 for exit");
                int ram = scan.nextInt();
                switch (ram) {
                    case 1:
                        System.out.println("Ok Windows");
                        // listt.add("Windows");
                        break;
                    case 2:
                        System.out.println("Ok MacOS");
                        break;
                    case 3:
                        System.out.println("Ok Linux");
                        break;
                    default:
                        System.out.println("ok exit");
                        userInterface();
                        break;
                }
                break;
            case 2:
                
                break;
            case 3:
                
                break;        
            default:
                break;
        }
        // System.out.printf("Привет, %s!", select);
        scan.close();
    }*/

    public String toString() {
        return unit + " " + screenSize + "\" " + OS + ", RAM " + RAM + "GB, HD " + HDsize + "GB";
    }


}

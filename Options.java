package project;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Options {
    Map<Integer, Object> options = new HashMap<>();

    Map<Integer, Object> userInterface() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Select filter option:\n1 - OS\n2 - screen size\n3 - RAM\n4 - HD size\n5 - suitable for gaming\n0 - exit");
        int select = scan.nextInt();
        switch (select) {
            case 1:
                System.out.println("Choose OS: enter 1 for Windows, 2 for MacOS, 3 for Linux, 0 for exit");
                int os = scan.nextInt();
                switch (os) {
                    case 1:
                        System.out.println("Ok Windows");
                        options.put(1, "Windows");
                        break;
                        case 2:
                        System.out.println("Ok MacOS");
                        options.put(1, "MacOS");
                        break;
                        case 3:
                        System.out.println("Ok Linux");
                        options.put(1, "Linux");
                        break;
                    default:
                        System.out.println("ok exit");
                        userInterface();
                        break;
                }
                userInterface();
                break;
                case 2:
                System.out.println("Select screen size range: \n1 - less the 15\"\n2 - more than 15\"\n0 - exit");
                int ss = scan.nextInt();
                if (ss == 1) {
                    options.put(2, 0.0);
                }
                else if (ss == 2) {
                    options.put(2, 15.0);
                }
                else userInterface();
                userInterface();
                break;        
            case 3:
                System.out.println("Enter minimum value of RAM (GB): ");
                int ram = scan.nextInt();
                System.out.println("Ok " + ram);
                options.put(3, ram);
                userInterface();
                break;
            case 4:
                System.out.println("Enter minimum value of HD (GB): ");
                int hd = scan.nextInt();
                options.put(4, hd);
                userInterface();
                break;
            case 5:
                System.out.println("Suitable for gaming? yes/no ");
                String game = scan.next();
                if (game.toLowerCase().equals("yes")) {
                    System.out.println("okay yes");
                    options.put(5, true);
                }
                else if (game.toLowerCase().equals("no")) {
                    System.out.println("okay no");
                    options.put(5, false);
                }
                else System.out.println("okay whatever");
                break;
            default:
                break;
        }
        scan.close();
        return options;
    }
}

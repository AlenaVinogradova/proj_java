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

public class Laptop {
    String unit;
    Integer RAM;
    Integer HDsize;
    Double screenSize;
    String OS;
    Boolean gaming;

    public  Laptop(String unit, double screenSize, String OS, int RAM, int HDsize, Boolean gaming) {
        this.unit = unit;
        this.RAM = RAM;;
        this.HDsize = HDsize;
        this.screenSize = screenSize;
        this.OS = OS;
        this.gaming = gaming;
    }

    public String toString() {
        return unit + " " + screenSize + "\" " + OS + ", RAM " + RAM + "GB, HD " + HDsize + "GB";
    }
}

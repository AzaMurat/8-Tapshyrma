package peaksoft.com;

import org.hibernate.Session;
import peaksoft.com.entity.Colleagues;
import peaksoft.com.util.Hibernate;
import service.Fabric;
import service.FabricImpl;

import java.io.IOException;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.List;
import java.util.Scanner;

public class App {
    static Fabric fabric = new FabricImpl();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

//        Colleagues colleagues = new Colleagues("Daniel", "Abdykadyrov", "teknik", 35);
//        Colleagues colleagues1 = new Colleagues("Syrbek", "Rysbaev", "teknik", 34);
//        Colleagues colleagues2 = new Colleagues("Tariel", "Umaraliev", "manager", 37);
//        Colleagues colleagues3 = new Colleagues("Azamat", "Muratov", "programmer", 34);
//        Colleagues colleagues4 = new Colleagues("Aza", "Sydykov", "teknik", 33);
//        Colleagues colleagues5 = new Colleagues("Bakyt", "Myrzabekov", "driver", 28);
//        Colleagues colleagues6 = new Colleagues("Azamat", "Usekov", "teknik", 36);
//        Colleagues colleagues7 = new Colleagues("Ulan", "Attokurov", "cook", 36);
//        Colleagues colleagues8 = new Colleagues("Azamjon", "Hakimjanov", "welder", 43);
//        Colleagues colleagues9 = new Colleagues("Azatbek", "Jumaev", "designer", 23);
//        fabric.create(colleagues);
//        fabric.create(colleagues1);
//        fabric.create(colleagues2);
//        fabric.create(colleagues3);
//        fabric.create(colleagues4);
//        fabric.create(colleagues5);
//        fabric.create(colleagues6);
//        fabric.create(colleagues7);
//        fabric.create(colleagues8);
//        fabric.create(colleagues9);
//        System.out.println(fabric.getById(7));
//        for (Colleagues s : fabric.getAllUsers()) {
//            System.out.println(s);
//        fabric.delateById(10);
//        fabric.deleteAllTable();
        while (true) {
            print();
            int num = scanner.nextInt();
            if (num == 1) {
                for (Colleagues s : fabric.getAllUsers()) {
                    System.out.println(s);
                }
            } else if (num == 2) {
                System.out.println(fabric.reade());

            } else if (num == 3) {
                fabric.updateAllName();
            } else if (num == 4) {
                fabric.cleaneAllName();
            } else if (num == 5) {
                fabric.deleteAllTable();
            } else {
                break;
            }

        }
    }
    public static void print(){
        System.out.println("Таблицаны жалпы корсотуу учун-->1");
        System.out.println("Аты Аза жана жашы 20дан чон болгон баардык жумушчуларды алуу учун-->2");
        System.out.println("Аты Аза болгон жумушчулардын жашын 18ге озгортуу учун-->3");
        System.out.println("Аты Аза болгон жумушчуларды очуруу учун-->4");
        System.out.println("Таблицаны тазалоо учун-->5");
    }
}
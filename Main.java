package com.company;

import java.util.Scanner;

public class Main {
    String teleskopType;
    int newTelescope;
    int secondHand;
    String ID;
    String ds, ss, land;

    //konstruktor na którym opiera sie wprowadzanie modeli teleskopów.
    public Main(String typTeleskopu, int nowyTeleskop, int uzywany, String forDs, String forSs, String forLand, String numer) {
        teleskopType = typTeleskopu;
        newTelescope = nowyTeleskop;
        secondHand = uzywany;
        ds = forDs;
        ss = forSs;
        land = forLand;
        ID = numer;

    }

    public void teleskop() {
        System.out.println("Wybrany teleskop jest to " + teleskopType);
        System.out.println("Fabrycznie nowy kosztuje okolo " + newTelescope + " zlotych, cena uzywanych egzemplarzy to okolo " + secondHand + " zlotych");
        System.out.println("Teleskop do obserwacji obiektow glebokiego nieba jest " + ds);
        System.out.println("Teleskop jest " + ss + " jesli chodzi o obserwacje ukladu slonecznego i " + land + " w przypadku obserwacji naziemnych");


    }

    public void wyswietl() {
        System.out.println("1. Sky Watcher Dobson 8");
        System.out.println("2. Sky Watcher Dobson 16");
        System.out.println("3. Sky Watcher ED100Pro");
        System.out.println("4. Sky Watcher 150/750 Achromat");
        System.out.println("5. GSo Classic Cassegrain 8");
        System.out.println("6. Sky Watcher ED80");
    }

    public static void main(String[] args) {
        Main SkyWatcher8Dob = new Main("Teleskop Newtona", 1250, 900, "Bardzo dobry", "Dobry", "Kiepski", "1. Sky Watcher Dobson 8");
        Main SkyWatcher16Dob = new Main("Teleskop Newtona", 8000, 5000, "Doskonaly", "Dobry", "Kiepski", "2. Sky Watcher Dobson 16");
        Main SkyWatcherED100 = new Main("Refraktor ED", 3000, 2000, "Sredni", "Bardzo dobry", "Dobry", "3. Sky Watcher ED100Pro");
        Main SkyWatcher150F5AC = new Main("Refraktor achromatyczny", 3000, 1500, "Bardzo dobry", "Kiepski", "Kiepski", "4. Sky Watcher 150/750");
        Main GSO8Cassegrain = new Main("Klasyczny Cassegrain", 2500, 1800, "Dobry", "Bardzo dobry", "kiepski", "5. GSO Classic Cassegrain 8");
        Main SkyWatcherED80 = new Main("Refraktor ED", 2500, 1500, "Sredni", "Dobry", "Bardzo dobry", "6. Sky Watcher ED80");

        System.out.println("Hej kumplu");
        System.out.println("Mam dla Ciebie kilka modeli teleskopów, wybierz odpowiedni numer teleskopu i wcisnij Enter by się o nim czegoś dowiedzieć");
        SkyWatcher8Dob.wyswietl();

        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        switch (a) {
            case 1:
                SkyWatcher8Dob.teleskop();
                break;
            case 2:
                SkyWatcher16Dob.teleskop();
                break;
            case 3:
                SkyWatcherED100.teleskop();
                break;
            case 4:
                SkyWatcher150F5AC.teleskop();
                break;
            case 5:
                GSO8Cassegrain.teleskop();
                break;
            case 6:
                SkyWatcherED80.teleskop();
                break;
            default:
                System.out.println("wybrales zly numer");

        }
    }
}
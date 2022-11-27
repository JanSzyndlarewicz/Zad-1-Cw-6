package Main;

import Osoba.Firma;
import Osoba.Klient;
import Osoba.Prywatny;

public class Main {
    public static void main(String[] args) {
        Klient[] klient = new Klient[4];

        klient[0] = new Prywatny("Kacper", "Grzyb", "16.03.1994", "2345675", "18.05.2020", "Basic", 89, 10, false);
        klient[1] = new Prywatny("Tomasz", "Kąt", "14.06.1989", "43245234", "13.01.2021", "Extended", 149, 5, true);
        klient[2] = new Firma("Jan", "Kowalski", "01.12.1990", "1232102", "12.03.2020", "Basic+", 2049, "100232421", 15, 20, "Multisport");
        klient[3] = new Firma("Jakub", "Brzęk", "04.11.1993", "1258252", "16.10.2019", "Premium", 1849, "138921942", 9, 15, "Multisport, Medicover");

        for(int i=0; i<klient.length; i++){
            System.out.println(klient[i].toString());
        }
    }
}
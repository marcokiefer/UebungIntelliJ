package de.gbsschulen.sa3;


public class Testklasse {
    public static void main(String[] args) {
        Auto auto = new Auto("WA - A 2323", "silber");
        auto.setAnzahlPS(-123);
        auto.setInOrdnung(false);
        auto.datenwerteGeben();
        Auto auto1 = new Auto("W - D 6523", "blau");
        Auto auto2 = new Auto("AQW - D 1", "rot");

        Autowarteschlange autowarteschlange = new Autowarteschlange(3);
        Auto abgefahrenesAuto = autowarteschlange.vorneAbfahren();
        if (abgefahrenesAuto == null ){
            System.out.println("Passt");
        }
        autowarteschlange.hintenAnstellen(auto);
        autowarteschlange.hintenAnstellen(auto1);
        autowarteschlange.hintenAnstellen(auto2);
        System.out.println(autowarteschlange);
        autowarteschlange.hintenAnstellen(new Auto("SB-D-23","black"));

    }
}

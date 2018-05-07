package com.sabel.dome;

public class Testklasse {

    public static void main(String[] args) {
        Medium cd1 = new CD("Help!",80,"The Beatles",14);
        Medium cd2 = new CD("Dire Straits",42,"Dire Straits",9);
        Medium dvd1 = new DVD("Das Leben des Brain",90,"Terry Jones");
        Medium dvd2 = new DVD("Rocky",114,"John G. Avildsen");

        Datenbank datenbank = new Datenbank();
        datenbank.erfasseMedium(cd1);
        datenbank.erfasseMedium(cd2);
        datenbank.erfasseMedium(dvd1);
        datenbank.erfasseMedium(dvd2);
        datenbank.auflisten();


    }
}

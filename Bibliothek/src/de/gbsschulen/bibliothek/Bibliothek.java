package de.gbsschulen.bibliothek;

import java.util.HashMap;
import java.util.Set;

public class Bibliothek {
    private HashMap<String,Buch> map;

    public Bibliothek() {
        this.map = new HashMap<>();
    }

    public Buch hinzufuegen(Buch b) {
        String isbn = b.getIsbn();
        return this.map.put(isbn,b);
    }

    public Buch suchen(String isbn){
        return this.map.get(isbn);
    }

    public Buch suchen(Buch buch){
        return suchen(buch.getIsbn());
    }

    @Override
    public String toString() {
        String result = "";
        Set<String> keys = map.keySet();

    }

}

package de.gbsschulen.bibliothek;

public class Testklasse {
    public static void main(String[] args) {
        Buch buch = new Buch(new Autor("Sierra"),"Java von Kopf bis Fuss","978-3-89721-448-4",2006);
        Buch buch1 = new Buch(new Autor("Bloch"),"Effective Java","978-0-321-35668-0",2008);
        Buch buch2 = new Buch(new Autor("Throll"),"MySQL","978-3-89842-188-1",2002);

        Bibliothek bibliothek = new Bibliothek();
        bibliothek.hinzufuegen(buch);
        bibliothek.hinzufuegen(buch1);
        bibliothek.hinzufuegen(buch2);

        Buch test = bibliothek.suchen("978-3-89721-448-4");
        if( test != null ) {
            System.out.println("Gesuchtes Buch: " + test);
        }
    }




}

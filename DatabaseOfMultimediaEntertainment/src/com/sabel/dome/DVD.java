package com.sabel.dome;

public class DVD extends Medium {
    private String regisseur;

    public DVD(String titel, int spielzeit, String regisseur) {
        super(titel, spielzeit);
        this.regisseur = regisseur;
    }

    public String gibRegisseur() {
        return regisseur;
    }

}

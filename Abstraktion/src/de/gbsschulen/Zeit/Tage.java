package de.gbsschulen.Zeit;


public class Tage extends Zeit {
    private long tage;

    public Tage(long tage) {
        this.tage = tage;
    }

    @Override
    public long getMinuten() {
        return this.tage * 24 * 60;
    }
}

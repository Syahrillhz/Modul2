package com.Syahril.Modul2.Polimorfisme;

public class DemoOverloading {
    public static void main(String[] args) {
        Lagu lagu1 = new Lagu("Odading");
        Lagu lagu2 = new Lagu("Halu", "Feby");

        lagu1.getDataLagu();
        lagu2.getDataLagu();
    }
}

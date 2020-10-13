package com.Syahril.Modul2.Polimorfisme;

public class Lagu {
    //variabel
    public String judul;
    public String pencipta;
    //Method
    //Overloading
    public Lagu(String judul) {
        this.judul = judul;
    }
    //Overloading
    public Lagu(String pencipta, String judul) {
        this.pencipta = pencipta;
        this.judul = judul;
    }
    //Print
    public void getDataLagu(){
        System.out.println("Judul\t\t: " + judul);
        System.out.println("Pencipta\t: " + pencipta);
        System.out.println();
    }
}

package BangunRuang.java;

import java.util.Scanner;

public class Tabung extends BangunRuang {
    private double tinggi;
    private double jari_jari;

    public Tabung(String nameBangun) {
        super(nameBangun);
    }

    @Override
    public void inputNilai() {
        super.inputNilai();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input tinggi: ");
        tinggi = scanner.nextDouble();
        System.out.print("Input jari-jari: ");
        jari_jari = scanner.nextDouble();
    }

    @Override
    public void luasPermukaan() {
        super.luasPermukaan();
        double hasil = 2 * Math.PI * jari_jari * (jari_jari + tinggi);
        System.out.println("Hasil luas permukaan: " + hasil);
    }

    @Override
    public void volume() {
        super.volume();
        double hasil = Math.PI * Math.pow(jari_jari, 2) * tinggi;
        System.out.println("Hasil volume: " + hasil);
    }
}


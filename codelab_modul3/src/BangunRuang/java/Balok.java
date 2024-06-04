package BangunRuang.java;

import java.util.Scanner;

public class Balok extends BangunRuang {
    private double panjang;
    private double lebar;
    private double tinggi;

    public Balok(String nameBangun) {
        super(nameBangun);
    }

    @Override
    public void inputNilai() {
        super.inputNilai();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input panjang: ");
        panjang = scanner.nextDouble();
        System.out.print("Input lebar: ");
        lebar = scanner.nextDouble();
        System.out.print("Input tinggi: ");
        tinggi = scanner.nextDouble();
    }

    @Override
    public void luasPermukaan() {
        super.luasPermukaan();
        double hasil = 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
        System.out.println("Hasil luas permukaan: " + hasil);
    }

    @Override
    public void volume() {
        super.volume();
        double hasil = panjang * lebar * tinggi;
        System.out.println("Hasil volume: " + hasil);
    }
}

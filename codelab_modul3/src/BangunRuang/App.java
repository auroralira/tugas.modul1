package BangunRuang.java;
//import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Tabung tabung = new Tabung("Tabung");
        Kubus kubus = new Kubus("Kubus");
        Balok balok = new Balok("Balok");

        tabung.inputNilai();
        tabung.luasPermukaan();
        tabung.volume();

        kubus.inputNilai();
        kubus.luasPermukaan();
        kubus.volume();

        balok.inputNilai();
        balok.luasPermukaan();
        balok.volume();
    }
}

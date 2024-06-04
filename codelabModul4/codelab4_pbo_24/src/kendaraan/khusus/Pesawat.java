package kendaraan.khusus;

import kendaraan.Kendaraan;
import kendaraan.util.Flyable;

public class Pesawat extends Kendaraan implements Flyable {
    @Override
    public void Start() {
        System.out.println("Menyalakan pesawat " + this.getName());
    }
    @Override
    public void Stop() {
        System.out.println("Mematikan mesin pesawat " + this.getName());
    }
    @Override//metode yang di tambahkan
    public void Brake() {
        System.out.println("Pesawat " + this.getName() + " berhenti.");
    }
    @Override
    public void fly() {
        System.out.println("Pesawat " + this.getName() + " lepas landas.");
    }
}

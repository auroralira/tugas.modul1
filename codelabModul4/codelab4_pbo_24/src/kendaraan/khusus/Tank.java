package kendaraan.khusus;

import kendaraan.Kendaraan;
import kendaraan.util.ShootAble;
public class Tank extends Kendaraan implements ShootAble {//memperbaiki penulisan Shootable
    @Override
    public void Start() {
        System.out.println("Menyalakan Tank " + this.getName());//"tank" di hapus
    }
    @Override
    public void Stop() {
        System.out.println("Mematikan Tank " + this.getName());
    }
    @Override
    public void Brake() {
        System.out.println("Tank " + this.getName() + " berhenti.");//ditambahkan "Tank " + this.getName() + " berhenti"
    }
    @Override
    public void Shoot(String vehicle) {
            System.out.println("Tank " + this.getName() + " menembak " + vehicle + ".");//memperbaiki penulisan vehicle dan menambahkan this.getName
        }
    }


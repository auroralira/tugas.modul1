import java.util.ArrayList;
import java.util.Scanner;

class Mahasiswa {
    String nama;
    long nim;
    String jurusan;

    Mahasiswa(String nama, long nim, String jurusan) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
    }

    static void tampilUniversitas() {
        System.out.println("Universitas Muhammadiyah Malang");
    }

    String tampilDataMahasiswa() {
        return "Nama: " + nama + ", NIM: " + nim + ", Jurusan: " + jurusan;
    }
}

class Main {
    static ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    static void menu() {
        int pilihan;
        do {
            System.out.println("\nMenu:\n1. Tambah Data Mahasiswa\n2. Tampilkan Data Mahasiswa\n3. Keluar");
            System.out.print("Pilihan Anda: ");
            pilihan = scanner.nextInt();
            switch (pilihan) {
                case 1:
                    tambahDataMahasiswa();
                    break;
                case 2:
                    tampilkanDataMahasiswa();
                    break;
                case 3:
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 3);
    }

    static void tambahDataMahasiswa() {
        scanner.nextLine(); // membersihkan buffer
        System.out.print("Masukkan nama mahasiswa: ");
        String nama = scanner.nextLine();
        long nim;
        do {
            System.out.print("Masukkan NIM mahasiswa: ");
            nim = scanner.nextLong();
            if (String.valueOf(nim).length() != 15) {
                System.out.println("NIM Harus 15 Digit!!!");
            }
        } while (String.valueOf(nim).length() != 15);
        scanner.nextLine(); // membersihkan buffer
        System.out.print("Masukkan jurusan mahasiswa: ");
        String jurusan = scanner.nextLine();

        daftarMahasiswa.add(new Mahasiswa(nama, nim, jurusan));
        System.out.println("Data mahasiswa berhasil ditambahkan.");
    }

    static void tampilkanDataMahasiswa() {
        System.out.println("\nData Mahasiswa:");
        Mahasiswa.tampilUniversitas();
        for (Mahasiswa mahasiswa : daftarMahasiswa) {
            System.out.println(mahasiswa.tampilDataMahasiswa());
        }
    }
}
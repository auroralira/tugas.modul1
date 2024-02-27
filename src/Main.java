import java.util.Scanner;

public class Main {

    // Tentukan nama pengguna dan kata sandi admin
    private static final String adminUsername = "admin";
    private static final String adminPassword = "admin";

    // Tentukan panjang NIM mahasiswa
    private static final int NIM_LENGTH = 15;
    // Array untuk menyimpan data mahasiswa
    private static final String[] mahasiswa = {"202210370311203"};

    // Buat objek pemindai untuk input pengguna
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // Menampilkan menu utama
        menuUtama();
    }

    // Tampilkan menu utama dan minta pengguna untuk memilih opsi
    private static void menuUtama() {
        System.out.println("===== Library System====");
        System.out.println("1. Login as Student");
        System.out.println("2. Login as Admin");
        System.out.println("3. Exit");
        System.out.print("Choose option (1-3): ");

        // Dapatkan input pengguna
        int pilihan = input.nextInt();

        // Validasi input pengguna
        if (pilihan < 1 || pilihan > 3) {
            System.out.println("Invalid option. Please try again.");
            menuUtama();
        } else {
            // Jalankan opsi yang sesuai
            switch (pilihan) {
                case 1:
                    loginMahasiswa();
                    break;
                case 2:
                    loginAdmin();
                    break;
                case 3:
                    exit();
                    break;
            }
        }
    }
    // Minta pengguna untuk memasukkan NIM-nya dan periksa apakah valid
    private static void loginMahasiswa() {
        System.out.print("Enter your NIM: ");
        String nim = input.next();

        // Periksa apakah panjang NIM sudah benar
        boolean temukan = false;
        for (String student : mahasiswa) {
            if (student.equals(nim) && nim.length() == NIM_LENGTH) {
                temukan = true;
                break;
            }
        }
        if (temukan) {
            System.out.println("Successful Login as Student");
        } else {
            System.out.println("User Not Found");
        }
        menuUtama();
    }

    // Minta pengguna untuk memasukkan nama pengguna dan kata sandinya dan periksa apakah sudah benar
    private static void loginAdmin() {
        System.out.print("Enter your username (admin): ");
        String username = input.next();
        System.out.print("Enter your password (admin): ");
        String password = input.next();

        // Periksa apakah nama pengguna dan kata sandi cocok dengan kredensial admin
        if (username.equals(adminUsername) && password.equals(adminPassword)) {
            // Simulasikan login yang berhasil
            System.out.println("Successful Login as Admin");
        } else {
            // Menampilkan pesan error
            System.out.println("Admin User Not Found!!");
        }
        menuUtama();
    }

    // keluar dari program
    private static void exit() {
        System.out.println("adios");
        input.close();
        System.exit(0);
    }
}

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nama : ");
        String InputNama = scanner.next();

        System.out.print("Jenis Kelamin (L/P) : ");
        char jenisKelaminInput = scanner.next().charAt(0);
        String jenisKelamin = (jenisKelaminInput == 'L' || jenisKelaminInput == 'l')?"Laki-laki":"Perempuan";

        System.out.print("Tanggal Lahir(yyyy-mm-dd): ");
        String inputTanggalLahir = scanner.next();

        LocalDate tanggalLahir = LocalDate.parse(inputTanggalLahir);

        LocalDate sekarang = LocalDate.now();

        Period period = Period.between(tanggalLahir,sekarang);

        System.out.println("\nNama : "+InputNama);
        System.out.println("Jenis Kelamin : "+jenisKelamin);
        System.out.println("Umur Anda : "+period.getYears()+ " tahun "+period.getMonths()+" bulan");


    }
}
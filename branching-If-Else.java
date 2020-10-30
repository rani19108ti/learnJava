import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
      String namaLengkap, alamat, hobi;
        int tahunLahir, tahunMendaftar, tinggiBadan;

        Scanner userInput = new Scanner(System.in);

        System.out.println("FORMULIR PENDAFTARAN SISWA BARU");
        System.out.print("Nama Calon Siswa: ");
        // menggunakan scanner dan menyimpan input yang diketik di variabel namaLengkap
        namaLengkap = userInput.nextLine();

        System.out.print("Alamat: ");
        // menggunakan scanner dan menyimpan input yang diketik di variabel alamat
        alamat = userInput.nextLine();

        System.out.print("Hobi: ");
        // menggunakan scanner dan menyimpan input yang diketik di variabel hobi
        hobi = userInput.nextLine();

        System.out.print("Tahun Mendaftar: ");
        // menggunakan scanner dan menyimpan input yang diketik di variabel tahunMendaftar
        tahunMendaftar = userInput.nextInt();

        System.out.print("Tinggi Badan: ");
        // menggunakan scanner dan menyimpan input yang diketik di variabel tinggiBadan
        tinggiBadan = userInput.nextInt();

        System.out.print("Tahun Lahir: ");
        // menggunakan scanner dan menyimpan input yang diketik di variabel tahunLahir
        tahunLahir = userInput.nextInt();

        // usia
        int tahunIni = 2020;
        int usia = tahunIni - tahunLahir;

        // Menampilkan data calon siswa
        System.out.println("BIODATA SISWA BARU");
        System.out.println("Nama Lengkap: " + namaLengkap);
        System.out.println("Alamat: " + alamat);
        System.out.println("Hobi: " + hobi);
        System.out.println("Usia: " + usia + " tahun");
        System.out.println("Tinggi Badan " + tinggiBadan);
        if (tinggiBadan > 150) {
            System.out.println("Lulus");
        }
    }
}

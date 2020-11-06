import java.util.Scanner;

public class SoalA {
    public static void main(String[] args) {
        int scores; // Membuat variable scores dengan tipe data int
        
        Scanner userInput = new Scanner(System.in); 
        // menginisialisasi variable userInput sebagai penerima inputan

        System.out.print("Silakan input nilai Mata Kuliah PBO : ");
        scores = userInput.nextInt();
                  
            if (scores < 0){ // mengantisipasi kondisi jika user menginput nilai di bawah nol (0)
                System.out.println("Nilai < 0. Range nilai yang diinput harus 1 - 100");
            }else if (scores < 30){  // kondisi jika Nilai yang di input < 30 maka grade D
                System.out.println("Nilai " + scores + " adalah Grade D");
            }else if (scores < 50) { //kondisi jika Nilai yang di input budi < 50 maka grade C
                System.out.println("Nilai " + scores + " adalah Grade C");
            }else if (scores < 70) { // kondisi jika Nilai yang diinput < 70 maka grade B
                System.out.println("Nilai " + scores + " adalah Grade B");
            }else if (scores <=100) { // kondisi jika Nilai yang di input <= 100 maka grade A dan membatasi nilai 100
                System.out.println("Nilai " + scores + " adalah Grade A");
            }else{ // mengantisipasi kondisi jika user menginput nilai di atas 100
                System.out.println("Nilai > 100. Range nilai yang diinput harus 1 - 100");
            }

    }
}
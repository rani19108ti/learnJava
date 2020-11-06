import java.util.Scanner;

public class SoalB{
    public static void main(String[] args) {
        int i;
        int x;

        Scanner userInput = new Scanner(System.in);
        // menginisialisasi variable userInput sebagai penerima inputan

        System.out.print("Mau iterasi berapa kali? ");
        x = userInput.nextInt();

        int scores = 0; //Variabel untuk menyimpan nilai input dari user        
        for (i = 1; i <= x; i++)
        {
            System.out.print("Enter score " + i + ": "); //Meminta user menginput suatu nilai/ angka
            scores = userInput.nextInt(); 
            if (scores%2==0){ // kondisi untuk mengecek angka yang diinput adalah genap yaitu bilangan yang habis dibagi 2
                System.out.println("Iterasi ini adalah genap");
            }else{
                System.out.println("Iterasi ini adalah ganjil");
            }
        }
    }
}
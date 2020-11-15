import java.util.*;

public class Bank {
public String name;
public double tabungan;

public static void main(String[] args) {
int jumlahNasabah = 1;
List<Bank> listBankAccount = new ArrayList<Bank>();
    for (int i=0; i < jumlahNasabah; i++)  {
        Bank akunDibuat = new Bank(); 
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Masukkan nama nasabah ");
        akunDibuat.name = keyboard.next();

        Scanner keyboard2 = new Scanner(System.in);
        System.out.println("Masukkan jumlah tabungan ");
        akunDibuat.tabungan = keyboard2.nextDouble();

        listBankAccount.add(akunDibuat);
    } // akhir for loop;

    for (int i=0; i < listBankAccount.size(); i++) {
        Bank akunSementara = listBankAccount.get(i);
        System.out.println("Nasabah " + akunSementara.name + " memiliki tabungan " + akunSementara.tabungan);
    }
} // akhir main
} // akhir class
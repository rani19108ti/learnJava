public class BankAccount2{
    // membuat property/ variable
    double balance;
    String AccountName;

    //membuat default constructor (constructor without argument)
    public BankAccount2(){
        this.balance=0;
    }

    //membuat parameterized constructor (Overload constructor with string argument AccountName)
    public BankAccount2(double amount, String namaNasabah){
        this.balance=amount;
        this.AccountName=namaNasabah;

    }

    // membuat method transfer, void 2 argument → amount(double), dest(namaNasabah)
    void transfer(){
        System.out.println("Jumlah ditransfer: "+balance+" Akun Tujuan: "+AccountName);
    }

    public static void main (String args[]){
        BankAccount2 obj1 = new BankAccount2();
        BankAccount2 obj2 = new BankAccount2(1000, "Rani");
        obj1.transfer();
        obj2.transfer();
    }

}
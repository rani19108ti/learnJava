class BankSaving {
    private int balance;
    private String AccountName;
    public BankSaving(){
        this.balance=0;
    }
    public BankSaving(int saldo, String namaNasabah){
        this.balance=saldo;
        this.AccountName=namaNasabah;
    }
    void menabung(){
        int uangDiTabung = 1000; //jumlah uang yang ditabung
        int jumlahTabungan = balance + uangDiTabung; // Jumlah tabungan adalah balance ditambah uang yang ditabung
        System.out.println(jumlahTabungan);
    }
    void withdraw(){
        int uangDiTarik = 1500; // jumlah uang yang ditarik/ diambil
        int sisaTabungan = balance - uangDiTarik; // sisa tabungan adalah balance dikurangi uang yang ditarik
        System.out.println(sisaTabungan);
    }

    public static void main (String args[]){
        BankSaving obj1 = new BankSaving(3000, "Rani"); // membuat akun dengan nama nasabah Rani dan jumlah tabungan awal 3000;
        obj1.menabung(); 
        obj1.withdraw();    
    }
}
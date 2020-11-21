import java.math.*;
import java.text.DecimalFormat;
import java.io.*;
import java.util.*;


public class kalkulatorStatistik
{
    public static void main(String[] args)
    {
    Scanner myInput = new Scanner(System.in);
    System.out.println("Berapa jumlah data yang akan di-input : ");

    int size = myInput.nextInt();
    double grade = 0;

    double[] myArray = new double[size];
    
    for(int count = 0; count < myArray.length; count++)
    {
        System.out.println("Input data: ");
        grade = myInput.nextDouble();
    
        myArray[count] = grade;
        System.out.println("Data yang di-input adalah :  " + myArray[count] );
    }

    Statistik myScore = new Statistik(myArray, size);
    double avg = myScore.avgGrade();
    System.out.println("Rata-rata Nilai dari data yang di-input = " + avg);

    double median = myScore.calcMedian(myArray);
    System.out.println("Nilai Tengah  = " + median);
   
    int[] ubahInt = myScore.bikinInt(myArray);
    int modus = myScore.mode(ubahInt);
    System.out.println("---- Nilai modus = " + modus);

    }

}
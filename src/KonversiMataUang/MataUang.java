package KonversiMataUang;
import java.util.Scanner;
public class MataUang {

		   public static void main(String[] args) {
		  int  pilihan;
		  System.out.print("Masukkan nilai tukar Dollar ke Rupiah : ");
		  Scanner dolar = new Scanner(System.in);
		  int nilai_tukar = dolar.nextInt();
		  System.out.print("Masukkan 0 = dollar ke rupiah dan 1 = Rupiah ke Dollar : ");
		  Scanner opsi = new Scanner(System.in);
		  pilihan = opsi.nextInt();

		   if (pilihan == 0) {
		   System.out.print("Masukkan Jumlah Dollar yang akan ditukar  : ");
		   Scanner uang = new Scanner(System.in);
		   int nominal = uang.nextInt();
		   int dolarkerupiah = nominal * nilai_tukar;
		   System.out.println("USD $" + nominal
		     + " yang kamu tukar akan memperoleh Rp = Rp " + dolarkerupiah);
		  } else if (pilihan == 1) {
		   System.out.print("Masukkan jumlah Rupiah yang akan ditukar : ");
		   Scanner uang = new Scanner(System.in);
		   double nominal1 = uang.nextDouble();
		   double rupiahkedolar = nominal1 / nilai_tukar;
		   System.out.println("Rp. " + nominal1
		     + " yang kamu tukar akan memperoleh USD $" + rupiahkedolar);
		  } else {
		   System.out.print("Nilai yang diinputkan tidak sesuai");
		  }
		   
		 }
}

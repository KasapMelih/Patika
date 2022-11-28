package Patikajava101;
import java.util.Scanner;
public class Java101KDVHesaplama {

	public static void main(String[] args) {
	 System.out.print("Lutfen bir fiyat giriniz: ");
	Scanner scanner = new Scanner(System.in);
	int fiyat = scanner.nextInt();
	if (fiyat<1000) {
		double kdv = 0.18;
		double kdvDegeri= fiyat*kdv;	
		double kdvSizFiyat= fiyat-kdvDegeri;
		System.out.println("Urunun KDV'li fiyati: "+fiyat+"\n KDV'siz fiyati: "+kdvSizFiyat+"\n KDV degeri: "+kdvDegeri+" olmaktadır");
	}
	else {
		double kdv =0.08;
		double kdvDegeri= fiyat*kdv;	
		double kdvSizFiyat= fiyat-kdvDegeri;
		System.out.println("Urunun KDV'li fiyati: "+fiyat+"\n KDV'siz fiyati: "+kdvSizFiyat+"\n KDV degeri: "+kdvDegeri+" olmaktadır");
	}
	
	
	
	
	
	
	
	
	
	
	}

}

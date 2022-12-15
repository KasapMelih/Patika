package Patikajava101;
import java.util.Scanner;
public class java101BurcBulma {

	public static void main(String[] args) {
		/*Koç Burcu : 21 Mart - 20 Nisan
		Boğa Burcu : 21 Nisan - 21 Mayıs
		İkizler Burcu : 22 Mayıs - 22 Haziran
		Yengeç Burcu : 23 Haziran - 22 Temmuz
		Aslan Burcu : 23 Temmuz - 22 Ağustos
		Başak Burcu : 23 Ağustos - 22 Eylül
		Terazi Burcu : 23 Eylül - 22 Ekim
		Akrep Burcu : 23 Ekim - 21 Kasım
		Yay Burcu : 22 Kasım - 21 Aralık
		Oğlak Burcu : 22 Aralık - 21 Ocak
		Kova Burcu : 22 Ocak - 19 Şubat
		Balık Burcu : 20 Şubat - 20 Mart*/

		String ay;
		int gun;
		Scanner scan=new Scanner(System.in);
		System.out.print("Doğduğunuz ayı yazınız: ");
		ay=scan.nextLine();
		System.out.print("doğduğunuz günü giriniz: ");
		gun=scan.nextInt();
		if (ay.equals("ocak")) {
			if (gun<=21) {
				System.out.print("Oğlak burcusunuz.");
			}else
				System.out.print("Kova burcusunuz.");
		}
		if (ay.equals("subat")) {
			if (gun<=19) {
				System.out.print("Kova burcusunuz.");
			}else
				System.out.print("Balık burcusunuz.");
		}
		if (ay.equals("mart")) {
			if (gun<=20) {
				System.out.print("Balık burcusunuz.");
			}else
				System.out.print("Koç burcusunuz.");
		}
		if (ay.equals("nisan")) {
			if (gun<=20) {
				System.out.print("Koç burcusunuz.");
			}else
				System.out.print("Boğa burcusunuz.");
		}
		if (ay.equals("mayıs")) {
			if (gun<=21) {
				System.out.print("Boğa burcusunuz.");
			}else
				System.out.print("İkizler burcusunuz.");
		}
		if (ay.equals("haziran")) {
			if (gun<=22) {
				System.out.print("İkizler burcusunuz.");
			}else
				System.out.print("Yengeç burcusunuz.");
		}
		if (ay.equals("temmuz")) {
			if (gun<=22) {
				System.out.print("Yengeç burcusunuz.");
			}else
				System.out.print("Aslan burcusunuz.");
		}
		if (ay.equals("ağustos")) {
			if (gun<=22) {
				System.out.print("Aslan burcusunuz.");
			}else
				System.out.print("Başak burcusunuz.");
		}
		if (ay.equals("eylül")) {
			if (gun<=22) {
				System.out.print("Başak burcusunuz.");
			}else
				System.out.print("Terazi burcusunuz.");
		}
		if (ay.equals("ekim")) {
			if (gun<=22) {
				System.out.print("Terazi burcusunuz.");
			}else
				System.out.print("Akrep burcusunuz.");
		}
		if (ay.equals("kasım")) {
			if (gun<=21) {
				System.out.print("Akrep burcusunuz.");
			}else
				System.out.print("Yay burcusunuz.");
		}
		if (ay.equals("aralık")) {
			if (gun<=21) {
				System.out.print("Yay burcusunuz.");
			}else
				System.out.print("Oğlak burcusunuz.");
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}

package Patikajava101;
import java.util.Scanner;
public class java101BuyukVeKucukSayıBulma {

	public static void main(String[] args) {
		int sayac,sayı,enBuyuk=1,enKucuk=1;
		Scanner scan=new Scanner(System.in);
		System.out.print("Kaç tane sayı gireceksiniz:");
		sayac=scan.nextInt();
		for (int i=1;i<=sayac;i++) {
			System.out.print(i+". sayıyı girin:");
			sayı=scan.nextInt();
			while (i==1) {
				enBuyuk=sayı;
				enKucuk=sayı;
				break;
			}
			if (sayı>enBuyuk)
				enBuyuk=sayı;
			else if (sayı<enKucuk)
				enKucuk=sayı;
				
		}
		System.out.println("En büyük sayı:"+enBuyuk+"\nEn küçük sayı:"+enKucuk);
		
	}

}

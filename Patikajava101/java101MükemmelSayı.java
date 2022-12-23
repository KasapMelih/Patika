package Patikajava101;
import java.util.Scanner;
public class java101MükemmelSayı {

	public static void main(String[] args) {
		int sayı,toplam=0;
		Scanner scan=new Scanner(System.in);
		System.out.print("Bir sayı girin:");
		sayı=scan.nextInt();
		for (int i=1;i<sayı;i++) {
			if (sayı%i==0)
				toplam+=i;
		}
		if (toplam==sayı)
			System.out.println(sayı+" Mükemmel sayıdır.");
		else 
			System.out.println(sayı+" Mükemmel sayı değildir.");
	}
	

}

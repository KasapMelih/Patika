package Patikajava101;
import java.util.Scanner;
public class java101KullanıcıdanTelsayıAlan {

	public static void main(String[] args) {
		/*Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden
		 ve girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.*/
		int sayı;
		int total=0;
		Scanner scan=new Scanner(System.in);
		do {
			System.out.print("Bir sayı girin: ");
			sayı=scan.nextInt();
			if (sayı%2==0 && sayı%4==0)
				total +=sayı;
		}while (sayı%2==0);
		System.out.print("toplam: "+total);
	}

}

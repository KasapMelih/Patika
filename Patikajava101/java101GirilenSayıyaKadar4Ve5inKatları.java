package Patikajava101;
import java.util.Scanner;
public class java101GirilenSayıyaKadar4Ve5inKatları {

	public static void main(String[] args) {
		int sayı;
		Scanner scan=new Scanner(System.in);
		System.out.print("Bir sayı girin: ");
		sayı=scan.nextInt();
		for (int i=0;i<sayı;i++) {
			if (i%4==0 || i%5==0)
				System.out.print(i+",");
		}
			
		
		
		
		
	}

}

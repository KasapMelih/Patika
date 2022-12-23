package Patikajava101;
import java.util.Scanner;
public class java101AsalSayı {

	public static void main(String[] args) {
		int sayı,toplam;
		Scanner scan=new Scanner(System.in);
		System.out.print("Bir sayı girin: ");
		sayı=scan.nextInt();
		for (int i=1;i<=sayı;i++) {
			toplam=0;
			for (int k=1;k<=i;k++){
				if (i%k==0) {
					toplam+=1;
				}	
			}
			if (toplam==2)
				System.out.print(","+i);
		}

	}

}

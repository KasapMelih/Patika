package Patikajava101;
import java.util.Scanner;
public class java101HarmonikSayıBulma {

	public static void main(String[] args) {
		int n;
		double result=0;
		Scanner scan=new Scanner(System.in);
		System.out.print("Bir n değeri girin: ");
		n=scan.nextInt();
		for (int i=1;i<=n;i++) {
			result +=(1.0/i);
		}
		System.out.print("İşlemin sonucu: "+result);
	}

}

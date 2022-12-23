package Patikajava101;
import java.util.Scanner;
public class java101FibonacciDizisi {

	public static void main(String[] args) {
		int sayac=1,toplam=0,x=0,y=1,sayı;
		Scanner scan=new Scanner(System.in);
		System.out.print("fibonacci dizisinin kaç elemanlı olacağını yazın: ");
		sayı=scan.nextInt();
		System.out.print(sayı+" elemanlı fibonacci dizisi: ");
		while (sayac<=sayı) {
			toplam=x+y;
			System.out.print(x+" ");
			x=y;
			y=toplam;
			sayac++;
		}
	}

}

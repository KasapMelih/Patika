package Patikajava101;
import java.util.Scanner;
public class java101ÜslüSayıHesaplama {

	public static void main(String[] args) {
		int taban,kuvvet,total=1;
		Scanner scan =new Scanner(System.in);
		System.out.print("Taban değerni girin: ");
		taban=scan.nextInt();
		System.out.print("Kuvvet değerini girin: ");
		kuvvet=scan.nextInt();
		for (int i=1;i<=kuvvet;i++) {
			total=taban*total;
		}
		System.out.print(taban+" üzeri "+kuvvet+": "+total);
	}

}

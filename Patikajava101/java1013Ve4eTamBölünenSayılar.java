package Patikajava101;
import java.util.Scanner;
public class java1013Ve4eTamBölünenSayılar {

	public static void main(String[] args) {
		
		int sayı;
		Scanner scan=new Scanner(System.in);
		System.out.print("Bir sayı girin: ");
		sayı=scan.nextInt();
		for (int i=1;i<=sayı;i++) {
			if (i%3==0 && i%4==0)
				System.out.print(i+",");
		}
		System.out.println("\nSayıları 3'e ve 4'e tam bölünen sayılardır.");
	}

}

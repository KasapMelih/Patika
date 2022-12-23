package Patikajava101;
import java.util.Scanner;
public class java101TersUcgen {

	public static void main(String[] args) {
		int basamak;
		Scanner scan=new Scanner(System.in);
		System.out.print("Basamak sayısını girin:");
		basamak=scan.nextInt();
		for (int i=1;i<=basamak;i++) {
			int sayac=0,k=i;
			while (sayac<k) {
				System.out.print(" ");
				sayac++;
			}
			int j=i;
			if (i==1) {
			while (j<=(2*basamak-1)) {
				System.out.print("*");
				j++;
			}
			  }
			else {
			 while (j<=(2*basamak-i)) {
				 System.out.print("*");
				 j++;
			 }
			}
			System.out.println(" ");
		}
			
	
	
	}

}

package Patikajava101;
import java.util.Scanner;
public class java101EbobEkokWhile {

	public static void main(String[] args) {
		int sayı1,sayı2,x=1,ebob=1,ekok=1;
		Scanner scan=new Scanner(System.in);
		System.out.print("Bir sayı girin:");
		sayı1=scan.nextInt();
		System.out.print("Bir sayı girin:");
		sayı2=scan.nextInt();
		 if (sayı1>sayı2) {
			 x=sayı1;
			 sayı1=sayı2;
			 sayı2=x;
		 }
		 int i=sayı1;
		  while (i>=1) {
			  i--;
			  if (sayı1%i==0 && sayı2%i==0) {
				  ebob=i;
				  break;
			  }
		  }
		  int k=sayı1;
		  while (k<=(sayı1*sayı2)) {
			  if (k%sayı1==0 && k%sayı2==0) {
				ekok=k;
				break;
			  }
			  k++;
		  }
		  System.out.println(sayı1+" ve "+sayı2+" sayılarının EBOB u:"+ebob);
		  System.out.println(sayı1+" ve "+sayı2+" sayılarının EKOK u:"+ekok);
	}

}

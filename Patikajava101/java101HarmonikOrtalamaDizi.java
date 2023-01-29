package Patikajava101;
import java.util.Scanner;
import java.util.Scanner;

public class java101HarmonikOrtalamaDizi {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Sayi adedini girin: ");
		int n=scan.nextInt();
		double[] dizi=new double[n];
		
		 for (int i=0; i<n; i++) {
			 
			 System.out.print(i+1 +". deger:");
			  
			 dizi[i]=scan.nextInt();
		 }
		double harmonikSeri=0;
		  
		 for (int i=0; i<n; i++) {
			 harmonikSeri=0+(1/dizi[i]);
		 }
		 double harmonikOrt=n/harmonikSeri;
		 System.out.println("Sayilarin harmonik oratalamasi: "+harmonikOrt);

	}

}

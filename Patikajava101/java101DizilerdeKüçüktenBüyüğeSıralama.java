package Patikajava101;
import java.util.Scanner;

public class java101DizilerdeKüçüktenBüyüğeSıralama {

	public static void main(String[] args) {
		System.out.print("Sayi adedini girin: ");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		
		int[] dizi=new int[n];
		
		int x,y=1;
		
		for (int i=0; i<dizi.length; i++) {
			
			System.out.print(i+1 +". sayiyi girin: ");
			
			dizi[i]=scan.nextInt();
			
		}
		
		
		while (y!=dizi.length) {
		 
			for(int i=0; i<dizi.length-y; i++) {
			
			 if (dizi[i]>dizi[i+1]) {
				
				x=dizi[i];
				
				dizi[i]=dizi[i+1];
				
				dizi[i+1]=x;
			}
		}
		 y++;
		}
		
		

	}

}

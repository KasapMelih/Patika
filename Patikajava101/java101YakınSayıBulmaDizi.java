package Patikajava101;
import java.util.Scanner;
public class java101YakınSayıBulmaDizi {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Bir sayi girin: ");
		int n=scan.nextInt();
		
		System.out.println();
		
		int[] dizi= {15,12,788,1,-1,-788,2,0,n};
		
		int x,y=1;
		
		while (y!=dizi.length) {				//Diziyi küçükten büyüğe sırala.
		
		for (int i=0; i<dizi.length-y; i++) {
			
			if( dizi[i]>dizi[i+1]) {
				x=dizi[i];
				
				dizi[i]=dizi[i+1];
				
				dizi[i+1]=x;
			}
		}
		y++;
		}
		for (int i=0; i<dizi.length; i++) {			//Dizide girilen sayının yerini bul.
			if (dizi[i]==n) {
				System.out.print("Girilen sayi: "+n +"\n");
				System.out.print("Girilen sayidan küçük en yakin sayi: "+dizi[i-1]+"\n");
				System.out.print("Girilen sayidan büyük en yakın sayi: "+dizi[i+1]);
				
					
				}
					
				
			}
		}
		
			
	}



package Patikajava101;
import java.util.Scanner;
public class java101ArtıkYılBulma {

	public static void main(String[] args) {
	
	int yıl;
	Scanner scan=new Scanner(System.in);
	System.out.print("Bir yıl giriniz: ");
	yıl=scan.nextInt();
	if (yıl%100==0) {
		if (yıl%400==0)
			System.out.print(yıl+" artık yıldır.");
		else
			System.out.print(yıl+" artık yıl değildir.");
	}
	else if (yıl%4==0) 
		System.out.print(yıl+" artık yıldır.");
	else
		System.out.print(yıl+" artık yıl değildir.");
		
	
	}

}

package Patikajava101;
import java.util.Scanner;
public class java101TaksiMetreHesaplama {

	public static void main(String[] args) {
	double km,taksiMetre,ucret;
	ucret=2.20;
	Scanner scanner =new Scanner(System.in);
	System.out.print("Lutfen kac km yol gideceginizi yazınız: ");
	km=scanner.nextDouble();
	 taksiMetre=10;
	for(int i=0;i<km;i++) {
	taksiMetre=taksiMetre+ucret;
	}
	if(taksiMetre<20.0)
		System.out.println("Taksi ucretiniz 20 tl'dir.");
	else
		System.out.println("Taksi ucretiniz: "+taksiMetre+" tutmaktadir.");
	
	
	
	
	}

}

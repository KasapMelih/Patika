package Patikajava101;
import java.util.Scanner;
public class java101BkiHesaplama {

	public static void main(String[] args) {
	double boy,kilo,bki;
	Scanner scanner=new Scanner(System.in);
	System.out.print("Lutfen boyunuzu metre cinsinden giriniz: ");
	boy=scanner.nextDouble();
	System.out.print("Lutfen kilonuzu kg cinsinden giriniz: ");
	kilo=scanner.nextDouble();
	bki= kilo/(boy*boy);
	System.out.println("Boy kutle ideksiniz: "+bki);
	

	}

}

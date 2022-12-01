package Patikajava101;
import java.util.Scanner;
public class java101ManavKasaProblemi {

	public static void main(String[] args) {
	double Armut=2.14,Elma=3.67,Domates=1.11,Muz=0.95,Patlıcan=5.00,Muzkilo,Domateskilo,Elmakilo,Armutkilo,Patlıcankilo,toplam;
	Scanner scanner=new Scanner(System.in);
	System.out.print("Kac kilo armut alıcaksınız? :");
	Armutkilo=scanner.nextDouble();
	System.out.print("Kac kilo elma alıcaksnız? :");
	Elmakilo=scanner.nextDouble();
	System.out.print("Kac kilo domates alıcaksnız? :");
	Domateskilo=scanner.nextDouble();
	System.out.print("Kac kilo muz alıcaksnız? :");
	Muzkilo=scanner.nextDouble();
	System.out.print("Kac kilo patlıcan alıcaksnız? :");
	Patlıcankilo=scanner.nextDouble();
	toplam=(Armut*Armutkilo)+(Elma*Elmakilo)+(Domates*Domateskilo)+(Muz*Muzkilo)+(Patlıcan*Patlıcankilo);
	System.out.println("Toplam tutar:"+toplam+" TL" );
	
	}

}

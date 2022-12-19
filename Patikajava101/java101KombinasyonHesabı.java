package Patikajava101;
import java.util.Scanner;
public class java101KombinasyonHesabı {

	public static void main(String[] args) {
		int x,y,z,fak1=1,fak2=1,fak3=1,kombinasyon;
		Scanner scan =new Scanner(System.in);
		System.out.println("Kombinasyonunu hesaplamak istediğiniz iki değeri giriniz C(x,y)");
		System.out.print("X sayısını girin: ");
		x=scan.nextInt();
		System.out.print("Y sayısını girin: ");
		y=scan.nextInt();
		z=x-y;
		for (int i=1;i<=x;i++) {
			fak1*=i;
		}
		for (int i=1;i<=y;i++) {
			fak2*=i;
		}
		for (int i=1;i<=z;i++) {
			fak3*=i;
		}
		System.out.println("x!="+fak1+"\ny!="+fak2);
		kombinasyon=fak1/(fak2*fak3);
		System.out.print("C("+x+","+y+"): "+kombinasyon);
	
	
	
	
	}

}

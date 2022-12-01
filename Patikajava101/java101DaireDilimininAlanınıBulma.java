package Patikajava101;
import java.util.Scanner;
public class java101DaireDilimininAlanınıBulma {

	public static void main(String[] args) {
	double pi,alan;
	int a,r;
	Scanner scanner=new Scanner(System.in);
	System.out.print("Lutfen dairenin yarıcap degerini giriniz: ");
	r=scanner.nextInt();
	System.out.print("Lutfen daire diliminim acisini giriniz: ");
	a=scanner.nextInt();
	pi=3.14;
	alan=(pi*(r*r)*a)/360;
	System.out.println("Daire diliminin alani: "+alan);

	}

}

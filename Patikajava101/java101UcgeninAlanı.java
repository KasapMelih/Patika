package Patikajava101;
import java.util.Scanner;
public class java101UcgeninAlanı {

	public static void main(String[] args) {
	double a,b,c,u,alan;
	
	Scanner scanner=new Scanner(System.in);
	System.out.print("Lutfen ucgenin a kenarini giriniz: ");
	a=scanner.nextInt();
	System.out.print("Lutfen ucgenin b kenarini giriniz: ");
	b=scanner.nextInt();
	System.out.print("Lutfen ucgenin c kenarini giriniz: ");
	c=scanner.nextInt();
	u=(a+b+c)/2;
	alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));
	System.out.println("u: "+u);
	System.out.print("Ucgenin alani: "+alan);
	}

}

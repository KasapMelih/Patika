package Patikajava101;
import java.util.Scanner;
public class java101buyuktenKucugeSıralama {

	public static void main(String[] args) {
		int a,b,c;
		Scanner scanner=new Scanner(System.in);
		System.out.print("1'inci sayı:");
		a=scanner.nextInt();
		System.out.print("2'nci sayı: ");
		b=scanner.nextInt();
		System.out.print("3'üncü sayı: ");
		c=scanner.nextInt();
		if (a>b &&  a>c) {
			if (b>c) {
				System.out.print(a+">"+b+">"+c);
			}else
				System.out.print(a+">"+c+">"+b);
		}
		if (b>a &&  b>c) {
			if (a>c) {
				System.out.print(b+">"+a+">"+c);
			}else
				System.out.print(b+">"+c+">"+a);
		}
		if (c>b &&  c>a) {
			if (b>a) {
				System.out.print(c+">"+b+">"+a);
			}else
				System.out.print(c+">"+a+">"+b);
		}
	}

}

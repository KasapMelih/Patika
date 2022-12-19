package Patikajava101;
import java.util.Scanner;
public class java101GrilenSayınınRakamlarınınToplamı {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int number,basvalue,total=0;
		System.out.print("Bir sayı girin: ");
		number=scan.nextInt();
		int tempnumber=number;
		while (tempnumber !=0) {
			tempnumber /=10;
		}
		tempnumber=number;
		while (tempnumber!=0) {
			basvalue=tempnumber%10;
			total+=basvalue;
			tempnumber/=10;
		}
		System.out.print(number+" sayısının rakamları toplamı: "+total);
	}

}

package Patikajava101;
import java.util.Scanner;
public class Java101NotOrtalamasıBulma {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.print("Matematik notunuz: ");
	 int matematik = scanner.nextInt();
	System.out.print("Turkce notunuz: ");
	 int turkce = scanner.nextInt();
	System.out.print("Fizik notunuz: ");
	 int fizik =scanner.nextInt();
	System.out.print("Kimya notunuz: ");
	 int kimya = scanner.nextInt();
	System.out.print("Tarih notunuz: ");
	 int tarih =scanner.nextInt();
	System.out.print("Muzik notunuz: ");
	 int müzik =scanner.nextInt();
	int toplam = (matematik+turkce+fizik+kimya+tarih+müzik);
	double ortalama = toplam/6;
	System.out.print("Ortalamanız: "+ortalama);
	String durum = ortalama>60 ? "Gectiniz":"Kaldınız";
	System.out.println(durum);
	}

}

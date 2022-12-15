package Patikajava101;
import java.util.Scanner;
public class java101dersOrtalamHesabı {

	public static void main(String[] args) {
		int mat,turkce,fizik,kimya,tarih;
		Scanner scanner=new Scanner(System.in);
		System.out.print("Matematik notunuz: ");
		mat=scanner.nextInt();
		if (mat<0 || mat>100) {
			mat=0;
		}
		System.out.print("Türkçe notunuz: ");
		turkce=scanner.nextInt();
		if (turkce<0 || turkce>100) {
			turkce=0;
		}
		System.out.print("Fizik notunuz: ");
		fizik=scanner.nextInt();
		if (fizik<0 || fizik>100) {
			fizik=0;
		}
		System.out.print("Kimya notunuz: ");
		kimya=scanner.nextInt();
		if (kimya<0 || kimya>100) {
			kimya=0;
		}
		System.out.print("Tarih notunuz: ");
		tarih=scanner.nextInt();
		if (tarih<0 || tarih>100) {
			tarih=0;
		} 
		double avarage =(mat+turkce+fizik+kimya+tarih)/5;
		if (avarage<55)
			System.out.println("Sınıfta kaldınız.");
		else 
			System.out.println("Tebrikle sınıfı basşarı ile gectiniz.");
		System.out.print("Ortalamanız: "+avarage);
		
	}

}

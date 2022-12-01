package Patikajava101;
import java.util.Scanner;
public class java101HesapMakinesi {

	public static void main(String[] args) {
	int sayı1,sayı2,secim;
	Scanner scanner =new Scanner(System.in);
	System.out.print("Lutfen bir sayi giriniz: ");
	sayı1=scanner.nextInt();
	System.out.print("Lutfen bir sayi daha giriniz: ");
	sayı2=scanner.nextInt();
	System.out.print("Lutfen yapmak istediginiz islem turunu seciniz \n toplama(1) \n cıkarma(2) \n carpma(3) \n bolme(4) \n");
	secim=scanner.nextInt();
	switch(secim) {
	case 1: System.out.print("Islemin sonucu: "+(sayı1+sayı2));
	break;
	case 2: System.out.print("Islemin sonucu: "+(sayı1-sayı2));
	break;
	case 3: System.out.print("Islemin sonucu: "+(sayı1*sayı2));
	break;
	case 4: System.out.print("Islemin sonucu: "+(sayı1/sayı2));
	break;
	}
	
	
	
	
	

	}

}

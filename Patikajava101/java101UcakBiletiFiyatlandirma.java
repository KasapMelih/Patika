package Patikajava101;
import java.util.Scanner;
public class java101UcakBiletiFiyatlandirma {

	public static void main(String[] args) {
		/*Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
		Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
		Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
		Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
		Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
		Normal Tutar = Mesafe * 0.10 = 1500 * 0.10 = 150 TL
		Yaş İndirimi = Normal Tutar * Yaş İndirim Oranı = 150 * 0.10= 15 TL
		İndirimli Tutar = Normal Tutar – Yaş İndirimi = 150 – 15 = 135 TL
		Gidiş Dönüş Bilet İndirimi = İndirimli Tutar * 0.20 = 135 * 0.20 = 27 TL
		Toplam Tutar = (135-27)* 2 = 216 TL*/

		int mesafe,secim,yas;
		double normalTutar,yasIndirimi,indirimliTutar,gidisDonusBiletIndirimi,toplamTutar,yasIndirimOranı;
		Scanner scan=new Scanner(System.in);
		System.out.print("Lütfen gideceğiniz mesafeyi km cinsinden yazınız: ");
		mesafe=scan.nextInt();
		System.out.print("Lütfen yaşınızı girin: ");
		yas=scan.nextInt();
		System.out.print("Lutfen bilet rürünü seçiniz (1=>Tek yön - 2=>Gidiş dönüş): ");
		secim=scan.nextInt();
		if (mesafe<0 || secim>2 ||secim<1 || yas<0) 
			System.out.print("Hatalı veri girdiniz !");
		else {
		if (yas<12)
			yasIndirimOranı=0.5;
		else if (yas<24)
			yasIndirimOranı=0.10;
		else if (yas>65)
			yasIndirimOranı=0.30;
		else
			yasIndirimOranı=0;
		normalTutar=mesafe*0.10;
		yasIndirimi=normalTutar*yasIndirimOranı;
		indirimliTutar=normalTutar-yasIndirimi;
		if (secim==2) {
		gidisDonusBiletIndirimi=indirimliTutar*0.20;
		toplamTutar=(indirimliTutar-gidisDonusBiletIndirimi)*2;
			System.out.print("Bilet fiyatınız: "+toplamTutar);
		}
		else
			System.out.print("Bilet fiyatınız: "+indirimliTutar);
		}
			
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

package Patikajava101;
import java.util.Scanner;
public class java101Bankamatik {

	public static void main(String[] args) {
		String userName,password;
		Scanner scan=new Scanner(System.in);
		int right=3;
		int select;
		int balance=1500;
		while (right>0) {
			System.out.print("Kullanıcı adınızı girin: ");
			userName=scan.nextLine();
			System.out.print("Şifrenizi girin: ");
			password=scan.nextLine();
			if (userName.equals("patika") && password.equals("dev123")) {
				System.out.println("Merhaba,Kodluyoruz Bankasına hoşgeldiniz! ");
			    do {
				System.out.println("1-Para çekme\n"+"2-Para yatırma\n"+"3-Bakiye sorgulama\n"+"4-Çıkış yap");
			    System.out.print("Yapmak isteğiniz işlemi seçin: ");
			    select=scan.nextInt();
			    switch (select) {
				case 1 :  System.out.print("Para miktarı:");
				int price=scan.nextInt();
				if (price>balance)
					System.out.println("Bakiye yetersiz!");
				else 
				balance-=price;
				continue;
				case 2 : System.out.print("Para miktarı:");
				int price2=scan.nextInt();
				balance+=price2;
				continue;
				case 3 : System.out.println("Bakiyeniz:"+balance);
				continue;
					
			    }
			
			    }while (select!=4);
				break;
			}
			else {
				right--;
				if (right==0)
					System.out.print("Hesabınız bloke edilmiştir lütfen bankanız ile iletişime geçin! ");
				else {
				System.out.println("Hatalı kullanıcı adı veya şifre girdiniz. Tekrar deneyin!");
				System.out.println("Kalan hakkanız:"+right);
				}
				}
		}
	}

}

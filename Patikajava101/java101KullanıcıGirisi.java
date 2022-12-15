package Patikajava101;
import java.util.Scanner;
public class java101KullanıcıGirisi {

	public static void main(String[] args) {
		String userName,password,answer,newPassword;
		Scanner scanner=new Scanner(System.in);
		System.out.print("Kullanici adinizi giriniz :");
		userName=scanner.nextLine();
		System.out.print("Sifrenizi giriniz :");
		password=scanner.nextLine();
		 if(userName.equals("patika") && password.equals("java123")) {
			 System.out.print("Giris yaptiniz !");
		 }
		 else if (password.equals("java123")) {
			 System.out.print("Kullanici adiniz yanlis !");
		 }
		 else if (userName.equals("patika")) {
			 System.out.print("Sifreniz yanlis yeni sifre olusturmak istermisiniz ? (evet-hayır) :");
		 }	
			 answer=scanner.nextLine();
		 if (answer.equals("evet")) {
			 System.out.print("yeni sifre giriniz :");
			 newPassword=scanner.nextLine();
		 
		  if (newPassword.equals("java123")) {
			 System.out.print("Yeni sifre olusturulamadi, lutfen baska sifre olusturunuz. ");
		 } 
		  else {
			  System.out.print("Yeni sifreniz basari ile olusturulmustur.");
		  }
			 }
		 else {
			  System.out.print("Yeni sifre olusturmak istemediniz.");
			 
		 }
	}

}

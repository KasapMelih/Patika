package Patikajava101;
import java.util.Scanner;
public class java101etkinlikOnerisi {

	public static void main(String[] args) {
		int heat;
		Scanner scanner=new Scanner(System.in);
		System.out.print("Hava sıcaklığını giriniz: ");
		heat=scanner.nextInt();
		if (heat<5)
			System.out.print("Kayak yapmaya gidebilirsiniz.");
		if (heat>=5 && heat<=15)
			System.out.println("Sinemaya gidebilirsiniz.");
		if (heat>=10 && heat<=25)
			System.out.print("Piknik yapmaya gidebilirsiniz.");
		if (heat>25)
			System.out.print("Yüzmeye gidebilirsiniz.");
	}

}

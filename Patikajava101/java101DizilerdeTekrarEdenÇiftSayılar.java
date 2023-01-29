package Patikajava101;

public class java101DizilerdeTekrarEdenÇiftSayılar {

	public static void main(String[] args) {
		int dizi[]= {1,2,3,4,5,4,1,2,3,5,6,4,6,1,3,5,2,8,4,6,8};
		
		/*int x=0;
		
		for (int i=0; i<dizi.length; i++) {
			for (int j=0; j<dizi.length; j++) {
			if (dizi[i]%2==0 && dizi[i]==dizi[j])   			//Çift ve tekrar eden sayılar için yeni dizinin eleman sayısı.
				x++;
			}
			}
		 int[] dizi2 = new int[x];
		 
		for (int i=0; i<dizi.length; i++) {
			
			for (int j=0; j<dizi.length; j++) {
				if (dizi[i]%2==0 && dizi[i]==dizi[j]) {					//Diziye sayıları tanımlama.
						
					for (int k=0; k<dizi.length; k++) {
						dizi2[i]=dizi[k];
					}
				}
			}
						
		}
		System.out.println("Dizide "+x+" tane sayı çift ve tekran etmektedir. Bu sayılar: ");
			System.out.print("{");
		for (int i:dizi2)
			System.out.print(" "+i+",");
			System.out.print("}");*/
		int[] dizi2= new int[dizi.length];
		int x=1;
		for (int i=0; i<dizi.length; i++) {
			if (dizi[i]%2==0) {
				for (int j=i; j<i+x; j++) {
					dizi2[j]=dizi[i];
				}
			} 
				
		}
		for (int i:dizi2)	
		System.out.print(i+", ");
	}

}

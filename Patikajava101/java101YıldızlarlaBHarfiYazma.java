package Patikajava101;

public class java101YıldızlarlaBHarfiYazma {

	public static void main(String[] args) {
		
		String[][] dizi=new String[7][4];
		
		for (int i=0; i<dizi.length; i++) {
			for(int j=0; j<dizi[0].length; j++) {
				
				if (i==0 || i==3 || i==6) {
					
					dizi[i][j]="* ";
				}
				else if (j==0 || j==3) {
					
					dizi[i][j]="* ";
				}
				else {
					dizi[i][j]="  ";
				
				}
				
			}
		}
		for (String[] i:dizi) {
			for (String j:i) {
				System.out.print(j);
			}
			System.out.println();
				
			
		}

	}

}

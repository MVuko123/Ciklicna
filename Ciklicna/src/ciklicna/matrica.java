package ciklicna;


import javax.swing.JOptionPane;

public class matrica {
	
	public static void main(String[] args) {
		//a - redovi
		//b - stupci
		int a;
		int b;
		do {
	     a = Integer.parseInt(JOptionPane.showInputDialog("Unesite broj redova"));
		 b = Integer.parseInt(JOptionPane.showInputDialog("Unesite broj stupaca"));
		 if(a <= 0 || b <= 0) {
			 System.out.println(" Krivi unos, ponovno unesite!");
		 }
		}while(a <= 0 || b<=0);
		
		int pa = 0; //pa - pocetni red, za - zadnji red
		int za = a - 1;
		int pb = 0;
		int zb = b - 1; //pb - pocetni stupac, zb- zadnji stupac
		
		int matrica[][]= new int[a][b];
		
		int polje = 1;
		while( polje <= a * b) {
			for( int i = zb; i >= pb; i--) {
				matrica[pa][i] = polje++;
			if(polje > a * b)
				break;
			}
			
			for(int j = pa + 1; j <= za; j++) {
				matrica[j][pb] = polje++;
			if(polje > a * b)
				break;
			}
			for(int i = pb + 1; i <= zb; i++) {
				matrica[za][i] = polje++;
			if(polje > a * b)
				break;
			}
			for(int j = za - 1; j > pa; j--) {
				matrica[j][zb] = polje++;
			if(polje > a * b)
				break;
			}
			pb++;
			pa++;
			zb--;
			za--;
		}
		for(int i = 0; i < a; i++) {
			for(int j = 0; i < b; j++) {
				System.out.println(matrica[i][j] + "\t");
			}
			System.out.println();
		}
		
		
	}

}

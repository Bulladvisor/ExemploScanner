package ScannerNet;

import java.util.Scanner;

public class TestaDeclaracaoScanner {

	public static void main(String[] args) {
		
		//Lê a partir da linha de comando
				Scanner sc1 = new Scanner(System.in); 
				String textoString = "Maria Silva";
				//Lê a partir de uma String
				Scanner sc2 = new Scanner(textoString); 
				
				System.out.println(textoString);
	}
	
	
}

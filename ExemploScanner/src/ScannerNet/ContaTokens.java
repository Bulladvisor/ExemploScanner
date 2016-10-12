package ScannerNet;

import java.util.Scanner;

public class ContaTokens {

	public static void main(String[] args) {
	
		int i = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um texto:");
		while(sc.hasNext()){
			i++;
			System.out.println("Token: "+"PEDAÇO "+sc.next());
		}
		sc.close(); //Encerra o programa

	}

}

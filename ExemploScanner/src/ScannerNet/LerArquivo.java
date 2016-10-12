package ScannerNet;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LerArquivo {
	
	public static void lerTexto(String nomeArquivo){
		try {
		
		
			
			File arquivo = new File(nomeArquivo);
			Scanner sc = new Scanner(arquivo);
			while(sc.hasNext()){
				// Scanner s = new Scanner(input).useDelimiter("\\s*fish\\s*");
				//String  real = sc.next();
		
				//System.out.println(sc.next());
				//System.out.println(real);
		
				System.out.println("asdfasdasd");
				
				
				
			}
			
			sc.close();
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	
	

	public static void main(String[] args) {
	
		lerTexto("C://Users//FernandoManuel//workspace//ExemploScanner//src//ScannerNet//poema.txt"); //trocar pelo caminho do arquivo desejado.

	}
	
	/*
	 * hasNext()
	 * Retorna um valor booleano verdadeiro (true)
	 *  se o objeto Scanner tem mais dados de entrada.
	 */

}

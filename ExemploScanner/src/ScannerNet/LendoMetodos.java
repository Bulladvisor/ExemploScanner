package ScannerNet;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class LendoMetodos {
	
	 private Scanner entrada;
	 
	    public void abrir()
	    {
	        try
	        {
	            entrada = new Scanner( new File("C://Users//FernandoManuel//workspace//teste.txt"));
	        }
	        catch(FileNotFoundException arquivoNaoEncontrado)
	        {
	            System.err.println("Nao foi poss�vel abrir o arquivo! N�o encontrado!");
	            System.exit(1); //sa�da de erro
	        }
	    }
	 
	    public void ler()
	    {
	        try
	        {
	            while( entrada.hasNext() )  
	            	
	            	
	            	
	            	
	            	
	            	
	                //System.out.printf("%s - %d\n",entrada.next(), entrada.nextInt());
	            //System.out.printf("%s *** %+d\n",entrada.next(), entrada.nextInt());
	            	System.out.printf("%s%d\n",entrada.next(), entrada.nextInt());
	        }
	        catch(NoSuchElementException entradaDiferente)
	        {
	            System.err.println("Entrada diferente da esperada");
	            entrada.close();
	            System.exit(1);
	        }
	        catch(IllegalStateException erroLeitura)
	        {
	            System.err.println("Erro de leitura. Scanner foi fechada antes da input");
	            System.exit(1);
	        }
	    }
	 
	    public void fechar()
	    {
	        entrada.close();

}
}

package ScannerNet;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;



public class LerFichArray {

	public static void main(String[] args) throws IOException {
		
		
         String d ="NVG";
		
	   	 String[] a = new String[255];       // Create String array of 100 elem's	   	 
	   	 int numWords;                       // Count # words in input
	   
	   	 File myFile = new File("C://Users//FernandoManuel//workspace//teste.txt");     // Open file "inp1"
	   	 Scanner in = new Scanner(myFile);   // Make Scanner obj with opened file  
	   	
	       
	   	 numWords = 0;    
	    
	   	 while ( in.hasNext() )
	   	 {
	   	    a[numWords] = in.next();          // Read next string (word)

	   	    numWords++;                       // Count # words AND use next
	   					      // array element for next word
	   	 }
	   	 
	    
	       
	   	for ( int i = 0 ; i < numWords; i++ ){
	   		
	   	 String parcial [] = new String [6];
	   	 
			 for (int j= 0 ; j <=6; j++){
				 
		    
		    
			String b [] = a[i].split(",");
			parcial [0]= (String) b[0].replace("-", "");
	    	int quantone = b[1].indexOf(".");
	    	int tamone = b[1].length();
	    	int quantwo = b[2].indexOf(".");
	    	int tamtwo = b[2].length();
	    	int quanthree = b[3].indexOf(".");
	    	int tamthree = b[3].length();
	    	int quanfour = b[4].indexOf(".");
	    	int tamfour = b[4].length();
    	
	 /*   	
	    	if (quantone >=4 && tamone >=7){
	    		parcial[1]= b[1].substring(0, (quantone+3));
	    	 }else { if(quantone >=4 && tamone < 7){
	    		 parcial[1]= b[1].substring(0, (quantone+(tamone-quantone)));
	    	 }else { if(quantone>=2 && tamone >= 6){
	    		 parcial[1]= b[1].substring(0, (quantone+4));
	    	 }else { if(quantone>=2 && tamone < 6){
	    		 parcial[1]= b[1].substring(0, (quantone+(tamone-quantone)));
	    	 }else { if(quantone <= 1 && tamone <= 6){
	    		 parcial[1]= b[1].substring(0, (quantone+5));
	    	 }else
	    		 parcial[1]= b[1].substring(0, (tamone));
	    	 }}}}
	    	 if (quantone >=4 && tamone >=7){
		    		parcial[2]= b[2].substring(0, (quantone+3));
		    	 }else{ if(quantone >=4 && tamone < 7){
		    		 parcial[2]= b[2].substring(0, (quantone+(tamone-quantone)));
		    	 }else{ if(quantone>=2 && tamone >= 6){
		    		 parcial[2]= b[2].substring(0, (quantone+4));
		    	 }else{ if(quantone>=2 && tamone < 6){
		    		 parcial[2]= b[2].substring(0, (quantone+(tamone-quantone)));
		    	 }else{ if(quantone <= 1 && tamone <= 6){
		    		 parcial[2]= b[2].substring(0, (quantone+5));
		    	 }else
		    		 parcial[2]= b[2].substring(0, (tamone));
		    	 }}}}
		    	 if (quantone >=4 && tamone >=7){
			    		parcial[3]= b[3].substring(0, (quantone+3));
			    	 }else{ if(quantone >=4 && tamone < 7){
			    		 parcial[3]= b[3].substring(0, (quantone+(tamone-quantone)));
			    	 }else{ if(quantone>=2 && tamone >= 6){
			    		 parcial[3]= b[3].substring(0, (quantone+4));
			    	 }else{ if(quantone>=2 && tamone < 6){
			    		 parcial[3]= b[3].substring(0, (quantone+(tamone-quantone)));
			    	 }else{ if(quantone <= 1 && tamone <= 6){
			    		 parcial[3]= b[3].substring(0, (quantone+5));
			    	 }else
			    		 parcial[3]= b[3].substring(0, (tamone));
			    	 }}}}
			    	 if (quantone >=4 && tamone >=7){
				    		parcial[4]= b[4].substring(0, (quantone+3));
				    	 }else{ if(quantone >=4 && tamone < 7){
				    		 parcial[4]= b[4].substring(0, (quantone+(tamone-quantone)));
				    	 }else{ if(quantone>=2 && tamone >= 6){
				    		 parcial[4]= b[4].substring(0, (quantone+4));
				    	 }else{ if(quantone>=2 && tamone < 6){
				    		 parcial[4]= b[4].substring(0, (quantone+(tamone-quantone)));
				    	 }else{ if(quantone <= 1 && tamone <= 6){
				    		 parcial[4]= b[4].substring(0, (quantone+5));
				    	 }else
				    		 parcial[4]= b[4].substring(0, (tamone));
				    	 }}}}
	    /*	boolean verifica = b[1].matches("0.*");
	    	System.out.println(verifica);
	    	
	    	 if(quanto>=4) {
	    	parcial[1]= b[1].substring(0, (quantone+3));
	    	parcial[2]= b[2].substring(0, (quanto+3));
	    	parcial[3]= b[3].substring(0, (quanto+3));
	    	parcial[4]= b[4].substring(0, (quanto+3));
	    	
	    	 }else{ if(quanto>=2 && quanto <4){
	    		
	    		parcial[1]= b[1].substring(0, (quanto+4));
	 	    	parcial[2]= b[2].substring(0, (quanto+4));
	 	    	parcial[3]= b[3].substring(0, (quanto+4));
	 	    	parcial[4]= b[4].substring(0, (quanto+4));
	    	 
	    	 }else
	    		  
	    		    parcial[1]= b[1].substring(0, (quanto+5));
		 	    	parcial[2]= b[2].substring(0, (quanto+5));
		 	    	parcial[3]= b[3].substring(0, (quanto+5));
		 	    	parcial[4]= b[4].substring(0, (quanto+5));
	    	 
	    	 */
	    	if (tamone <=6){
	    		
	    	 parcial[1]= b[1];
	    			 parcial[2]= b[2];
	    					 parcial[3]= b[3];
	    							 parcial[4]= b[4];
	    	}
               parcial[5]= b[5];  
		   }
			 
			 System.out.println(d + "," + parcial[0] + "," + parcial[1] + "," +
			  parcial[2] + "," + parcial[3] + "," + parcial[4] + "," + parcial[5]);
			 
	   	}
			 }
			    	 }
				    	 
			    	 
			    	 
	    
	
	
	   	
    	
	
		
	



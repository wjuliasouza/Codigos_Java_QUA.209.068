package principal;

import java.util.Scanner;

public class AtividadeOperadoresAritmeticos4 {

	public static void main(String[] args) {
		/*Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius.  
		  F para C = (32 °F − 32) × 5/9 = 0 °C
		  32 seria o dado de entrada, já tem o resultado para conferir
		 */
		
		Scanner leia = new Scanner (System.in);
		
		double fahrenheint = 0;
	    double celsius = (fahrenheint - 32)* 5/9;
	    
	    
	    System.out.println("Quantos graus Fahrenheit?");
	    fahrenheint = leia.nextDouble ();
	    celsius = (fahrenheint - 32)* 5/9;
	    System.out.println("Qual a temperatura equivalente em graus Celsius?" + celsius);
	    
	    
	    
		leia.close ();





	}

}

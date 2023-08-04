package principal;

import java.util.Scanner;

public class AtividadeOperadoresAritmeticos5 {

	public static void main(String[] args) {
		// Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre em graus Fahrenheit.
		
		Scanner leia = new Scanner (System.in);
		
		double celsius = 0;
		double fahrenheit = (celsius * 9/5)+32 ;
	 
	    System.out.println("Quantos graus Celsius?");
	    celsius = leia.nextDouble ();
	    
	    fahrenheit = (celsius * 9/5)+ 32 ;
	    System.out.println("Qual a temperatura equivalente em graus Fahrenheit?" + fahrenheit);
		
		
		
		
		
		leia.close ();

	}

}

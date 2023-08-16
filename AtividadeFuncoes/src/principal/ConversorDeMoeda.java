package principal;

import java.util.Scanner;

public class ConversorDeMoeda {

	/* Faça um programa que receba um valor em real e converta para dólares na cotação atual, 
	 * faça o inverso também;
	 */
	
	
	public static void main(String[] args) {

Scanner sc = new Scanner (System.in);
		
		System.out.println("Entre com o valor em real" + " para ser convertido em dólar: ");
		double real = sc.nextDouble();
	
		System.out.printf("Valor em dólar é: %.2f ", converterParaDolar(real));
		
		
		System.out.println("Entre com o valor em dólar" + " para ser convertido em real: ");
		double dolar = sc.nextDouble();
	
		System.out.printf("Valor em real é: %.2f ", converterParaReal(dolar));
		
		

	}
	
	static double converterParaDolar (double real) {
		return real / 4.99;
	}
	

	static double converterParaReal (double dolar) {
		return 4.99 * dolar ;
	}
}

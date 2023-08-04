package principal;

import java.util.Scanner;

public class AtividadeOperadoresAritmeticosJava6 {

	public static void main(String[] args) {
	/*Uma empresa tem gastos mensais e a cada 3 meses realiza um balanço para verificar a media de gastos dos 3 meses.  
	 * Faça um programa que receba os valores de cada mês e imprima na tela o valor total gasto no período e a media dos gastos.
	 */
		Scanner leia = new Scanner (System.in);
		
		double mes1 = 0;
		double mes2 = 0;
		double mes3 = 0;
		double soma = mes1 + mes2 + mes3;
		double media = soma/3;
		
		System.out.print("Valor gasto no mês 1: ");
		mes1 = leia.nextDouble ();
		
		System.out.print("Valor gasto no mês 2: ");
		mes2 = leia.nextDouble ();
		
		System.out.print("Valor gasto no mês 3: ");
		mes3 = leia.nextDouble ();
		
		soma = mes1 + mes2 + mes3;
		System.out.println("Valor gasto no período é: " + soma);
		media = soma/3;
		System.out.println("Média dos gastos no período é: " + media);	
		
		
		
		leia.close ();
		
		
		
		
	}

}

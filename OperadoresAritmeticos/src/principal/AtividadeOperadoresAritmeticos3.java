package principal;

import java.util.Scanner;

public class AtividadeOperadoresAritmeticos3 {

	public static void main(String[] args) {
		/* Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. 
		 * Calcule e mostre o total do seu salário no referido mês (sem descontos e impostos).
		 */
		Scanner leia = new Scanner(System.in);
				
		double horaTrab = 0;
		double horasMes = 0;
		double multiplicacao = horaTrab*horasMes;
	
		
		System.out.println("Quanto você ganha por hora?");
		horaTrab = leia.nextDouble ();
		
		System.out.println("Quantas horas você trabalha por mês?");
		horasMes = leia.nextDouble ();
		
		multiplicacao = horaTrab*horasMes;
		
		System.out.println("Seu salário mensal é: " + multiplicacao + " reais");
		
		
		leia.close ();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

package principal;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// Faça um programa que entre com um número e indique se ele é ímpar ou par
		
		
		Scanner leia = new Scanner (System.in);
		
		int numero = 0;
		
		System.out.println("Digite um número para saber se é par ou ímpar: ");
		numero = leia.nextInt();
		
		if (numero % 2 == 0) {
			System.out.println(numero + " é par");
			
		} else {
			System.out.println(numero + " é ímpar");
		}
		
		
		leia.close();
		
		

	}

}

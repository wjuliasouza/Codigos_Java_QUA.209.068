package principal;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// Faça um programa que leia 3 números e mostre o maior deles
		

		Scanner leia = new Scanner (System.in);
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		
		System.out.print("Digite o primeiro número: ");
		num1 = leia.nextInt();
		System.out.print("Digite o segundo número: ");
		num2 = leia.nextInt();
		System.out.print("Digite o terceiro número: ");
		num3 = leia.nextInt();
		
		if (num1 > num2 && num1 > num3) {
			System.out.print("Número " + num1 + " é o maior número");
		}
		else if (num2> num1 && num2 > num3) {
			System.out.print("Número " + num2 + "é o maior número");
		}
		else {
			System.out.print("Número " + num3 + "é o maior número");
		}
			
		
		
		
		
		leia.close();

	}

}

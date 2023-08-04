package principal;

import java.util.Scanner;

public class AtividadeOperadoresAritmeticos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Faça um Programa que peça dois números e imprima a soma;
		
		Scanner leia = new Scanner (System.in);
		
		int numero1 = 0;
		int numero2 = 0;
		int soma;
		
		
		
		System.out.print("Informe um número: ");
		numero1 = leia.nextInt(); 
		leia.nextLine();
		
		System.out.print("Informe outro número: ");
		numero2 = leia.nextInt(); 
		
		soma = numero1 + numero2;
		
		System.out.print("A soma dos números indicados é: " + soma);
		soma = leia.nextInt();
		
		
		leia.close ();
	}

}

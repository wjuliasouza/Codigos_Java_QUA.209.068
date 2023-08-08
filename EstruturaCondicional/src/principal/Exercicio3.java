package principal;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// Faça um programa que leia dois números e imprima o maior deles

	
	Scanner leia = new Scanner (System.in);
	
	int numero1 = 0;
	int numero2 = 0;
	
	System.out.println("Digite um número: ");
    numero1 = leia.nextInt (); 
    
    System.out.println("Digite outro número: ");
    numero2 = leia.nextInt ();
    
	if(numero1 > numero2) {
		System.out.println ("O maior número é: " + numero1);
		
	}else {
			System.out.println ("O maior número é: " + numero2);
	
	} System.out.println ("O maior número é: " + Math.max(numero1, numero2));
	
	
	leia.close ();
	}
	

}

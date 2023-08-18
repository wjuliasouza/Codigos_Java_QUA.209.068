package principal;

import java.util.Scanner;

import entities.ValoresTrianguloClasse;

public class ValoresTriangulo {

	public static void main(String[] args) {
		// Faça um programa que receba 3 valores e indique/retorne que tipo de triangulo ele pode ser;
		
		Scanner sc = new Scanner(System.in);
		ValoresTrianguloClasse valoresTrianguloClasse = new ValoresTrianguloClasse();
		
		System.out.println("Entre com o valor do lado A: ");
		valoresTrianguloClasse.ladoA = sc.nextInt();
		
		System.out.println("Entre com o valor do lado B: ");
		valoresTrianguloClasse.ladoB = sc.nextInt();
		
		System.out.println("Entre com o valor do lado C: ");
		valoresTrianguloClasse.ladoC = sc.nextInt();
		
		valoresTrianguloClasse.obterTipoTriangulo();
		
		sc.close();

	}

}

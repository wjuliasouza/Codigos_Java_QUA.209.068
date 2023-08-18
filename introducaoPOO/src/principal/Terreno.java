package principal;

import java.util.Scanner;

import entities.TerrenoClasse;

public class Terreno {

	public static void main(String[] args) {
		// Faça um programa que calcule a área de um terreno e mostre o m²;

		Scanner sc = new Scanner(System.in);
		TerrenoClasse terreno = new TerrenoClasse();

		System.out.println("Digite a largura do terreno em m²: ");
		terreno.largura = sc.nextDouble();

		System.out.println("Digite o comprimento do terreno em m²: ");
		terreno.comprimento = sc.nextDouble();

		System.out.println(terreno.obterMetroQuadrado()+ " m²");
		sc.close();
	}

}

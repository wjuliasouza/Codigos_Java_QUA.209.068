package principal;

import java.util.Scanner;

public class AtividadeMediaAlturas {

	public static void main(String[] args) {
		//Faça um programa que receba a altura de 10 pessoas e mostre a media da altura delas
		
		Scanner leia = new Scanner (System.in);
				double alt1 = 0;
				double alt2 = 0;
				double alt3 = 0;
				double alt4 = 0;
				double alt5 = 0;
				double alt6 = 0;
		        double alt7 = 0;
		        double alt8 = 0;
		        double alt9 = 0;
		        double alt10 = 0;
		       

				System.out.print("Entre com a 1ª altura: ");
				alt1 = leia.nextDouble();
				System.out.print("Entre com a 2ª altura: ");
				alt2 = leia.nextDouble();
				System.out.print("Entre com a 3ª altura: ");
				alt3 = leia.nextDouble();
				System.out.print("Entre com a 4ª altura: ");
				alt4 = leia.nextDouble();
				System.out.print("Entre com a 5ª altura: ");
				alt5 = leia.nextDouble();
				System.out.print("Entre com a 6ª altura: ");
				alt6 = leia.nextDouble();
				System.out.print("Entre com a 7ª altura: ");
				alt7 = leia.nextDouble();
				System.out.print("Entre com a 8ª altura: ");
				alt8 = leia.nextDouble();
				System.out.print("Entre com a 9ª altura: ");
				alt9 = leia.nextDouble();
				System.out.print("Entre com a 10ª altura: ");
				alt10 = leia.nextDouble();
				
				double soma = (alt1+alt2+alt3+alt4+alt5+alt6+alt7+alt8+alt9+alt10);
				double media = soma/10;
				
				System.out.printf("A média das alturas informadas é: %.2f %n", (media));
				
				
				leia.close();
				}
		
		
	}



package principal;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		/*Faça um programa que leia 4 notas de um aluno e retorne a media.
		 *  Se media for menor que 6 está reprovado, se media ficar entre 6 e 7 recuperação
		 *  Se media acima de 7 aprovado
		 *  Se media for 10 aprovado com honras;
		 */

		Scanner leia = new Scanner (System.in);
		double nota1 = 0;
		double nota2 = 0;
		double nota3 = 0;
		double nota4 = 0;
		double media = 0;
		
		System.out.print("Entre com a primeira nota: ");
		nota1 = leia.nextDouble();
		
		System.out.print("Entre com a segunda nota: ");
		nota2 = leia.nextDouble();
		
		System.out.print("Entre com a terceira nota: ");
		nota3 = leia.nextDouble();
		
		System.out.print("Entre com a quarta nota: ");
		nota4 = leia.nextDouble();
		
		media = (nota1+nota2+nota3+nota4)/4; 
		
		if (media<6) {
		System.out.println("Aluno reprovado! Média: "+media);	
		}
		else if (media>=6 && media<7) {
		System.out.println("Aluno de recuperação! Média: "+media);	
		}
		else if (media>=7 && media<10) {
		System.out.println("Aluno aprovado! Média: "+media);	
		}
		else {
		System.out.println("Aluno aprovado com honras! "+media);
		}
		
	
		
		
		
		leia.close();
		
	}

}

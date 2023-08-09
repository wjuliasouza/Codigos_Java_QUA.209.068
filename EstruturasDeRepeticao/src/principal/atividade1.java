package principal;

import java.util.Scanner;

public class atividade1 {

	public static void main(String[] args) {
		
		/* Faça um programa que peça uma nota, entre zero e dez.
		*  Mostre uma mensagem caso o valor seja inválido 
		*  e continue pedindo até que o usuário informe um valor válido.
		 */
		Scanner sc = new Scanner (System.in);

		double nota = 0;
		
		System.out.println("Entre com uma nota entre 0 e 10: ");
		nota = sc.nextDouble();
		
		while (nota<=0 || nota >=10) {
			System.out.println("Nota inválida.");
			
		System.out.println("Entre com uma nota entre 0 e 10: ");
		nota = sc.nextDouble();
		}
		
		System.out.println("Nota válida! Valor informado: " + nota);
		nota = sc.nextDouble();
		
		/*A mensagem de nota válida deve estar embaixo da chave " {"
		 *pois ela fecha o while que foi aberto, ou seja,
		 *vai pedir a nota correta até que seja colocado o valor válido
		 */
		
		
			sc.close();
		}
		
		
		

	}



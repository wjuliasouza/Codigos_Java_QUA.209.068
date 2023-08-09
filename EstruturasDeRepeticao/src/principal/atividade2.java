package principal;

import java.util.Scanner;

public class atividade2 {

	public static void main(String[] args) {
 /* Faça um programa que imprima na tela os números de 1 a 20, um abaixo do outro.
  * Depois modifique o programa para que ele mostre os números um ao lado do outro.
  */
		Scanner leia = new Scanner (System.in);
		
		for (int contador = 1; contador<=20; contador++) {
			System.out.println(contador);
			
			}
		
		for (int contador = 1; contador<=20; contador++) {
			System.out.print(" " + contador);
		}
		
		leia.close();
	}
	
	
}

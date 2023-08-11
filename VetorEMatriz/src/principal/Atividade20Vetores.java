package principal;

import java.util.Scanner;

public class Atividade20Vetores {

	public static void main(String[] args) {
		/*Ler um vetor Q de 20 posições (aceitar somente números positivos), 
		 * caso não atenda a condição deve informar novamente 
         * o numero até que a condição seja aceita, 
         * ao final mostre os números inseridos no vetor e a soma deles.
		 */
		
		// Scanner para fazer a leitura dos dados que o usuário vai inserir
		Scanner leia = new Scanner(System.in);
		
		//Criar variável para a quantidade de vetores e outra para a soma destes
		int [] numeros = new int [20];
		int soma=0;
		
		//i = iterador, mesmo que contador
		//Criar uma variável para colocar os números
		for(int i =0; i<numeros.length; i++) {
		  System.out.println("Entre com o número: ");
		  numeros[i] = leia.nextInt();
	  
		while (numeros[i]<0) {
		//Colocar uma variável caso o número seja inválido	
			System.out.println("Número inválido. ");
			System.out.println("Entre com o número: ");
			  numeros[i] = leia.nextInt();
		}
		//Variável para a soma dos números do vetor
		soma += numeros [i];
		}
		System.out.println("a soma dos números: "+soma);
		
		// Variável para citar todos os 20 números digitados no vetor
		System.out.println("Números digitados: ");
		for (int numero:numeros) {
			System.out.println(numero);
		}
		
	}

}

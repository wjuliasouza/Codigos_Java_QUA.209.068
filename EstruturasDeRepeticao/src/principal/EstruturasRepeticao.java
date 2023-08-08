package principal;

import java.util.Scanner;

public class EstruturasRepeticao {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		/*Uma estrutura de repetição 
		* repete um determinado bloco de códigos enquanto
		* uma condição for satisfeita
		*/
		
		//for = até; 
		//utilizado quando sabemos a quantidade de vezes que será necessário repetir o bloco
		
		for (int contador = 0; contador<10; contador++) {
		System.out.println("Contador está valendo: " + contador);
		}
	   // comando acima manda adicionar até o limite de <10
		
		
		
		/* while = enquanto
		 * geralmente usado quando não sabemos a quantidade de vezes 
           que será executador determinado comando
		 */
		
		int contador = 0; 
		char opcao; 
		
		System.out.println("Deseja entrar no loop s/n"); 
		opcao = leia.next().charAt(0);
		
		while (opcao == 's') {
			System.out.println("Contador valendo: " + contador);
            contador++;  
            System.out.println("Deseja continuar no loop s/n");
            opcao = leia.next().charAt(0);
            
	
            
		
		/* do while
		 * executa pelo menos 1 vez, temos a garantia do que será
		 * executado ao menos uma vez
		 */
		
		do {
			System.out.println ("Contador valendo: " + contador);
			contador ++;
			System.out.println("Deseja continuar no loop s/n");
			opcao = leia. next().charAt(0);
		}while (opcao == 's');
		
            
            leia.close();
            
	}
	}}


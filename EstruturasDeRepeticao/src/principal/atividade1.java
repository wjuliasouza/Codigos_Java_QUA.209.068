package principal;

import java.util.Scanner;

public class atividade1 {

	public static void main(String[] args) {
		
		/* Faça um programa que peça uma nota, entre zero e dez.
		*  Mostre uma mensagem caso o valor seja inválido 
		*  e continue pedindo até que o usuário informe um valor válido.
		 */
		Scanner leia = new Scanner (System.in);

        int nota = 3;
		System.out.println("Digite uma nota, entre 0 e 10: ");
		nota = leia.nextInt();
		
		do { (int nota !=3) 
		   System.out.println("Nota não está valendo: ");
		   System.out.println("Digite uma nota: ");
		   nota = leia.nextInt();
		   
		}while (nota=3) {
			
		}
		
		
		
		
		
leia.close();
	}

}

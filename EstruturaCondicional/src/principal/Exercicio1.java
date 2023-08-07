package principal;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// Faça um programa que peça para o usuário entrar com um ano e dizer se esse ano é bissexto ou não
		//Se não for divisível por 4, então, não é bissexto
		//Se não for divisível por 100, então, é bissexto 
		//Se for divisível por 400, então, é bissexto
		
		int ano = 0;
		Scanner leia = new Scanner (System.in);

        System.out.println("Digite um ano para saber se é bissexto:");
        ano = leia.nextInt (); 
		
	if ((ano %4 == 0)&&(ano %100 != 0));{ 
		System.out.println(ano + " é bissexto");
		
	}else if (ano %400 == 0); {
		System.out.println(ano + " é bissexto");
	}else {
		System.out.println("Não é bissexto");
	}
	
	
		leia.close ();

		

	}

}

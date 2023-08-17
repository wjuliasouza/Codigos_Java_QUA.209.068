package principal;

import java.util.Scanner;

public class NomeEAno {

	public static void main(String[] args) {
		// Faça um programa que receba o nome e o ano de nascimento e retorne a idade atual do usuário;
		Scanner sc = new Scanner(System.in);
		NomeEAno atividade = new NomeEAno();
		
		System.out.println("Digite o nome: ");
	    String nome = sc.nextLine();
	
	    System.out.println("Digite o ano de nascimento: ");
	    String anoNascimento = sc.nextLine();
		
	    atividade.idadeAtual();
	    System.out.println("A idade atual é: " + atividade.idadeAtual); 
		
		sc.close();

	}

}

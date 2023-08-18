package principal;

import java.util.Scanner;

import entities.NomeEAnoClasse;

public class NomeEAno {

	public static void main(String[] args) {
		
		// Faça um programa que receba o nome e o ano de nascimento e retorne a idade atual do usuário;
		Scanner sc = new Scanner(System.in);
		NomeEAnoClasse nomeEAnoClasse = new NomeEAnoClasse();
		
		System.out.println("Entre com o nome: ");
		nomeEAnoClasse.nome = sc.nextLine();
		
		System.out.println("Entre com o ano de nascimento: ");
		nomeEAnoClasse.anoNascimento = sc.nextInt();
		
		nomeEAnoClasse.obterIdade();
		
		
		sc.close();

	}

}

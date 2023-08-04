package principal;

import java.util.Scanner;

public class AtividadeOperadoresAritmeticos2 {

	public static void main(String[] args) {
		// Faça um Programa que peça as 4 notas bimestrais e mostre a média.
		
		Scanner leia = new Scanner (System.in);
		
		double nota1 = 0;
		double nota2 = 0;
		double nota3 = 0;
	    double nota4 = 0;
		double soma = nota1 + nota2 + nota3 + nota4;
		double divisao = (soma / 4);
		
		
		System.out.print("Informe a primeira nota do bimestre: ");
		nota1 = leia.nextDouble ();
		
		System.out.print("Informe a segunda nota do bimestre: ");
		nota2 = leia.nextDouble ();
		
		System.out.print("Informe a terceira nota do bimestre: ");
		nota3 = leia.nextDouble ();
		
		System.out.print("Informe a quarta nota do bimestre: ");
		nota4 = leia.nextDouble ();
		
		soma = nota1 + nota2 + nota3 + nota4;
		
		divisao = (soma / 4);
		System.out.print("Sua média bimestral: " + divisao);
		
		leia.close();
		
		
		
		
		
			
		
		

	}

}

package principal;

import java.util.Scanner;

public class EntradaDeDados {

	public static void main(String[] args) {

		Scanner leia = new Scanner (System.in);
		
		String nome;
		int idade; 
		double altura;
		char sexo;
		
		
		System.out.println("Por favor, digite seu nome: ");
		//leitura de dados tipo String (conjunto de caracteres)
		nome = leia.nextLine();
		
		System.out.println ("Digite sua idade: ");
		//leitura de dados tipo int (numero)
		idade = leia.nextInt();
		
		System.out.println("Digite sua altura: ");
		//leitura de dados tipo double (números decimais)
		altura = leia.nextDouble();
		
		System.out.println("Qual o sexo (m/f): ");
		sexo = leia.next().charAt(0); 
		
		System.out.println ("O nome digitado foi: " + nome);
		System.out.println ("A idade digitada foi: " + idade);
		System.out.println ("A altura digitada foi: " + altura);
		System.out.println ("e sexo digitado foi: " + sexo);
		leia.close();

	}

}

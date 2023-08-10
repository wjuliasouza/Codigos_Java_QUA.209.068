package principal;

import java.util.Scanner;

public class Atividade {

	public static void main(String[] args) {
		/* Faça um programa que receba o nome do aluno e as 4 notas bimestrais desse aluno, 
		 * mostre a media 
		 * e se foi aprovado (>=7) ou reprovado(<7)
		 */
      
		Scanner leia= new Scanner (System.in);
		double [] notas = new double[4];
		
		System.out.println("entre com o nome do aluno: "); 
		String nome = leia.nextLine();
		for (int contador =0; contador<notas.length; contador++) {
			System.out.println("Entre com a nota: ");
			notas [contador] = leia.nextDouble();
		}
		
		double media= (notas [0] + notas [1] + notas [2] + notas [3])/4;
        System.out.printf("A média do %s é: %.2f", nome, media);
				
        
		if (media >= 7)
		{
		  System.out.println (". Aluno aprovado! ");	
		}
		else
		{
		  System.out.println (". Aluno reprovado!");
		
		leia.close();
	}

}
}
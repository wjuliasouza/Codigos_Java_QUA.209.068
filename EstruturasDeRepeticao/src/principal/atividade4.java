package principal;

import java.util.Scanner;

public class atividade4 {

	public static void main(String[] args) {
		// Faça um programa que receba dois números e gere os números inteiros  que estão no intervalo compreendido por eles.
		Scanner sc = new Scanner (System.in);
		
		int num1 = 0;
		int num2 = 0;
		
		System.out.print("Entre com o primeiro número: ");
		num1 = sc.nextInt();
		
		System.out.print("Entre com o segundo número: ");
		num2 = sc.nextInt();
		
		for (int contador = ++num1; contador<num2; contador++) {
			System.out.println(contador);
		}
		
		
		
		
		sc.close();
		}
		
	}



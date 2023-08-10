package principal;

import java.util.Scanner;

public class Atividade100Arrays {

	public static void main(String[] args) {
		// Faça um programa que mostre os índices de um array de 100 posições
		
		Scanner leia= new Scanner (System.in);
		
		int [] numeros = new int[100];
		
		for (int contador = 0; contador<numeros.length; contador ++) {
        System.out.println(contador);
		}
		
		leia.close();

	}

}

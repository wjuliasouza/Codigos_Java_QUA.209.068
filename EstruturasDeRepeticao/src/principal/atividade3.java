package principal;

import java.util.Scanner;

public class atividade3 {

	public static void main(String[] args) {
		// Faça um programa que imprima na tela apenas os números ímpares entre 1 e 50
	
		
		for (int contador = 0; contador <=50; contador ++) {
			if (contador%2 !=0) {
			System.out.println(contador);	
			}
		}
		
		//Outra opção para o mesmo pedido, +=2 para somar mais 2 à variável, que no caso é 1
		
		for (int contador = 1; contador<50; contador +=2) {
			System.out.println(contador);
		}
		
		/* int a = 10;
		 System.out.println(a);
		 int b = a++;
		 System.out.println(b);
		 int c= ++a;
		 System.out.println(c);
	Quando o ++ é antes da variável (++a), imprime na linha.
    Quando o ++ é depois (a++), ele soma, mas imprime somente na próxima linha.
		 */
		
		
		
	}

}

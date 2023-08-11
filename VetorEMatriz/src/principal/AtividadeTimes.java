package principal;
import java.util.Scanner;

public class AtividadeTimes {

	public static void main(String[] args) {
		/* Ler o nome de 2 times e o número de gols marcados na partida (para cada time). 
		 * Escrever o nome do vencedor. 
		 * Caso não haja vencedor deverá ser impressa a palavra EMPATE.
		 */
		Scanner leia= new Scanner (System.in);
		
	//Variáveis para o nome dos times e da quantidade de gols	
		String [] nome = new String[2];
		int [] gols = new int[1];

	//Pedir o nome dos dois times e a quantidade de gols da partida	
		System.out.print("Entre com o nome do time: "); {
		String nome1 = leia.nextLine();
		for (int contador =0; contador<gols.length; contador++) {
		System.out.print("Entre com a quantidade de gols na partida: ");
		gols [contador] = leia.nextInt();
		}
	}
		
		System.out.print("Entre com o nome do time: "); {
		String nome2 = leia.nextLine();
		for (int contador =0; contador<gols.length; contador++) {
		System.out.print("Entre com a quantidade de gols na partida: ");
		gols [contador] = leia.nextInt();
		
		
		}
		}
		leia.close();	
	}

}

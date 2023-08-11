package principal;

import java.util.Scanner;

public class AtividadePostoCombustivel {

	public static void main(String[] args) {
		/*
		 * Um posto está vendendo combustíveis com a seguinte tabela de descontos: até
		 * 20 litros, desconto de 3% por litro Álcool acima de 20 litros, desconto de 5%
		 * por litro
		 * 
		 * até 20 litros, desconto de 4% por litro Gasolina acima de 20 litros, desconto
		 * de 6% por litro
		 * 
		 * 
		 * Escreva um algoritmo que leia o número de litros vendidos e o tipo de
		 * combustível (codificado da seguinte forma: A-álcool, G-gasolina), calcule e
		 * imprima o valor a ser pago pelo cliente sabendo-se que o preço do litro da
		 * gasolina é R$ 5,80 e o preço do litro do álcool é R$ 3,90.
		 */

		// Scanner para fazer a leitura dos dados que o usuário vai inserir
		Scanner leia = new Scanner(System.in);
		// criar variáveis para receber os valores dos combustíveis
		double valorGasolina = 5.80;
		double valorAlcool = 3.9;

		// criar uma variável para receber a quantidade de litros
		double quantidadeLitros = 0;

		// Criar variável para o tipo de combustível
		char tipoCombustivel;

		// Criar uma variável do total a pagar já com desconto
		double totalAPagar = 0;

		// Qual o tipo de combustível, para saber o valor total a ser pago
		// Criação de uma validação(do/while) para que o usuário não digite um
		// combustível inválido (somente A ou G)
		do {
			System.out.println("Entre com o combustível (A/G): ");
			tipoCombustivel = leia.next().charAt(0);
		} while (Character.toUpperCase(tipoCombustivel) != 'A' && Character.toUpperCase(tipoCombustivel) != 'G');

		// Atualizar o valor da variável
		tipoCombustivel = Character.toUpperCase(tipoCombustivel);

		// Verificação para não colocar números negativos ou zero
		do {
			System.out.println("Quantos litros foram abastecidos:? ");
			quantidadeLitros = leia.nextDouble();
		} while (quantidadeLitros <= 0);

		/*
		 * Calcular o valor do desconto com base na quantidade de litros que foi
		 * abastecido e o tipo de combustível
		 */

		// Valor para gasolina
		if (tipoCombustivel == 'G') {
			if (quantidadeLitros <= 20) {
				totalAPagar = (quantidadeLitros * valorGasolina);
				totalAPagar = (totalAPagar - (totalAPagar * 0.04));
				System.out.println("Valor a ser pago com desconto: " + totalAPagar);
			} else {
				totalAPagar = (quantidadeLitros * valorGasolina);
				totalAPagar = (totalAPagar - (totalAPagar * 0.06));
				System.out.println("Valor a ser pago com desconto: " + totalAPagar);
			}
		}
		// Valor para o álcool
		if (tipoCombustivel == 'A') {
			if (quantidadeLitros <= 20) {
				totalAPagar = (quantidadeLitros * valorAlcool);
				totalAPagar = (totalAPagar - (totalAPagar * 0.03));
				System.out.println("Valor a ser pago com desconto: " + totalAPagar);
			} else {
				totalAPagar = (quantidadeLitros * valorAlcool);
				totalAPagar = (totalAPagar - (totalAPagar * 0.05));
				System.out.println("Valor a ser pago com desconto: " + totalAPagar);
			}

		}
			
			leia.close();
		

	}
}
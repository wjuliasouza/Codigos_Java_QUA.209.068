package principal;

import java.util.Scanner;

public class ContraCheques {

	public static void main(String[] args) {
		/*Faça um programa que receba o salario e a quantidade de venda total que o vendedor fez no mês, 
		 * e calcule o salario do mês. 
		 * Há também o desconto de 5% de inss e 11% de IRPF sobre o salario bruto.
		 * 
		 * Se o vendedor possui o total de venda acima de 20 mil no mês, ele recebe uma bonificação de 5% sobre o valor das vendas;
		 * Se o vendedor possui o total de venda entre 15 e 20 mil reais, recebe uma bonificação de 3% no valor da venda;
		 * Se o vendedor possui o total de venda entre 10 e 15 mil reais, recebe uma bonificação de 1% no valor da venda;
		 * Se o valor não passar de 10 mil, imprima uma frase motivacional;

Todos os funcionários devem ter o contracheques detalhado, 
funcionários que receberam bonificações não devem ter descontos sobre a bonificação, indicando o mês de referência;
		 */

		Scanner sc = new Scanner (System.in);
		
		String nome;
		double salarioBruto = 0;
		double totalVendas = 0;
		double inss = 0.05;
		double irpf = 0.11;
		
		System.out.println("Entre com o nome do funcionário: ");
		nome = sc.nextLine();
		
		System.out.println("Entre com o salário do funcionário: ");
		salarioBruto = sc.nextDouble();
		
		System.out.println("Entre com o total de vendas do funcionário: ");
		totalVendas = sc.nextDouble();
		
		double descontos = calcularDescontos (salarioBruto, inss, irpf);
		double comissao = calcularComissao (totalVendas);
		double salarioLiquido = salarioBruto-descontos+comissao;
		
			System.out.println("************************************************");
			System.out.println("Funcionário: "+nome);
			System.out.println("Salário bruto: "+salarioBruto);
			System.out.println("Total de vendas no mês: "+totalVendas);
			System.out.println("Descontos do mês: "+ descontos);
			System.out.println ("Comissão do mês: "+comissao);
			System.out.println("Salário Líquido: "+salarioLiquido);
			if (totalVendas<10000) {
				System.out.println("Continue tentando! Você pode mais!");
			}
			System.out.println("************************************************");
		sc.close();
		
	}
	static double calcularDescontos (double salarioBruto, double inss, double irpf) {
		return ((salarioBruto * inss) + salarioBruto *irpf);
	}
	static double calcularComissao (double totalVendas) {
	       double bonificacao =0;
	       
	       if (totalVendas>20000) {
	    	   bonificacao = totalVendas*0.05;
	       } else if (totalVendas>15000) {
	    	   bonificacao = totalVendas*0.03;
	       }else if (totalVendas >10000) {
	    	   bonificacao = totalVendas*0.01;
	       } else {
	    	   bonificacao = 0;
	       }
	       
  return bonificacao;
	}
	}



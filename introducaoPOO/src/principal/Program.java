package principal;

import java.util.Scanner;

import entities.Carro;

public class Program {

	public static void main(String[] args) {
		// Conceito de carros
		
		//características(atributos)
		//comportamentos(métodos/função)
		//exemplo de comportamentos: acelerar, freiar, acender farois...
		
		//classes tem muitos recursos como: sobrecarga de métodos e construtores
		//4 pilares podem ser aplicados
		//pacotes tipo entities(entidades do sistema) de acordo com a modelagem de negócios. Ex.: carro, pessoa, endereço...
		//services: clienteServices, e-mail services...
		//controlers
		//utilitarias: math
		
		//classe é um molde para o objeto!!!!!!!
	
		Scanner sc = new Scanner(System.in);
	Carro carro = new Carro();
	Carro carroPopular = new Carro();
	
	carro.modelo = "celta";
	carro.ano = "2010";
	carro.placa = "xpt-2023";
	carro.cor = "azul";
	
	carroPopular.modelo = "gol";
	carroPopular.cor = "vermelho";
	
	/*carroPopular.ano = sc.nextLine();
	
	System.out.println(carro.ano);
	System.out.println(carroPopular.ano);*/
	
	System.out.println(carro.velocidade);
	carro.velocidadeVeiculo();
	carro.velocidadeVeiculo();
	carro.velocidadeVeiculo();
	carro.velocidadeVeiculo();
	
	System.out.println(carro.velocidade);
	carro.velocidade = 10;
	
	System.out.println(carro.velocidade);
	
		sc.close();
	}

}

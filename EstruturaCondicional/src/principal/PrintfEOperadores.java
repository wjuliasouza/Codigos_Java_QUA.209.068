package principal;

public class PrintfEOperadores {

	public static void main(String[] args) {
		String nome = "Júlia Souza";
		int idade = 27;
		double altura = 1.69;
		boolean verdadeiro = true;
		boolean falso = false;		
		
		// para o tipo char, usa o %c
		System.out.printf("%s, tem %d, e sua altura é: %.2f \n", nome, idade, altura); 

		/* operadores de comparação
		 * > maior que
		 * < menor que
		 * >= maior ou igual a
		 * <= menor ou igual a
		 * != diferente
		 * == igual
		 */
		
		
		/* operadores lógicos
		 * && significa E
		 * || significa OU
		 * ! significa Negação
		 */
		
		if(verdadeiro) {
		System.out.println (10);
		
		}else
			System.out.println (20);
		
		char opcao = 's';
		int idade2 = 17;
		String diaSemana = "sexta";
		
		//um único if é uma estrutura simples
		//if e else tenho uma estrututra composta
		//if else é uma estrutura encadeada
		//podemos ter estruturas dentro de cada if/if else
		//para String não se usa ==, se usa .equals
		
		if (opcao == 's' && idade2 >= 18)
		{
		  System.out.println ("Pode entrar na festa");	
		}
		else
		{
		  System.out.println ("Volta para casa!");
		}
		if (diaSemana.equals ("segunda")) {
			System.out.println ("Segunda-feira");
		}
		else if (diaSemana.equals ("terca")) {
			System.out.println ("Terça-feira");
		}
		else if (diaSemana.equals ("sexta")) {
			System.out.println ("Sexta-feira");
		}
		else {
			System.out.println ("Não correponde a um dia da semana!");
		}
		
		int diasSemana = 7;
		
		switch (diasSemana) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda");
			break;
		case 3:
			System.out.println("Terça");
			break;
		case 4:
			System.out.println("Quarta");
			break;
		case 5:
			System.out.println("Quinta");
			break;
		case 6:
			System.out.println("Sexta");
		case 7:
			System.out.println("Sábado");
			break;

		default:
			System.out.println("Não corresponde a um dia da semana."); 
			break;
		}
		
		
		
		
	}

}

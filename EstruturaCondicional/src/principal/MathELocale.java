package principal;

import java.util.Locale;
import java.util.Scanner;

public class MathELocale {

	public static void main(String[] args) {
		// atalho para importar ctrl+shift+o
		// ao invés de usar a vírgula, dá pra usar o ponto
		
		
		final Locale ponto = new Locale ("en", "us");
		Scanner leia = new Scanner (System.in);
		double altura = 0;
		double decimal = 10.33333;
		int numero = (int) decimal;
		
		//potencia
		System.out.println (Math.pow(2, 5));
		//maior número entre 2 números ou variáveis
		System.out.println (Math.max(2, 10));
		//menor número entre 2 números variáveis
		System.out.println (Math.min(2, 10));
	    //obter raíza quadrada
		System.out.println (Math.sqrt(16));
		//arredondar números
		System.out.println (Math.round (decimal));
		//número PI armazenado
		System.out.println (Math.PI);
		
		/*System.out.printf("Resultado: %2f, decimal);
		 
		 */
		/*System.out.printf("Entre com sua altura: ");
		 * altura = leia.useLocale(ponto).nextDouble();
		 
		 * System.out.println("A altura digitada foi: " + altura); 
		 */
		
		
		
		
leia.close();
	}

}

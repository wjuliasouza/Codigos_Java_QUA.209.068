package principal;

public class Vetor {

	public static void main(String[] args) {
		// Vetor é uma sequência não ordenada de dados do mesmo tipo
		// A contagem do Vetor é por índice e inicia do índice 0
		// Vetor não pode conter dados de  tipos diferentes
		// Vetor também é conhecido como Array
		// Vetor é unidimensional, uma direção
		// Os dados do array são armazenados em um espaço de memória
		
		// Se o array for do tipo String, ele vai contar cada letra da frase
		
		/* (xpto123) = 10, 20, 30, 40
		 */
		
		int array =5;
		int [] numeros = new int[array];
		numeros [0] = 10;
		numeros [1] = 20; 
		numeros [2] = 30;
		numeros [3] = 40;
		numeros [4] = 50;
		System.out.println("fora do for:" + numeros[0]);
		
       for (int contador = 0; contador <numeros.length; contador ++); 
        System.out.println("dentro do for: " + numeros[array]);
	
       for (int numero: numeros) {
    	System.out.println(numero);   
       }
	
}
}
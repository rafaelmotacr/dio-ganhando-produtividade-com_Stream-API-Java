package desafios_stream_api;

import java.util.Arrays;
import java.util.List;

public class Desafio_02 {

	// Desafio 2 - Imprima a soma dos números pares da lista:
	// Utilizando a Stream API, realize a soma dos números pares da lista e exiba o resultado no console.
	
	public static void main(String[] args) {
		
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		numeros.stream().sorted().forEach(System.out :: println);
	}

}

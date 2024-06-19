package desafios_stream_api;

import java.util.Arrays;
import java.util.List;

public class Desafio_04{

	// Desafio 4 - Remova todos os valores ímpares:
	// Utilize a Stream API para remover os valores ímpares da lista e imprima a lista resultante no console.
	
	public static void main(String[] args) {
		
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		numeros.stream()
				.filter((i) -> i % 2 == 0)
				.forEach(System.out :: println);
	}

}


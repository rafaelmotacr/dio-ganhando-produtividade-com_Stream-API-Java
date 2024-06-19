package desafios_stream_api;

import java.util.Arrays;
import java.util.List;

public class Desafio_10{

	// Desafio 10 - Agrupe os valores ímpares múltiplos de 3 ou de 5:
	// Utilize a Stream API para agrupar os valores ímpares múltiplos de 3 ou de 5 e exiba o resultado no console.

	public static void main(String[] args) {

		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		List <Integer> result = numeros.stream()
										.filter((i) -> (i % 3 == 0 || i % 5 == 0) && (i % 2 !=0))
										.toList();
		result.stream().forEach(System.out :: println);

	}

}


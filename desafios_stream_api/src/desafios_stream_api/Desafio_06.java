package desafios_stream_api;

import java.util.Arrays;
import java.util.List;

public class Desafio_06{

	// Desafio 6 - Verificar se a lista contém algum número maior que 10:
	// Utilize a Stream API para verificar se a lista contém algum número maior que 10 e exiba o resultado no console.
	
	public static void main(String[] args) {
		
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		boolean existeNumeroMaiorQueDez = numeros.stream()
												.anyMatch((i) -> i > 10);
		System.out.println("Existem numeros maiores que 10 na lista? " + existeNumeroMaiorQueDez);
	}

}


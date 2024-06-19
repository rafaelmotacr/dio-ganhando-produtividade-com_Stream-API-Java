package desafios_stream_api;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio_07{

	// Desafio 7 - Encontrar o segundo número maior da lista:
	// Com a ajuda da Stream API, encontre o segundo número maior da lista e exiba o resultado no console.
	
	public static void main(String[] args) {
		
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		int sgundoMaiorNumeroDaLista = numeros.stream()
												.sorted(Collections.reverseOrder())
												.collect(Collectors.toList())
												.get(1);
		
		System.out.println("O segundo maior numero da lista eh: " + sgundoMaiorNumeroDaLista);
	}

}


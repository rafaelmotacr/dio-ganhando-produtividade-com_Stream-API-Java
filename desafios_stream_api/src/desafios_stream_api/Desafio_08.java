package desafios_stream_api;

import java.util.Arrays;
import java.util.List;

public class Desafio_08{

	// Desafio 8 - Somar os dígitos de todos os números da lista:
	// Utilizando a Stream API, realize a soma dos dígitos de todos os números da lista e exiba o resultado no console.

	public static void main(String[] args) {

		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		int somaDeTodosOsDigitos = numeros.stream()
                .map(String::valueOf)       // Converte cada número para String
                .flatMapToInt(s -> s.chars()) // Quebra a string em dígitos individuais
                .map(Character::getNumericValue) // Converte cada caractere para seu valor numérico
                .sum();   										
		System.out.println("A soma de todos os digitos eh: " + somaDeTodosOsDigitos);
	}

}


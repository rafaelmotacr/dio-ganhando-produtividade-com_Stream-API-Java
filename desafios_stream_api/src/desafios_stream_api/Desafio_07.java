package desafios_stream_api;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class Desafio_07{

	// Desafio 7 - Encontrar o segundo número maior da lista:
	// Com a ajuda da Stream API, encontre o segundo número maior da lista e exiba o resultado no console.
	
	public static void main(String[] args) {
		
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		Optional<Integer> sgundoMaiorNumeroDaLista = numeros.stream()
												.sorted(Collections.reverseOrder())
												.skip(1)
												.findFirst();
		
        if (sgundoMaiorNumeroDaLista.isPresent()) {
            System.out.println("O segundo maior numero da lista eh: " + sgundoMaiorNumeroDaLista.get());
        } else {
            System.out.println("A lista não tem um segundo maior número.");
        }
	}
}
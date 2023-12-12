package dia1212;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class ExIterator {

	public static void main(String[] args) {
//		Escreva um programa Java para criar uma Collection Set de Objetos da Classe Wrapper Integer. O programa deverá solicitar ao usuário, que ele digite via teclado 
//		10 valores inteiros não repetidos e adicione-os individualmente na Collection Set. Em seguida, faça o que se pede:
//		Mostre na tela todos os elementos da Collection Set, utilizando a Classe Iterator. 
		
		Set<Integer> numeros = new HashSet<>();
		Scanner scanner = new Scanner(System.in);

		System.out.println("\nDigite 10 números diferentes: ");

		while (numeros.size() < 10) {
		int numero = scanner.nextInt();
			numeros.add(numero);
		}

		Iterator<Integer> iterator = numeros.iterator();
		System.out.println("\nElementos da Collection Set: ");

		while (iterator.hasNext()) {
		System.out.println(iterator.next());
		}
	}

}

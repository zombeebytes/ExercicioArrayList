package dia1212;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ExArrayList {
//	Escreva um programa Java para criar uma Collection ArrayList de Objetos da Classe String. O programa deverá solicitar ao usuário, que ele digite via teclado 5 cores 
//	e deverá adicioná-las individualmente no ArrayList. Em seguida, faça o que se pede:
//		* Mostre na tela todas as cores que foram adicionadas. 
//		* Mostre na tela todas as cores que foram adicionadas ordenadas em ordem crescente.


	public static void main(String[] args) {
		ArrayList<String> cores = new ArrayList<>();
		 Scanner scanner = new Scanner(System.in);

		 System.out.println("Digite 5 cores:");

		 for (int c =0; c <5; c++) {
		 String cor = scanner.nextLine();
		 cores.add(cor);
		 }

		 System.out.println("\nCores escolhidas:");
		 for (String cor : cores) {
		 System.out.println(cor);
		 }

		 Collections.sort(cores);

		 System.out.println("\nCores escolhidas em ordem crescente:");
		 for (String cor : cores) {
		 System.out.println(cor);
		 }
		 }
		}


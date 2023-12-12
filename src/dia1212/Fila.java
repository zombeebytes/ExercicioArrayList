package dia1212;

import java.util.Iterator;
import java.util.Stack;

public class Fila {

	public static void main(String[] args) {
		Stack<String> pilha = new Stack<String>();
		pilha.push("Prato verde");
		pilha.push("Prato azul");
		pilha.push("Prato branco");
		pilha.push("Prato amarelo");
		pilha.push("Prato vermelho");
		
		System.out.println("\nElementos da pilha: " + pilha);
		System.out.println("\nRetirar elementos da pilha: " + pilha.pop());
		System.out.println("\nElementos da pilha: " + pilha);
		System.out.println("\nRetirar elementos da pilha" + pilha.pop());
		System.out.println("\nElemento no topo da pilha: " + pilha.peek());
        System.out.println("\nAdidionar elemento da pilha: " + pilha.push("Prato lilás"));
        System.out.println("\nTamanho da pilha " + pilha.size());
        System.out.println("\nVerificar se existe elementos dentro da pilha " + pilha.contains("Prato rosa"));
       
        Iterator<String> iterator = pilha.iterator();
        
        while(iterator.hasNext()) {
      	  System.out.println(iterator.next());
	}
        pilha.clear();
        System.out.println("Pilha está vazia? " + pilha.isEmpty());
        
	}

}

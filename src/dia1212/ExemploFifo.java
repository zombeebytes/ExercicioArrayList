package dia1212;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;



public class ExemploFifo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Queue<Integer> fila = new LinkedList<Integer>();
      for(int indice = 0; indice < 10; indice++) {
    	
		fila.add(indice); 
      }
      System.out.println("\nElementos da fila" + fila);
      System.out.println("\nRemover da fila " + fila.remove());
      System.out.println("\nFila atualizada " + fila);
      System.out.println("\nAdicionar elementos na fila " + fila.add(10));
      System.out.println("\nFila atualizada " + fila);
      System.out.println("Exibir o primeiro item da fila " + fila.peek());
      System.out.println("\nExibir o tamanho da fila " + fila.size());
      System.out.println("\nExibir e retirar o primeiro item da fila (head) " + fila.poll());
      System.out.println("\n Exibir os itens com iterator ");
      
      Iterator<Integer> iterator = fila.iterator();
      
      while(iterator.hasNext()) {
    	  System.out.println(iterator.next());
      }
      System.out.println("\nLimpar a fila ");
      fila.clear(); 
      System.out.println("\n a fila está vazia? " + fila.isEmpty());
      System.out.println("\nFila atualizada " + fila);
      
	}

}

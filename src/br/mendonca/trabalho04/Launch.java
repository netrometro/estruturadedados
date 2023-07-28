package br.mendonca.trabalho04;

import br.mendonca.trabalho04.estruturas.ThiagoBarrosEstrutura;
import br.mendonca.trabalho04.tads.ThiagoBarrosTAD;

public class Launch {
    public static void main(String[] args) {
        ThiagoBarrosTAD elemento1 = new ThiagoBarrosTAD();
        ThiagoBarrosTAD elemento2 = new ThiagoBarrosTAD();
        ThiagoBarrosTAD elemento3 = new ThiagoBarrosTAD();
        ThiagoBarrosTAD elemento4 = new ThiagoBarrosTAD();
        ThiagoBarrosTAD elemento5 = new ThiagoBarrosTAD();

        ThiagoBarrosEstrutura filaDinamica = new ThiagoBarrosEstrutura();

        System.out.println("---------------------- Elementos da lista ------------------------");
        System.out.println("Elemento 1: " + elemento1.print());
        System.out.println("Elemento 2: " + elemento2.print());
        System.out.println("Elemento 3: " + elemento3.print());
        System.out.println("Elemento 4: " + elemento4.print());
        System.out.println("Elemento 5: " + elemento5.print());

        System.out.println("---------------------- Adicionando elementos na lista ------------------------");
        filaDinamica.enqueue(elemento1);
        filaDinamica.enqueue(elemento2);
        filaDinamica.enqueue(elemento3);
        System.out.println("Adicionando os elementos 1, 2 e 3 na fila: \n" + filaDinamica.print());

        System.out.println("---------------------- Removendo elementos na lista ------------------------");
        System.out.println("Removendo um elemento da fila e mostrando o elemento removido: \n" + filaDinamica.dequeue());
        System.out.println("\nEstado atual da lista: \n" + filaDinamica.print());

        System.out.println("---------------------- Testando Vulnerabilidades ------------------------");
        filaDinamica.enqueue(elemento4);
        filaDinamica.dequeue();
        System.out.println("Adicionando e removendo da fila: \n" + filaDinamica.print());
        filaDinamica.enqueue(elemento5);
        filaDinamica.enqueue(elemento1);
        filaDinamica.enqueue(elemento2);
        System.out.println("\nTentando adicionar em uma lista cheia: " + filaDinamica.print());
        filaDinamica.enqueue(elemento1);
        System.out.println("\nTentando remover itens em uma lista vazia: \n");
        while (filaDinamica.getQuantidade() != 0){
            filaDinamica.dequeue();
        }
        filaDinamica.dequeue();
    }
}

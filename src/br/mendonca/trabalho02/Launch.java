package br.mendonca.trabalho02;

import br.mendonca.trabalho02.estruturas.ThiagoBarrosEstrutura;
import br.mendonca.trabalho02.tads.ThiagoBarrosTAD;

public class Launch {
	public static void main(String[] args) {
		ThiagoBarrosEstrutura listaDinamica = new ThiagoBarrosEstrutura();

		ThiagoBarrosTAD elemento1 = new ThiagoBarrosTAD();
		ThiagoBarrosTAD elemento2 = new ThiagoBarrosTAD();
		ThiagoBarrosTAD elemento3 = new ThiagoBarrosTAD();
		ThiagoBarrosTAD elemento4 = new ThiagoBarrosTAD();
		ThiagoBarrosTAD elemento5 = new ThiagoBarrosTAD();

		System.out.println("---------------------- Elementos da lista ------------------------");
		System.out.println("Elemento 1: " + elemento1.print());
		System.out.println("Elemento 2: " + elemento2.print());
		System.out.println("Elemento 3: " + elemento3.print());
		System.out.println("Elemento 4: " + elemento4.print());
		System.out.println("Elemento 5: " + elemento5.print());

		System.out.println("---------------------- Adicionando elementos na lista ------------------------");
		listaDinamica.inserirNoInicio(elemento1);
		listaDinamica.inserirNoFim(elemento4);

		System.out.println("Elemento 1 e 4 adicionados, 1 no início e 4 no fim: \n" + listaDinamica.print());

		listaDinamica.inserirNoMeio(elemento3, 1);
		System.out.println("\nElemento 3 inserido na posição 1 da lista: \n" + listaDinamica.print());

		listaDinamica.inserirNoMeio(elemento2, 1);
		listaDinamica.inserirNoFim(elemento5);
		System.out.println("Elemento 2 inserido na posição 1\nElemento 5 inserido no fim da lista: \n" + listaDinamica.print());
		System.out.println("\nQuantidade de Elementos: " + listaDinamica.getQuantidade());

		System.out.println("---------------------- Removendo elementos na lista ------------------------");
		listaDinamica.excluirNoFim();
		System.out.println("Excluindo o elemento final da lista: \n" + listaDinamica.print());

		listaDinamica.excluirNoMeio(2);
		System.out.println("\nExcluindo o elemento 2 da lista: \n" + listaDinamica.print());

		listaDinamica.excluirNoInicio();
		System.out.println("\nExcluindo o elemento inicial da lista: \n" + listaDinamica.print());

		listaDinamica.excluirNoFim();
		listaDinamica.excluirNoFim();
		System.out.println("\nExcluindo todos os elementos da lista utilizando exclusão no final:\n" + listaDinamica.print());

		System.out.println("\nTentando excluir algo numa lista vazia utilizando todos os métodos da lista: \n" + listaDinamica.print());
		listaDinamica.excluirNoInicio();
		listaDinamica.excluirNoMeio(0);
		listaDinamica.excluirNoFim();

		listaDinamica.inserirNoFim(elemento1);
		System.out.println("\nTentando por algo no final de uma lista vazia: \n" + listaDinamica.print());
		System.out.println("\nColocando um item com o inserirNoMeio numa posição inexistente");
		listaDinamica.inserirNoMeio(elemento2, 2);

	}
}

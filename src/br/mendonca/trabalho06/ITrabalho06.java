package br.mendonca.trabalho06;

public interface ITrabalho06 {

	String getAluno();

	int getQuantidade();

	Object getLista();

	void push(ITAD tad);

	ITAD pop();

	ITAD get(int posicao);

	String print();

}
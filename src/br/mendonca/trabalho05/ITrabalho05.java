package br.mendonca.trabalho05;

public interface ITrabalho05 {

	String getAluno();

	Object getLista();

	int getQuantidade();

	void push(ITAD tad);

	ITAD pop();

	ITAD get(int posicao);

	String print();

}
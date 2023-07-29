package br.mendonca.trabalho04;

public interface ITrabalho04 {

	String getAluno();
	
	int getQuantidade();

	Object getLista();

	void enqueue(ITAD tad);

	ITAD dequeue();

	ITAD get(int posicao);

	String print();

}
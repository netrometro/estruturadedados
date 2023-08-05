package br.mendonca.trabalho07;

public interface ITrabalho07 {

	String getEstudante();

	Object getLista();

	int getQuantidade();

	void inserirNoIncio(ITAD tad);

	void inserirNoFim(ITAD tad);

	void inserirNoMeio(ITAD tad, int posicao);

	ITAD removerNoInicio();

	ITAD removerNoFim();

	ITAD removerNoMeio();

	ITAD get(int posicao);

	String print();

}
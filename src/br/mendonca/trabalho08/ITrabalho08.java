package br.mendonca.trabalho08;

public interface ITrabalho08 {

	String getAluno();

	Object getLista();

	int getQuantidade();

	void inserirNoIncio(ITAD tad);

	void inserirNoFim(ITAD tad);

	void inserirNoMeio(ITAD tad, int posicao);

	ITAD removerNoInicio();

	ITAD removerNoFim();

	ITAD removerNoMeio(int posicao);

	ITAD get(int posicao);

	String print();

}
package br.mendonca.trabalho10;

public interface ITrabalho10 {

	String getAluno();
	
	int getQuantidade();

	void inserirNoInicio(ITAD tad);

	void inserirNoFim(ITAD tad);

	void inserirNoMeio(ITAD tad, int posicao);

	void excluirNoFim();

	void excluirNoInicio();

	void excluirNoMeio(int posicao);
	
	ITAD getItem(int posicao);

	String print();
}


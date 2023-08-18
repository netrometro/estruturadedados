package br.mendonca.trabalho15;

public interface ITrabalho15 {

	String getAluno();
	
	int getQuantidade();

	void inserirNoInicio(ITAD tad);

	void inserirNoFim(ITAD tad);

	void inserirNoMeio(ITAD tad, int posicao);

	void excluirNoFim();

	void excluirNoInicio();

	void excluirNoMeio(int posicao);
	
	ITAD getItem(int posicao);
	
	void setItem(ITAD tad, int posicao);

	String print();
}


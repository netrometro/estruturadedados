package br.mendonca.trabalho09;

public interface ITrabalho09 {

	String getAluno();

	int quantidade();

	Object getLista();

	void inserirAntes(ITAD tad);

	void inserirDepois(ITAD tad);

	void deslocarCursor(int posicao);

	ITAD removerAntes();

	ITAD removerDepois();

	ITAD getAtual();

	ITAD get(int posicao);

	String print();

}
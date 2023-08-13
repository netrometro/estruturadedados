package br.mendonca.trabalho10;

public interface IBuscas {
	
	String getAluno();

	ITAD linear(ITrabalho10 lista, ITAD tad);

	ITAD ordenada(ITrabalho10 lista, ITAD tad);

	ITAD binaria(ITrabalho10 lista, ITAD tad);

}
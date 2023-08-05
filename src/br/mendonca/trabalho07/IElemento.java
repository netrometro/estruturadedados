package br.mendonca.trabalho07;

public interface IElemento {

	ITAD getTad();

	void setTad(ITAD tad);

	IElemento getNext();

	void setNext(IElemento next);

	IElemento getPrevious();

	void setPrevious(IElemento previous);

}
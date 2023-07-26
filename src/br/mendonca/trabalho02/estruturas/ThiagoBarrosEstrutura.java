package br.mendonca.trabalho02.estruturas;

import br.mendonca.trabalho02.ITAD;
import br.mendonca.trabalho02.ITrabalho02;
import br.mendonca.trabalho02.elementos.ThiagoBarrosElemento;

public class ThiagoBarrosEstrutura implements ITrabalho02 {
    private ThiagoBarrosElemento inicio;
    private int quantidade = 0;
    @Override
    public String getAluno() {
        return "Thiago Alves de Barros";
    }

    @Override
    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public void inserirNoInicio(ITAD tad) {
        ThiagoBarrosElemento novo = new ThiagoBarrosElemento(tad);

        novo.setNext(inicio);
        inicio = novo;
        quantidade++;
    }

    @Override
    public void inserirNoFim(ITAD tad) {
        ThiagoBarrosElemento novo = new ThiagoBarrosElemento(tad);

        if (inicio == null){
            inicio = novo;
        } else {
            ThiagoBarrosElemento cursor = inicio;
            while (cursor.getNext() != null){
                cursor = cursor.getNext();
            }
            cursor.setNext(novo);
        }
        quantidade++;
    }

    @Override
    public void inserirNoMeio(ITAD tad, int posicao) {
        if (posicao < 0 || posicao > quantidade) {
            System.out.println("Você está tentando por um elemento numa posição inexistente, por favor coloque uma posição válida");
            return;
        }
        ThiagoBarrosElemento novo = new ThiagoBarrosElemento(tad);
        ThiagoBarrosElemento cursor = inicio;

        for (int i = 0; i < (posicao - 1); i++){
            cursor = cursor.getNext();
        }

        ThiagoBarrosElemento anterior = cursor.getNext();

        cursor.setNext(novo);
        novo.setNext(anterior);
        quantidade++;
    }

    @Override
    public void excluirNoFim() {
        if (inicio == null) {
            System.out.println("A lista está vazia, não é possível fazer essa operação");
        } else {
            if (inicio.getNext() == null){
                inicio = null;
                quantidade--;
            }
            if (inicio != null && inicio.getNext() != null){
                ThiagoBarrosElemento cursor = inicio;
                ThiagoBarrosElemento anterior = null;

                while (cursor.getNext() != null){
                    anterior = cursor;
                    cursor = cursor.getNext();
                }
                anterior.setNext(null);
                quantidade--;
            }
        }
    }

    @Override
    public void excluirNoInicio() {
        if (inicio == null) {
            System.out.println("A lista está vazia, não é possível fazer essa operação");
        } else {
            ThiagoBarrosElemento inicioNovo = inicio.getNext();
            inicio.setNext(null);
            inicio = inicioNovo;
            quantidade--;
        }
    }

    @Override
    public void excluirNoMeio(int posicao) {
        if (posicao < 0 || posicao > quantidade){
            throw new IndexOutOfBoundsException();
        }
        if (inicio == null) {
            System.out.println("A lista está vazia, não é possível fazer essa operação");
        } else {
            ThiagoBarrosElemento cursor = inicio;
            ThiagoBarrosElemento anterior = inicio;

            for(int i = 0; i < posicao; i++){
                anterior = cursor;
                cursor = cursor.getNext();
            }

            anterior.setNext(cursor.getNext());
            quantidade--;
        }
    }

    @Override
    public ITAD getItem(int posicao) {
        if (posicao < 0 || posicao > quantidade - 1) return null;

        ThiagoBarrosElemento cursor = inicio;
        for(int i = 0; i < posicao; i++){
            cursor = cursor.getNext();
        }
        return cursor.getItad();
    }

    @Override
    public String print() {
        if (quantidade == 0) {
            return "Lista vazia";
        } else {
            StringBuilder matriz = new StringBuilder();

            ThiagoBarrosElemento cursor = inicio;
            for (int i = 0; i < quantidade; i++){
                matriz.append("\n" + i + "." + cursor.getItad().print());
                cursor = cursor.getNext();
            }
            return matriz.toString();
        }
    }
}
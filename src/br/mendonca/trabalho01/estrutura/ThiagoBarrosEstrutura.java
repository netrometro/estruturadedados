package br.mendonca.trabalho01.estrutura;

import br.mendonca.trabalho01.ITAD;
import br.mendonca.trabalho01.ITrabalho01;
import br.mendonca.trabalho01.tads.ThiagoBarrosTAD;

public class ThiagoBarrosEstrutura implements ITrabalho01 {
    private final ThiagoBarrosTAD[] lista;
    private final int max;
    private int quantidade;
    public ThiagoBarrosEstrutura(int tamanho) {
        lista = new ThiagoBarrosTAD[tamanho];
        max = tamanho;
        quantidade = 0;
    }

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
        if (quantidade < max) {
            for (int i = quantidade; i > 0; i--){
                lista[i] = lista[i-1];
            }
            lista[0] = (ThiagoBarrosTAD) tad;
            quantidade++;
        }
    }

    @Override
    public void inserirNoFim(ITAD tad) {
        if (quantidade < max){
            lista[quantidade] = (ThiagoBarrosTAD) tad;
            quantidade++;
        }
        else {
            System.out.println("Não foi possível adicionar pois a lista já está cheia.");
        }
    }

    @Override
    public void inserirNoMeio(ITAD tad, int posicao) {
        if (quantidade < max && posicao > -1 && posicao < quantidade+1) {
            for(int i = quantidade; i > posicao; i--){
                lista[i] = lista [i-1];
            }
            lista[posicao] = (ThiagoBarrosTAD) tad;
            quantidade++;
        }
    }

    @Override
    public void excluirNoFim() {
        if (quantidade == 0) {
            System.out.println("A lista já está vazia");
        } else {
            lista[quantidade] = null;
            quantidade--;
        }
    }

    @Override
    public void excluirNoInicio() {
        if (quantidade == 0) {
            System.out.println("A lista já está vazia");
        } else {
            for(int i = 0; i < quantidade - 1; i++){
                lista[i] = lista[i+1];
            }
            lista[quantidade] = null;
            quantidade--;
        }
    }

    @Override
    public void excluirNoMeio(int posicao) {
        if (quantidade == 0) {
            System.out.println("A lista já está vazia");
        } else {
            if (posicao < 0 || posicao > quantidade - 1) {
                System.out.println("A posição que você colocou não existe.");
            } else {
                for (int i = posicao; i < quantidade - 1; i++){
                    lista[i] = lista[i+1];
                }
                lista[quantidade] = null;
                quantidade--;
            }
        }
    }

    @Override
    public ITAD getItem(int posicao) {
        if (posicao >= 0 && posicao <= quantidade - 1){
            return lista[posicao];
        } else {
            System.out.println("Posição informada não possui nenhum elemento");
            return null;
        }
    }

    @Override
    public String print() {
        StringBuilder matriz = new StringBuilder();
        for(int i = 0; i < quantidade; i++){
            matriz.append("\n[" + (i) + "]" + lista[i].print());
        }
        return matriz.toString();
    }
}

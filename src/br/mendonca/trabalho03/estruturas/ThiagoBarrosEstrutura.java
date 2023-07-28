package br.mendonca.trabalho03.estruturas;

import br.mendonca.trabalho03.ITAD;
import br.mendonca.trabalho03.ITrabalho03;
import br.mendonca.trabalho03.tads.ThiagoBarrosTAD;

public class ThiagoBarrosEstrutura implements ITrabalho03 {
    private final ThiagoBarrosTAD[] filaEstatica;
    private int quantidade = 0;
    private int inicio = 0;
    private int fim = 0;

    public ThiagoBarrosEstrutura(int tamanho){
        filaEstatica = new ThiagoBarrosTAD[tamanho];
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
    public void enqueue(ITAD tad) {
        if (quantidade == filaEstatica.length) {
            System.out.println("A fila já está cheia.");
        } else {
            fim = fim % filaEstatica.length;
            filaEstatica[fim] = (ThiagoBarrosTAD) tad;
            fim++;
            quantidade++;
        }
    }

    @Override
    public ITAD dequeue() {
        if (quantidade != 0){
            inicio = inicio % filaEstatica.length;

            ThiagoBarrosTAD itemExcluido = filaEstatica[inicio];
            filaEstatica[inicio] = null;
            inicio++;
            quantidade--;
            return itemExcluido;
        } else {
            System.out.println("A fila já está vazia");
            return null;
        }
    }

    @Override
    public ITAD get(int posicao) {
        if (posicao < 0 || posicao > quantidade - 1){
            System.out.println("Posição informada é inexistente");
            return null;
        } else {
            return filaEstatica[posicao];
        }
    }

    @Override
    public String print() {
        StringBuilder matriz = new StringBuilder();
        for(int i = 0; i < filaEstatica.length; i++){
            if (filaEstatica[i] == null){
                matriz.append("\n[" + (i) + "]"+ "Null");
            } else {
                matriz.append("\n[" + (i) + "]" + filaEstatica[i].print());
            }
        }
        return matriz.toString();
    }
}

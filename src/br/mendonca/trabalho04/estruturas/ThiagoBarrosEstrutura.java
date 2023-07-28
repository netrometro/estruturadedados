package br.mendonca.trabalho04.estruturas;

import br.mendonca.trabalho04.ITAD;
import br.mendonca.trabalho04.ITrabalho04;
import br.mendonca.trabalho04.elementos.ThiagoBarrosElemento;

public class ThiagoBarrosEstrutura implements ITrabalho04{
    private ThiagoBarrosElemento topo;
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
    public void enqueue(ITAD tad) {
        ThiagoBarrosElemento elemento = new ThiagoBarrosElemento(tad);
        elemento.setNext(topo);
        topo = elemento;
        quantidade++;
    }

    @Override
    public ITAD dequeue() {
        if (quantidade == 0) {
            System.out.println("A fila já está vazia.");
            return null;
        }
        ThiagoBarrosElemento elemTopo = topo;
        topo = topo.getNext();
        quantidade--;
        return elemTopo.getItad();
    }

    @Override
    public ITAD get(int posicao) {
        if (posicao < 0 || posicao > quantidade - 1){
            System.out.println("Posição informada não existe");
            return null;
        } else {
            ThiagoBarrosElemento cursor = topo;
            for (int i = 0; i < posicao; i++){
                cursor = cursor.getNext();
            }
            return cursor.getItad();
        }
    }

    @Override
    public String print() {
        StringBuilder matriz = new StringBuilder();
        ThiagoBarrosElemento cursor = topo;
        for(int i = 0; i < quantidade; i++){
            if (cursor == null){
                matriz.append("\n[" + (i) + "]"+ "Null");
            } else {
                matriz.append("\n[" + (i) + "]" + cursor.getItad().print());
            }
            cursor = cursor.getNext();
        }
        return matriz.toString();
    }
}
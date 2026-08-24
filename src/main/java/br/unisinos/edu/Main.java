package br.unisinos.edu;

public class Main {
    public static void main(String[] args) {
        Util util = new Util();

        int tamanhoLista = 1000;
        int limiteLista = 10500;
        int[] lista = util.gerarLista(tamanhoLista, limiteLista);

//        util.insertionSort(lista);

        long inicio = System.nanoTime();

//        util.bubbleSort(lista);
//
//        util.insertionSort(lista);

        long fimFim = System.nanoTime();

        double tempoTotal = (fimFim - inicio) / 1_000_000.0;

        System.out.println("Tempo de execução: " + tempoTotal + " ms");
    }
}
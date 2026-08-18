package br.unisinos.edu;

import java.util.Arrays;
import java.util.Random;

public class Util {

    public int[] gerarLista(int tamanho, int limite){
        Random gerador = new Random();

        int[] lista = new int[tamanho];

        for(int i = 0; i < tamanho; i++){
            lista[i] = gerador.nextInt(limite+1);
        }

        return lista;
    }

    public void imprimeLista(int[] lista){
        for(int n : lista){
            System.out.println(n);
        }
        System.out.println("\n");
    }

    public void bubbleSort(int[] lista) {
        int[] listaOrdenada = lista.clone();

        for (int i = 0; i < listaOrdenada.length - 1; i++) {
            for (int k = 0; k < listaOrdenada.length - 1; k++) {

                if (listaOrdenada[k] > listaOrdenada[k + 1]) {
                    int temp = listaOrdenada[k];
                    listaOrdenada[k] = listaOrdenada[k + 1];
                    listaOrdenada[k + 1] = temp;
                }
            }
        }
    }

    public void insertionSort(int[] lista){
        int n = lista.length;
        for (int i = 1; i < n; ++i) {
            int t = lista[i];
            int j = i - 1;

            while (j >= 0 && lista[j] > t) {
                lista[j + 1] = lista[j];
                j = j - 1;
            }
            lista[j + 1] = t;
        }
    }
}

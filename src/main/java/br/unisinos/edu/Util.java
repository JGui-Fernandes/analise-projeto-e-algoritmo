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

    public void shellSott(int[] lista){
        int n = lista.length;

        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int chave = lista[i];
                int j = i;
                while (j >= gap && lista[j - gap] > chave) {
                    lista[j] = lista[j - gap];
                    j -= gap;
                }
                lista[j] = chave;
            }

        }

    }

    public void quickSort(int[] lista) {
        quickSort(lista, 0, lista.length - 1);
    }

    private void quickSort(int[] lista, int inicio, int fim) {
        if (inicio < fim) {
            int pivo = particionar(lista, inicio, fim);

            quickSort(lista, inicio, pivo - 1);
            quickSort(lista, pivo + 1, fim);
        }
    }

    private int particionar(int[] lista, int inicio, int fim) {
        int pivo = lista[fim];
        int i = inicio - 1;

        for (int j = inicio; j < fim; j++) {
            if (lista[j] < pivo) {
                i++;

                int temp = lista[i];
                lista[i] = lista[j];
                lista[j] = temp;
            }
        }

        int temp = lista[i + 1];
        lista[i + 1] = lista[fim];
        lista[fim] = temp;

        return i + 1;
    }

    public void mergeSort(int[] lista) {
        int[] listaOrdenada = lista.clone();

        mergeSort(listaOrdenada, 0, listaOrdenada.length - 1);

    }

    private void mergeSort(int[] lista, int inicio, int fim) {
        if (inicio < fim) {
            int meio = (inicio + fim) / 2;

            mergeSort(lista, inicio, meio);
            mergeSort(lista, meio + 1, fim);

            merge(lista, inicio, meio, fim);
        }
    }

    private void merge(int[] lista, int inicio, int meio, int fim) {
        int[] temporario = new int[fim - inicio + 1];

        int i = inicio;
        int j = meio + 1;
        int k = 0;

        while (i <= meio && j <= fim) {
            if (lista[i] <= lista[j]) {
                temporario[k] = lista[i];
                i++;
            } else {
                temporario[k] = lista[j];
                j++;
            }

            k++;
        }

        while (i <= meio) {
            temporario[k] = lista[i];
            i++;
            k++;
        }

        while (j <= fim) {
            temporario[k] = lista[j];
            j++;
            k++;
        }

        for (i = 0; i < temporario.length; i++) {
            lista[inicio + i] = temporario[i];
        }
    }
}

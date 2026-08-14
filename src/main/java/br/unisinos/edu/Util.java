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

    public void ordenarLista(int[] lista) {
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

        imprimeLista(listaOrdenada);
    }

    public int[] separaPrimos(int[] lista) {
        int[] primos = new int[lista.length];
        int k = 0;

        for (int n : lista) {
            boolean ehPrimo = true;

            if(n < 2){
                continue;
            }

            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    ehPrimo = false;
                    break;
                }
            }

            if (ehPrimo) {
                primos[k] = n;
                k++;
            }
        }

        return Arrays.copyOf(primos, k);
    }

    public void imprimePrimos(int[] lista){
        imprimeLista(separaPrimos(lista));
    }

    public void ordenaPrimos(int[] lista){
        ordenarLista(separaPrimos(lista));
    }
}

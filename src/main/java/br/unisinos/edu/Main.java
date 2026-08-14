package br.unisinos.edu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Util util = new Util();

        int tamanhoLista = 10000;
        int limiteLista = 15000;
        int[] lista = util.gerarLista(tamanhoLista, limiteLista);

        boolean continuar = true;
        int opcao = 0;
        System.out.println("\n\nBem vindo!");

        while(continuar){
            System.out.println("\n\nDigite a opção desejada:");
            System.out.println("0 - Sair");
            System.out.println("1 - Ordenar lista");
            System.out.println("2 - Listar numeros primos");
            System.out.println("3 - Ordenar numeros primos");
            System.out.println("4 - Gerar uma nova lista");
            opcao = teclado.nextInt();

            if(opcao < 0 || opcao > 4){
                System.out.println("\n\nOpção inválida!\n\n");
                continue;
            }

            switch (opcao){
                // Sair
                case 0:
                    System.out.println("\n\nEncerrando programa!\n\n");
                    continuar = false;
                    break;
                // Ordenar
                case 1:
                    System.out.println("\n");
                    util.ordenarLista(lista);
                    break;

                // Listar primos
                case 2:
                    util.imprimePrimos(lista);
                    break;

                // Ordenar primos
                case 3:
                    util.ordenaPrimos(lista);
                    break;

                // Gerar nova lista
                case 4:
                    lista = util.gerarLista(tamanhoLista, limiteLista);
                    System.out.println("\n\nNova lista gerada!\n\n");
                    break;
            }
        }
    }
}
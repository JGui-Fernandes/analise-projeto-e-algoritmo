public class Main {
    public static void main(String[] args) {
        Util util = new Util();

        int tamanhoLista = 100000;
        int limiteLista = 15000;
        int[] lista = util.gerarLista(tamanhoLista, limiteLista);

        long inicio = System.nanoTime();

//        util.imprimeLista(lista);

//        util.ordenarLista(lista);

//        util.imprimePrimos(lista);

//        util.ordenaPrimos(lista);

        long fimFim = System.nanoTime();

        double tempoTotal = (fimFim - inicio) / 1_000_000.0;

        System.out.println("Tempo de execução: " + tempoTotal + " ms");
    }
}
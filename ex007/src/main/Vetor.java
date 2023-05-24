import java.util.Random;

public class Vetor {
    private int[] elementos;

    public Vetor(int tamanho) {
        elementos = new int[tamanho];
        preencherAleatoriamente();
    }

    private void preencherAleatoriamente() {
        Random random = new Random();
        for (int i = 0; i < elementos.length; i++) {
            elementos[i] = random.nextInt(1000); // Números aleatórios entre 0 e 999
        }
    }

    public int getTamanho() {
        return elementos.length;
    }

    public int getElemento(int indice) {
        return elementos[indice];
    }

    public int encontrarMaiorElementoRecursivo() {
        return encontrarMaiorElementoRecursivo(0, elementos.length - 1);
    }

    private int encontrarMaiorElementoRecursivo(int inicio, int fim) {
        if (inicio == fim) {
            return elementos[inicio];
        } else {
            int meio = (inicio + fim) / 2;
            int maiorEsquerda = encontrarMaiorElementoRecursivo(inicio, meio);
            int maiorDireita = encontrarMaiorElementoRecursivo(meio + 1, fim);
            return Math.max(maiorEsquerda, maiorDireita);
        }
    }

    public int encontrarMaiorElementoIterativo() {
        int maior = elementos[0];
        for (int i = 1; i < elementos.length; i++) {
            if (elementos[i] > maior) {
                maior = elementos[i];
            }
        }
        return maior;
    }

    public static void main(String[] args) {
        Vetor vetor = new Vetor(1000);

        // Encontrar o maior elemento de forma recursiva
        long inicioRecursivo = System.nanoTime();
        int maiorRecursivo = vetor.encontrarMaiorElementoRecursivo();
        long fimRecursivo = System.nanoTime();
        long tempoRecursivo = fimRecursivo - inicioRecursivo;

        // Encontrar o maior elemento de forma iterativa
        long inicioIterativo = System.nanoTime();
        int maiorIterativo = vetor.encontrarMaiorElementoIterativo();
        long fimIterativo = System.nanoTime();
        long tempoIterativo = fimIterativo - inicioIterativo;

        System.out.println("Maior elemento (recursivo): " + maiorRecursivo);
        System.out.println("Tempo de execução (recursivo): " + tempoRecursivo + " nanosegundos");

        System.out.println("Maior elemento (iterativo): " + maiorIterativo);
        System.out.println("Tempo de execução (iterativo): " + tempoIterativo + " nanosegundos");
    }
}

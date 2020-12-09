package poo.lista9.questao1;

public class ThreadPrimos extends Thread {
    private int inicio;
    private int fim;
    private int id;
    private static int qtdNumPrimos = 0;
    private static int[] vet = { 0, 0 };
    private static int qtd = 0;

    public ThreadPrimos(int inicio, int fim) {
        this.inicio = inicio;
        this.fim = fim;
        this.id = qtd;
        qtd++;
        this.start(); // coloca a thread em execução
    }

    public static int getQtdNumPrimos() {
        return qtdNumPrimos;
    }

    private boolean ehPrimo(int i) {
        if (i == 2) {
            //System.out.println(i);
            return true;
        }

        if (i == 1 || i == 0) {
            return false;
        }

        for (int j = 2; j <= i / 2; j++) {
            if (i % j == 0) {
                return false;
            }
        }
        //System.out.println(i);
        return true;
    }

    @Override
    public void run() {
        for (int i = inicio; i < fim; i++) {
            if (ehPrimo(i)) {
                vet[id]++;
            }
        }

        qtdNumPrimos += vet[id];

        System.out.println("Sou a thread " + this.id + " e a soma total de números primos até o momento é de "+ this.getQtdNumPrimos());
    }
}

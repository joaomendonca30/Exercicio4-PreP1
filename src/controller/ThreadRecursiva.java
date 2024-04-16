package controller;

public class ThreadRecursiva extends Thread{
    private long numero;

    public ThreadRecursiva(long numero) {
        this.numero = numero;
    }

    @Override
    public void run() {
        long tempoInicio = System.nanoTime();
        long resultado = fatorialRecursivo(numero);
        long tempoFinal = System.nanoTime();
        long duracao = tempoFinal - tempoInicio;

        System.out.println("O resultado do fatorial recursivo de " + numero + " é " + resultado);
        System.out.println("O tempo para cálculo do recursivo foi de: " + duracao + " nanosegundos");
    }

    private long fatorialRecursivo(long n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * fatorialRecursivo(n - 1);
    }
}

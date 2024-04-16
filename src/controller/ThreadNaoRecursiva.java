package controller;

public class ThreadNaoRecursiva extends Thread {
    private long numero;

    public ThreadNaoRecursiva(long numero) {
        this.numero = numero;
    }

    @Override
    public void run() {
        long tempoInicio = System.nanoTime();
        long resultado = fatorialNaoRecursivo(numero);
        long tempoFinal = System.nanoTime();
        long duracao = tempoFinal - tempoInicio;


        System.out.println("O resultado do fatorial não recursivo de " + numero + " é " + resultado);
        System.out.println("O tempo para cálculo do não recursivo foi de: " + duracao + " nanosegundos");
    }

    private long fatorialNaoRecursivo(long n) {
        long resultado = 1;
        for (long i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }
}

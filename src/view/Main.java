package view;

import controller.ThreadNaoRecursiva;
import controller.ThreadRecursiva;

public class Main {
    public static void main(String[] args) {
        long numero = 20;

        ThreadRecursiva recursiva = new ThreadRecursiva(numero);
        ThreadNaoRecursiva naoRecursiva = new ThreadNaoRecursiva(numero);

        recursiva.start();
        naoRecursiva.start();
    }
}
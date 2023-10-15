package org.example;


public class Hilos extends Thread{
    private final int hilo;
    private final int[][] numFibo;

    public Hilos(int hilo, int[][] numFibo) {
        this.hilo = hilo;
        this.numFibo = numFibo;
    }

    private int calcularFibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return calcularFibonacci(n - 1) + calcularFibonacci(n - 2);
    }

    public void run() {
        numFibo[hilo][0] = calcularFibonacci(hilo);
    }
}
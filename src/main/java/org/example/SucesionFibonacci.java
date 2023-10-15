package org.example;

public class SucesionFibonacci {
    private int n;
    private final int[][] numFibo;

    public SucesionFibonacci(int n) {
        this.n = n;
        this.numFibo = new int[n][1];
    }

    public void calcularFibonaci() {
        for (int i = 0; i < n; i++) {
            Thread hilo = new Hilos(i, numFibo);
            hilo.start();
            try {
                hilo.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void resultado() {
        for (int i = 0; i < n; i++) {
            System.out.println("Hilo " + i + ": " + numFibo[i][0]);
        }
    }

}

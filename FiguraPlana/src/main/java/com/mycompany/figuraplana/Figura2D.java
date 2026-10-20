package com.mycompany.figuraplana;

public abstract class Figura2D implements FiguraPlana {
    
    public Figura2D() {
        System.out.println("Se imprime una FiguraPlana...");
    }

    public abstract String imprimeFigura();
}

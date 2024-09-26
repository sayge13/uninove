package org.example;
import java.util.Scanner;


public class GerenciadorDeEntrada {
    private Scanner scanner;

    public GerenciadorDeEntrada() {
        this.scanner = new Scanner(System.in);
    }

    public Scanner getScanner() {
        return this.scanner;
    }

    public void fecharScanner() {
        this.scanner.close();
    }

    public int entradaInt() {

        return 0;
    }

}

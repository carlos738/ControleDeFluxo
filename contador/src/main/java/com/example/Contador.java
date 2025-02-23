package com.example;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int primeiroNumero = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int segundoNumero = scanner.nextInt();

        try {
            contar(primeiroNumero, segundoNumero);
        } catch (ParametrosInvalidosExeception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void contar(int primeiroNumero, int segundoNumero) throws ParametrosInvalidosExeception {
        if (primeiroNumero > segundoNumero) {
            throw new ParametrosInvalidosExeception("O segundo parâmetro deve ser maior que o primeiro");
        }

        for (int i = 1; i <= (segundoNumero - primeiroNumero); i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}

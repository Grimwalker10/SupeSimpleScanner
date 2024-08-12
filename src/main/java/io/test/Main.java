package io.test;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Ingrese una frase (o presione Enter para finalizar): ");
            var frase = scanner.nextLine();

            if (frase.isEmpty()) {
                break;
            }

            frase = frase.replace(" ", "");

            Map<Character, Integer> contador = new LinkedHashMap<>();
            for (var c : frase.toCharArray()) {
                contador.put(c, contador.getOrDefault(c, 0) + 1);
            }

            System.out.println("Conteo de caracteres:");
            for (Map.Entry<Character, Integer> entrada : contador.entrySet()) {
                System.out.println(entrada.getKey() + "=" + entrada.getValue());
            }
            System.out.println("La frase contiene " + frase.length() + " caracteres.");
            System.out.println();
        }

        scanner.close();
    }
}
package questoes;

import java.util.Scanner;

public class Exercicio2Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();
        boolean pertence = verificar(numero);
        if (pertence) {
            System.out.println(numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numero + " não pertence à sequência de Fibonacci.");
        }
    }

    public static boolean verificar(int numero) {
        if (numero == 0 || numero == 1) {
            return true;
        }
        int anterior = 0;
        int atual = 1;
        int proximo = 1;
        while (proximo <= numero) {
            if (proximo == numero) {
                return true;
            }
            anterior = atual;
            atual = proximo;
            proximo = anterior + atual;
        }
        return false;
    }


}

package lacoDoWhile;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Bruno Klein
 */
public class Exercicio03 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random r = new Random();
        int senha = r.nextInt(10) + 1;
        int chute;
        int contador = 0;
        do {
            System.out.println("Digite seu chute!");
            chute = entrada.nextInt();
            contador++;
            if (chute < senha) {
                System.out.println("O seu chute é um número muito baixo");
            } else if (chute > senha) {
                System.out.println("O seu chute é um número muito alto");
            } else {
                System.out.println("Você acertou!!! Seu total de tentativas é: " + contador);
            }
        } while (chute != senha);
        if (contador < 4) {
            System.out.println("Parabéns, você foi muito bem");
        } else if (contador < 7) {
            System.out.println("Parabéns, você foi bem");

        } else {
            System.out.println("Você foi abaixo da média");
        }
    }
}

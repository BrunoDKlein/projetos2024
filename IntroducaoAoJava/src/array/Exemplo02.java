/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Bruno Klein
 */
public class Exemplo02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random r = new Random();

        int pessoas60mais = 0;
        int maiorIdade = 0;
        int menorDeIdade = 0;
        int mediaIdade = 0;

        int idades[] = new int[10000];
        for (int i = 0; i < 10000; i++) {
            idades[i] = r.nextInt(101);
        }
        for (int i = 0; i < 10000; i++) {
            if (idades[i] > 60) {
                pessoas60mais++;
            }
            if (idades[i] > maiorIdade) {
                maiorIdade = idades[i];
            }
            if (idades[i] < 18) {
                menorDeIdade++;
            }
            mediaIdade += idades[i];
        }
        System.out.println("Pessoas 60+: " + pessoas60mais);
        System.out.println("Idade da pessoa mais velha: " + maiorIdade);
        System.out.println("Quantidade de pessoas menores de idade: " + menorDeIdade);
        System.out.println("Média de idade: " + mediaIdade / 10000);

    }
}

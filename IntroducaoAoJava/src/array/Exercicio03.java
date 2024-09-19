/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.Scanner;

/**
 *
 * @author Bruno Klein
 */
public class Exercicio03 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nomes[] = new String[5];
        int maiorQuantCaracteres = 0;
        String nomeMaisCaracteres = "";
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um nome");
            nomes[i] = entrada.next();
        }
        for (int i = 0; i < 5; i++) {
            if (nomes[i].length() > maiorQuantCaracteres) {
                maiorQuantCaracteres = nomes[i].length();
                nomeMaisCaracteres = nomes[i];
            }
        }
        System.out.println("Nome com maior quantidade de caracteres: " + nomeMaisCaracteres);
    }
}

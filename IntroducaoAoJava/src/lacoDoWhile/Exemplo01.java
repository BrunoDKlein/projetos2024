/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lacoDoWhile;

import java.util.Scanner;

/**
 *
 * @author Bruno Klein
 */
public class Exemplo01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String candidato1 = "Alan";
        String candidato2 = "Bruno";
        String candidato3 = "Victor";
        int votosC1 = 0;
        int votosC2 = 0;
        int votosC3 = 0;
        int nulos = 0;
        int parar = 0;
        int voto;
        String vencedor;
        do {
            System.out.println("Digite 1, 2 ou 3 conforme o candidato que quer votar: "
                    + "\nCandidato 1: " + candidato1 + "\nCandidato 2: " + candidato2 + "\nCandidato 3: " + candidato3);
            voto = entrada.nextInt();
            switch (voto) {
                case 1:
                    votosC1++;
                    break;
                case 2:
                    votosC2++;
                    break;
                case 3:
                    votosC3++;
                    break;
                default:
                    nulos++;
            }
            System.out.println("Se quiser parar a votação, digite 0, se quiser continuar, digite qualquer outro número");
            parar = entrada.nextInt();
        } while (parar != 0);
        if (votosC1 > votosC2 && votosC1 > votosC3) {
            vencedor = candidato1;
        } else if (votosC2 > votosC3 && votosC2 > votosC1) {
            vencedor = candidato2;
        } else if (votosC3 > votosC2 && votosC3 > votosC1) {
            vencedor = candidato3;
        } else {
            vencedor = "empate";
        }
        System.out.println("Quantidade de votos: "
                + "\n" + candidato1 + ": " + votosC1 + "\n" + candidato2 + ": " + votosC2 + "\n" + candidato3 + ": " + votosC3);
        System.out.println("O vencedor foi: " + vencedor);
    }
}

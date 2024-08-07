/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introducaoaojava;

import java.util.Scanner;

/**
 *
 * @author Mauri
 */
public class Exercicio04 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite quantos são os eleitores do município");
        int quantEleitores = entrada.nextInt();
        System.out.println("Digite a quantidade de votos brancos");
        int vBrancos = entrada.nextInt();
        System.out.println("Digite a quantidade de votos nulos");
        int vNulos = entrada.nextInt();
        System.out.println("Digite a quantidade de votos válidos");
        int vValidos = entrada.nextInt();
        double perc = vBrancos / quantEleitores;
        System.out.println(perc);
        System.out.println("O percentual que cada um representa em relação ao total de eleitores. é:" + "\n" + "Votos brancos: " + (vBrancos * 100 / quantEleitores) + "%" + "\n" + "Votos nulos: " + (vNulos * 100 / quantEleitores) + "%" + "\n" + "Votos válidos: " + (vValidos * 100 / quantEleitores) + "%");
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lacoWhile;

/**
 *
 * @author Bruno Klein
 */
public class Exercicio02 {

    public static void main(String[] args) {
        double a = 80000;
        double b = 200000;
        int ano = 0;

        while (a < b) {
            a = a * 1.03;
            b = b * 1.015;
            ano = ano + 1;
        }
        System.out.println("A quantidade em anos necessária para que a cidade A ultrapasse a cidade B em população é " + ano + " anos");
    }
}

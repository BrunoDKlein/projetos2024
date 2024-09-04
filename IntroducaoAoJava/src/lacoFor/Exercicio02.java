/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lacoFor;

/**
 *
 * @author Bruno Klein
 */
public class Exercicio02 {

    public static void main(String[] args) {
        System.out.println("Em linhas separadas");
        for (int i = 1; i <= 20; i++) {
            System.out.println(i);
        }
        System.out.println("Na mesma linha");
        for (int i = 1; i <= 20; i++) {
            System.out.print(i + "; ");
        }
    }
}

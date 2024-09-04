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
public class Exemplo01 {

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + "; ");
        }
        for (int i = 100; i >= 1; i--) {
            System.out.print(i + "; ");
        }
        for (int i = 7; i <= 77; i += 7) {
            System.out.print(i + "; ");
        }
        for (int i = 20; i >= 2; i -= 2) {
            System.out.print(i + "; ");
        }
        for (int i = 2; i <= 20; i += 3) {
            System.out.print(i + "; ");
        }
        for (int i = 99; i >= 0; i -= 11) {
            System.out.print(i + "; ");
        }
    }
}

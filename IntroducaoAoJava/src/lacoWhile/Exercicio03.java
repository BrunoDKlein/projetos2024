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
public class Exercicio03 {

    public static void main(String[] args) {
        int ant = 1;
        int atu = 0;
        while (!(atu>500)) {
            System.out.print(atu + "; ");
            atu = atu + ant;
            ant = (ant - atu) * -1;
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesviosCondicionais;

import java.util.Scanner;

/**
 *
 * @author Bruno Klein
 */
public class Exemplo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Degite F ou M");
        String sexo = entrada.next();
        if (sexo.equals("F")) {
            System.out.println("O sexo é feminino");
        } else if (sexo.equals("M")) {
            System.out.println("O sexo é masculino");
        } else {
            System.out.println("A entrada não é valida");
        }
    }
}

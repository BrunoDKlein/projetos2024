/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lacoWhile;

import java.util.Scanner;

/**
 *
 * @author Bruno Klein
 */
public class Exemplo04 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
//validando nome
        System.out.println("Informe o seu nome: ");
        String nome = entrada.next();
        while (nome.length() < 4) {
            System.out.println("Informe um nome com mais de 3 caracteres: ");
            nome = entrada.next();
        }
        //validando idade
        System.out.println("Informe a sua idade: ");
        int idade = entrada.nextInt();
        while (idade < 1 || idade > 150) {
            System.out.println("Informe uma idade entre 1 e 150 anos: ");
            idade = entrada.nextInt();
        }
        //validando salario
        System.out.println("Informe seu salário: ");
        double salario = entrada.nextDouble();
        while (salario <= 0) {
            System.out.println("Informe um salário maior que 0: ");
            salario = entrada.nextDouble();
        }
        //validando sexo
        System.out.println("Informe seu sexo (f ou m): ");
        String sexo = entrada.next();
        while (!sexo.equals("f") && !sexo.equals("m")) {
            System.out.println("Informe seu sexo (f ou m): ");
            sexo = entrada.next();
        }
        //validando estado civíl
        System.out.println("Informe seu estado civíl (s ou c ou d ou v): ");
        String eC = entrada.next();
        while (!eC.equals("s") && !eC.equals("c") && !eC.equals("d") && !eC.equals("v")) {

            System.out.println("Informe seu estado civíl (s ou c ou d ou v): ");

            eC = entrada.next();
        }
    }
}

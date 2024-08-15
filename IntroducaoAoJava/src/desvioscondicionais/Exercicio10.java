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
public class Exercicio10 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o número de identificação");
        int nIdent = entrada.nextInt();
        System.out.println("Digite a nota 1");
        double n1 = entrada.nextInt();
        System.out.println("Digite a nota 2");
        double n2 = entrada.nextInt();
        System.out.println("Digite a nota 3");
        double n3 = entrada.nextInt();
        System.out.println("Digite a média dos exercícios");
        double ME = entrada.nextInt();
        double MA = (n1 + n2 * 2 + n3 * 3 + ME) / 7;

        if (MA>=9) {
            System.out.println("Número de identificação: "+nIdent +"\n"
            + "Nota 1: "+n1 +"\n"
            + "Nota 2: "+n2 +"\n"
                    + "Nota 3: "+n3+"\n"
                    + "Nota exercicios: "+ME+"\n"
                    + "Média de aproveitamento: "+MA+"\n"
                    + "Conceito: A\n"
                    + "Aprovado");
        } else  if (MA>=7.5) {
            System.out.println("Número de identificação: "+nIdent +"\n"
            + "Nota 1: "+n1 +"\n"
            + "Nota 2: "+n2 +"\n"
                    + "Nota 3: "+n3+"\n"
                    + "Nota exercicios: "+ME+"\n"
                    + "Média de aproveitamento: "+MA+"\n"
                    + "Conceito: B\n"
                    + "Aprovado");
        } else  if (MA>=6) {
            System.out.println("Número de identificação: "+nIdent +"\n"
            + "Nota 1: "+n1 +"\n"
            + "Nota 2: "+n2 +"\n"
                    + "Nota 3: "+n3+"\n"
                    + "Nota exercicios: "+ME+"\n"
                    + "Média de aproveitamento: "+MA+"\n"
                    + "Conceito: C\n"
                    + "Aprovado");
        } else  if (MA>=4) {
            System.out.println("Número de identificação: "+nIdent +"\n"
            + "Nota 1: "+n1 +"\n"
            + "Nota 2: "+n2 +"\n"
                    + "Nota 3: "+n3+"\n"
                    + "Nota exercicios: "+ME+"\n"
                    + "Média de aproveitamento: "+MA+"\n"
                    + "Conceito: D\n"
                    + "Reprovado");
        } else  if (MA<4) {
            System.out.println("Número de identificação: "+nIdent +"\n"
            + "Nota 1: "+n1 +"\n"
            + "Nota 2: "+n2 +"\n"
                    + "Nota 3: "+n3+"\n"
                    + "Nota exercicios: "+ME+"\n"
                    + "Média de aproveitamento: "+MA+"\n"
                    + "Conceito: E\n"
                    + "Reprovado");
        }
    }
//    A atribuição dos conceitos obedece a tabela abaixo. O algoritmo deve escrever o número do aluno, suas notas, 
//    a média dos exercícios, a média de aproveitamento, o conceito correspondente e a mensagem 'Aprovado' se o conceito 
//for A, B ou C, e 'Reprovado' se o conceito for D ou E.
//Média de aproveitamento Conceito
//A. >= 90
//B. >= 75 e < 90
//C. >= 60 e < 75
//D. >= 40 e < 60
//E. < 40

}

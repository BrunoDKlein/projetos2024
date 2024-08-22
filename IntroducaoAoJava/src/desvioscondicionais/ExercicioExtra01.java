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
public class ExercicioExtra01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Caixa Eletrônico");
        String nConta = "12345-6";
        String usuario = "Bruno";
        String usuarioR = "";
        int senha = 1234;
        int senhaR = 0;
        double vOriginal = 10000;
        double saldoAtual = vOriginal;
        String sd = "";
        double vDS = 0;

        while (!usuarioR.equals(usuario) || senhaR != senha) {
            System.out.println("Digite o nome de usuário");
            usuarioR = entrada.next();
            System.out.println("Digite a senha");
            senhaR = entrada.nextInt();
        }
        System.out.println("O valor na sua conta é: " + vOriginal);
        System.out.println("Digite 'S' para fazer um saque e 'D' para fazer um depósito");
        sd = entrada.next();
        if (sd.equalsIgnoreCase("S")) {
            System.out.println("Digite o valor que quer sacar");
            vDS = entrada.nextDouble();
            if (vDS > vOriginal) {
                System.out.println("Você não tem dinheiro suficiente");
            } else {
                saldoAtual = vOriginal - vDS;
            }
        } else if (sd.equalsIgnoreCase("D")) {
            System.out.println("Digite o valor que quer depositar");
            vDS = entrada.nextDouble();
            saldoAtual = vOriginal + vDS;
        } else {
            System.out.println("Entrada inválida");
        }
        String saqueOuDeposito = "";
        if (sd.equalsIgnoreCase("S")) {
            saqueOuDeposito = "Saque";
        } else if (sd.equalsIgnoreCase("D")) {
            saqueOuDeposito = "Depósito";
        }
        String extrato = ""
                + "        EXTRATO\n"
                + "************************\n"
                + "NOME: " + usuario + "\n"
                + "CONTA: " + nConta + "\n"
                + "\n"
                + "Saldo Anterior -> " + vOriginal + "\n"
                + "         " + saqueOuDeposito + " -> " + vDS + "\n"
                + "   Saldo Atual -> " + saldoAtual + "\n"
                + "************************";
        System.out.println(extrato);

    }
}

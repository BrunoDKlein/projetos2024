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
public class Exercicio09 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor do produto");
        double valorOriginal = entrada.nextDouble();
        System.out.println("Digite a forma de pagamento: \n (a) para pagamento à vista em dinheiro ou cheque\n (b) para pagamento à vista no cartão de crédito\n (c) para pagamento em duas vezes\n (d) para pagamento em 10 vezes");
        String mPagamento=entrada.next();
        
        if (mPagamento.equalsIgnoreCase("a")) {
            System.out.println("Valor final: R$"+(valorOriginal*0.9));
        } else if (mPagamento.equalsIgnoreCase("b")) {
            System.out.println("Valor final: R$"+(valorOriginal*0.85));
        } else if (mPagamento.equalsIgnoreCase("c")) {
            System.out.println("Valor final: R$"+(valorOriginal));
        } else if (mPagamento.equalsIgnoreCase("d")) {
            System.out.println("Valor final: R$"+(valorOriginal*1.1));
        }
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switchCase;

import java.util.Scanner;

/**
 *
 * @author Bruno Klein
 */
public class Exercicio02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int unidade;
        int dezena;
        int centena;
        int unidadeM;
        String u = "";
        String d = "";
        String c = "";
        String uM = "";
        boolean d1 = false;
        System.out.println("Digite o valor do cheque: ");
        int valor = entrada.nextInt();
        unidadeM = valor / 1000;
        centena = (valor % 1000) / 100;
        dezena = (valor % 100) / 10;
        unidade = valor % 10;

        switch (unidadeM) {
            case 1:
                if (centena > 0 || dezena > 0 || unidade > 0) {
                    uM = "mil e ";
                } else {
                    uM = "mil";
                }
                break;
            case 2:
                if (centena > 0 || dezena > 0 || unidade > 0) {
                    uM = "dois mil e ";
                } else {
                    uM = "dois mil";
                }
                break;
            case 3:
                if (centena > 0 || dezena > 0 || unidade > 0) {
                    uM = "três mil e ";
                } else {
                    uM = "três mil";
                }
                break;
            case 4:
                if (centena > 0 || dezena > 0 || unidade > 0) {
                    uM = "quatro mil e ";
                } else {
                    uM = "quatro mil";
                }
                break;
            case 5:
                if (centena > 0 || dezena > 0 || unidade > 0) {
                    uM = "cinco mil e ";
                } else {
                    uM = "cinco mil";
                }
                break;
            case 6:
                if (centena > 0 || dezena > 0 || unidade > 0) {
                    uM = "seis mil e ";
                } else {
                    uM = "seis mil";
                }
                break;
            case 7:
                if (centena > 0 || dezena > 0 || unidade > 0) {
                    uM = "sete mil e ";
                } else {
                    uM = "sete mil";
                }
                break;
            case 8:
                if (centena > 0 || dezena > 0 || unidade > 0) {
                    uM = "oito mil e ";
                } else {
                    uM = "oito mil";
                }
                break;
            case 9:
                if (centena > 0 || dezena > 0 || unidade > 0) {
                    uM = "nove mil e ";
                } else {
                    uM = "nove mil";
                }
                break;
        }

        switch (centena) {
            case 1:
                if (dezena > 0 || unidade > 0) {
                    c = "cento e ";
                } else {
                    c = "cem";
                }
                break;
            case 2:
                if (dezena > 0 || unidade > 0) {
                    c = "duzentos e ";
                } else {
                    c = "duzentos";
                }
                break;
            case 3:
                if (dezena > 0 || unidade > 0) {
                    c = "trezentos e ";
                } else {
                    c = "trezentos";
                }
                break;
            case 4:
                if (dezena > 0 || unidade > 0) {
                    c = "quatrocentos e ";
                } else {
                    c = "quatrocentos";
                }
                break;
            case 5:
                if (dezena > 0 || unidade > 0) {
                    c = "quinhentos e ";
                } else {
                    c = "quinhentos";
                }
                break;
            case 6:
                if (dezena > 0 || unidade > 0) {
                    c = "seiscentos e ";
                } else {
                    c = "seiscentos";
                }
                break;
            case 7:
                if (dezena > 0 || unidade > 0) {
                    c = "setecentos e ";
                } else {
                    c = "setecentos";
                }
                break;
            case 8:
                if (dezena > 0 || unidade > 0) {
                    c = "oitocentos e ";
                } else {
                    c = "oitocentos";
                }
                break;
            case 9:
                if (dezena > 0 || unidade > 0) {
                    c = "novecentos e ";
                } else {
                    c = "novecentos";
                }
                break;
        }
        switch (dezena) {
            case 1:
                d1 = true;
                switch (unidade) {
                    case 0:
                        d = "dez";
                        break;
                    case 1:
                        d = "onze";
                        break;
                    case 2:
                        d = "doze";
                        break;
                    case 3:
                        d = "treze";
                        break;
                    case 4:
                        d = "quatorze";
                        break;
                    case 5:
                        d = "quinze";
                        break;
                    case 6:
                        d = "dezesseis";
                        break;
                    case 7:
                        d = "dezesete";
                        break;
                    case 8:
                        d = "dezoito";
                        break;
                    case 9:
                        d = "dezenove";
                        break;
                }
                break;
            case 2:
                if (unidade > 0) {
                    d = "vinte e ";
                } else {
                    d = "vinte";
                }
                break;
            case 3:
                if (unidade > 0) {
                    d = "trinta e ";
                } else {
                    d = "trinta";
                }
                break;
            case 4:
                if (unidade > 0) {
                    d = "quarenta e ";
                } else {
                    d = "quarenta";
                }
                break;
            case 5:
                if (unidade > 0) {
                    d = "cinquenta e ";
                } else {
                    d = "cinquenta";
                }
                break;
            case 6:
                if (unidade > 0) {
                    d = "sessenta e ";
                } else {
                    d = "sessenta";
                }
                break;
            case 7:
                if (unidade > 0) {
                    d = "setenta e ";
                } else {
                    d = "setenta";
                }
                break;
            case 8:
                if (unidade > 0) {
                    d = "oitenta e ";
                } else {
                    d = "oitenta";
                }
                break;
            case 9:
                if (unidade > 0) {
                    d = "noventa e ";
                } else {
                    d = "noventa";
                }
                break;
        }
        if (d1) {

        } else {
            switch (unidade) {
                case 1:
                    u = "um";
                    break;
                case 2:
                    u = "dois";
                    break;
                case 3:
                    u = "três";
                    break;
                case 4:
                    u = "quatro";
                    break;
                case 5:
                    u = "cinco";
                    break;
                case 6:
                    u = "seis";
                    break;
                case 7:
                    u = "sete";
                    break;
                case 8:
                    u = "oito";
                    break;
                case 9:
                    u = "nove";
                    break;
            }
        }
        System.out.println("Valor: R$" + valor + ",00\n" + uM + "" + c + "" + d + "" + u);
    }
}

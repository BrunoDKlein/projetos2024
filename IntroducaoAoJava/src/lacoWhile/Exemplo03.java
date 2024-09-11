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
public class Exemplo03 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o nome de usuário:");
        String usuario = entrada.next();
        System.out.println("Informe a senha:");
        String senha = entrada.next();
        int t = 1;
        while (senha.equals(usuario) && t < 3) {
          
            System.out.println("A senha não pode ser igual ao usuário");
            System.out.println("Informe o nome de usuário:");
            usuario = entrada.next();
            System.out.println("Informe a senha:");
            senha = entrada.next();
              t = t + 1;
        }
        
        if (senha.equals(usuario)) {
            System.out.println("Tentativas esgotadas");
        } else {
            System.out.println("Usuário: " + usuario + "\nSenha: " + senha);
        }
    }
}

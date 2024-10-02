/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciosComplexosArray;

import java.util.Scanner;

/**
 *
 * @author Bruno Klein
 */
//Você deve criar um programa em Java que permita ao usuário gerenciar vendas de produtos usando vetores. O programa deve oferecer as seguintes funcionalidades:
//1. Crie os vetores
//• Para cada produto, solicite o nome, preço unitário e quantidade em estoque e armazene essas informações em vetores separados.
//2. Crie o seguinte menu para as opções do controle de vendas:
//=== Menu de Opções ===
//1. Cadastrar Produto
//2. Realizar Venda
//3. Exibir Faturamento Total
//4. Exibir Produto mais Vendido
//5. Exibir Produto com Maior Faturamento
//6. Relatório de Estoque Baixo
//7. Sair do Programa
//Escolha uma opção (1-7):
//3. Cadastro de Produtos:
//• Permita que o usuário cadastre um produto
//4. Realização de Vendas:
//• Após cadastrar os produtos, permita que o usuário registre vendas.
//• Solicite o nome do produto vendido e a quantidade vendida.
//5. Atualizar estoque:
//• Verifique se a quantidade vendida não excede o estoque disponível e exiba uma mensagem de erro se for o caso.
//• Atualize o vetor de quantidade em estoque de acordo com a venda.
//6. Cálculo de Faturamento:
//• Mantenha um vetor separado para armazenar o faturamento de cada produto (preço unitário multiplicado pela quantidade vendida).
//7. Exibição de Faturamento:
//• Exiba o faturamento total das vendas e o faturamento individual de cada produto na tela.
//8. Produto mais Vendido:
//• Identifique e exiba o nome do produto mais vendido.
//9. Produto com Maior Faturamento:
//• Identifique e exiba o nome do produto com o maior faturamento.
//10. Relatório de Estoque Baixo:
//• Liste na tela os nomes dos produtos que têm estoque abaixo de um valor especificado (por exemplo, estoque abaixo de 10 unidades).
public class Exercicio02 {

    Scanner entrada = new Scanner(System.in);
    int escolhaMenu = 0;
    String produtos[] = new String[10];
    int quantProdutosEstoque[] = new int[10];
    double precoProduto[] = new double[10];
    String produtosVendidos[] = new String[20];
    int quantProdutosVendidos[] = new int[20];
    double faturamentoPorProduto[] = new double[10];
    int tamanhoProdutos = 0;
    int tamanhoVendas = 0;

    public static void main(String[] args) {
        Exercicio02 exercicio02 = new Exercicio02();
        exercicio02.menuPrincipal();
    }

    public void menuPrincipal() {
        do {
            System.out.println("=== Menu de Opções ===\n"
                    + "1. Cadastrar Produto\n"
                    + "2. Realizar Venda\n"
                    + "3. Exibir Faturamento Total\n"
                    + "4. Exibir Produto mais Vendido\n"
                    + "5. Exibir Produto com Maior Faturamento\n"
                    + "6. Relatório de Estoque Baixo\n"
                    + "7. Sair do Programa\n"
                    + "Escolha uma opção (1-7):");
            escolhaMenu = entrada.nextInt();
            switch (escolhaMenu) {
                case 1:
                    cadastrarProduto();
                    break;
                case 2:
                    realizarVenda();
                    break;
                case 3:
                    exibirFaturamentoTotal();
                    break;
                case 4:
                    exibirProdutoMaisVendido();
                    break;
                case 5:
                    exibirProdutoComMaiorFaturamento();
                    break;
                case 6:
                    relatorioEstoqueBaixo();
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        } while (escolhaMenu != 7);
    }

    public void cadastrarProduto() {
        System.out.println("Digite o nome do produto que quer cadastrar: ");
        produtos[tamanhoProdutos] = entrada.next();
        do {
            System.out.println("Digite a qauntidade do produto que tem no estoque: ");
            quantProdutosEstoque[tamanhoProdutos] = entrada.nextInt();
        } while (quantProdutosEstoque[tamanhoProdutos] < 0);
        do {
            System.out.println("Digite o preco do produto: ");
            precoProduto[tamanhoProdutos] = entrada.nextDouble();
        } while (precoProduto[tamanhoProdutos] < 0);
        tamanhoProdutos++;
    }

    public void realizarVenda() {
        int posicaoProdutoVendido = 0;
        System.out.println("Digite o nome do produto que quer vender: ");
        produtosVendidos[tamanhoVendas] = entrada.next();
        System.out.println("Digite a quantidade vendida: ");
        quantProdutosVendidos[tamanhoVendas] = entrada.nextInt();
        for (int i = 0; i < tamanhoProdutos; i++) {
            if (produtos[i].equalsIgnoreCase(produtosVendidos[tamanhoVendas])) {
                posicaoProdutoVendido = i;
            }
        }
        if (quantProdutosVendidos[tamanhoVendas] <= quantProdutosEstoque[posicaoProdutoVendido]) {
            System.out.println("Venda registrada com sucesso");
            quantProdutosEstoque[posicaoProdutoVendido] = quantProdutosEstoque[posicaoProdutoVendido] - quantProdutosVendidos[tamanhoVendas];
            faturamentoPorProduto[posicaoProdutoVendido] = faturamentoPorProduto[posicaoProdutoVendido] + (precoProduto[posicaoProdutoVendido] * quantProdutosVendidos[tamanhoVendas]);
            tamanhoVendas++;
        } else {
            System.out.println("Erro: não há produtos suficientes em estoque");
        }
    }

    public void exibirFaturamentoTotal() {
        double faturamentoTotal = 0;
        for (int i = 0; i < tamanhoProdutos; i++) {
            faturamentoTotal = faturamentoTotal + faturamentoPorProduto[i];
            System.out.println("Faturamento do produto " + produtos[i] + ": " + faturamentoPorProduto[i]);
        }
        System.out.println("Faturamento total: " + faturamentoTotal);
    }

    public void exibirProdutoMaisVendido() {
        int posicaoProdutoMaisVendido = 0;
        int quantProdutoMaisVendido = 0;
        for (int i = 0; i < tamanhoProdutos; i++) {
            if (quantProdutosVendidos[i] > quantProdutoMaisVendido) {
                quantProdutoMaisVendido = quantProdutosVendidos[i];
                posicaoProdutoMaisVendido = i;
            }
        }
        System.out.println("O produto mais vendido é: " + produtos[posicaoProdutoMaisVendido]);
    }

    public void exibirProdutoComMaiorFaturamento() {
        int posicaoProdutoComMaiorFaturamento = 0;
        double produtoComMaiorFaturamento = 0;
        for (int i = 0; i < tamanhoVendas; i++) {
            if (faturamentoPorProduto[i] > produtoComMaiorFaturamento) {
                produtoComMaiorFaturamento = faturamentoPorProduto[i];
                posicaoProdutoComMaiorFaturamento = i;
            }
        }
        System.out.println("O produto com maior faturamento é: " + produtos[posicaoProdutoComMaiorFaturamento]);

    }

    public void relatorioEstoqueBaixo() {
        for (int i = 0; i < tamanhoProdutos; i++) {
            if (quantProdutosEstoque[i] <= 10) {
                System.out.println("Aviso, estoque baixo: o produto " + produtos[i] + " só tem mais " + quantProdutosEstoque[i] + " unidades em estoque");
            }
        }
    }
}

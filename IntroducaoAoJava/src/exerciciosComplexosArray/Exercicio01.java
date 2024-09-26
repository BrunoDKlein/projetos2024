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
public class Exercicio01 {

    Scanner entrada = new Scanner(System.in);
    int escolhaMenu = 0;
    String alunos[] = new String[10];
    double disciplinaA[] = new double[10];
    double disciplinaB[] = new double[10];
    double disciplinaC[] = new double[10];
    double disciplinaD[] = new double[10];
    double medias[] = new double[10];
    int tamanhoAlunos = 0;
    int tamanhoNotas = 0;
    double maiorMedia = 0;
    String alunoMaiorMedia;
    String disciplinaEscolhida;
    double maiorNotaDeterminadaDisciplina = 0;
    String alunoMaiorNotaDeterminadaDisciplina = "";

    public static void main(String[] args) {
        Exercicio01 exercicio01 = new Exercicio01();
        exercicio01.menuPrincipal();
    }

    public void menuPrincipal() {
        do {
            System.out.println("=== Menu de Opções ===\n"
                    + "0. Mostrar Relatório de Alunos"
                    + "1. Cadastrar Alunos\n"
                    + "2. Cadastrar Notas\n"
                    + "3. Calcular Médias\n"
                    + "4. Exibir Médias\n"
                    + "5. Exibir Aluno com Maior Média\n"
                    + "6. Exibir Aluno com Maior Nota em determinada Disciplina\n"
                    + "7. Exibir lista de alunos com o resultado final (aprovado ou reprovado)\n"
                    + "8. Sair do Programa\n"
                    + "Escolha uma opção (1-8):");
            escolhaMenu = entrada.nextInt();
            switch (escolhaMenu) {
                case 0:
                    mostrarRelatório();
                    break;
                case 1:
                    cadastrarAlunos();
                    break;
                case 2:
                    cadastrarNotas();
                    break;
                case 3:
                    calcularMedia();
                    break;
                case 4:
                    exibirMedias();
                    break;
                case 5:
                    exibirAlunoMaiorMédia();
                    break;
                case 6:
                    exibirAlunoMaiorNotaEmDeterminadaDisciplina();
                    break;
                case 7:
                    exibirListaAlunosResultadoFinal();
                    break;
                case 8:
                    System.out.println("Você saiu do programa");
                    break;
            }
        } while (escolhaMenu != 8);
    }

    public void mostrarRelatório() {
        for (int i = 0; i < tamanhoAlunos; i++) {
            System.out.println(alunos[i] + ": " + disciplinaA[i] + "; " + disciplinaB[i] + "; " + disciplinaC[i] + "; " + disciplinaD);
        }

    }

    public void cadastrarAlunos() {
        System.out.println("Digite o nome do aluno que quer cadastrar: ");
        alunos[tamanhoAlunos] = entrada.next();
        tamanhoAlunos++;
    }

    public void cadastrarNotas() {

        do {
            System.out.println("Digite a nota da disciplina A: ");
            disciplinaA[tamanhoNotas] = entrada.nextDouble();
        } while (disciplinaA[tamanhoNotas] > 10 || disciplinaA[tamanhoNotas] < 0);

        do {
            System.out.println("Digite a nota da disciplina B: ");
            disciplinaB[tamanhoNotas] = entrada.nextDouble();
        } while (disciplinaB[tamanhoNotas] > 10 || disciplinaB[tamanhoNotas] < 0);

        do {
            System.out.println("Digite a nota da disciplina C: ");
            disciplinaC[tamanhoNotas] = entrada.nextDouble();
        } while (disciplinaC[tamanhoNotas] > 10 || disciplinaC[tamanhoNotas] < 0);

        do {
            System.out.println("Digite a nota da disciplina D: ");
            disciplinaD[tamanhoNotas] = entrada.nextDouble();
        } while (disciplinaD[tamanhoNotas] > 10 || disciplinaD[tamanhoNotas] < 0);
        tamanhoNotas++;
    }

    public void calcularMedia() {
        for (int i = 0; i < 10; i++) {
            medias[i] = (disciplinaA[i] + disciplinaB[i] + disciplinaC[i] + disciplinaD[i]) / 4;
        }
    }

    public void exibirMedias() {
        for (int i = 0; i < tamanhoAlunos; i++) {
            System.out.println("Aluno " + alunos[i] + " está com média " + medias[i]);
        }
    }

    public void exibirAlunoMaiorMédia() {
        for (int i = 0; i < 10; i++) {
            if (medias[i] > maiorMedia) {
                maiorMedia = medias[i];
                alunoMaiorMedia = alunos[i];
            }
        }
        System.out.println("Aluno com maior média: " + alunoMaiorMedia + "\nEste aluno tem média de " + maiorMedia);
    }

    public void exibirAlunoMaiorNotaEmDeterminadaDisciplina() {
        System.out.println("Escolha uma disciplina: ");
        disciplinaEscolhida = entrada.next();
        switch (disciplinaEscolhida) {
            case "A":
                for (int i = 0; i < tamanhoAlunos; i++) {
                    if (disciplinaA[i] > maiorNotaDeterminadaDisciplina) {
                        maiorNotaDeterminadaDisciplina = disciplinaA[i];
                        alunoMaiorNotaDeterminadaDisciplina = alunos[i];
                    }
                }
                System.out.println("Aluno com maior nota nessa disciplina: " + alunoMaiorNotaDeterminadaDisciplina + "\nA nota desse aluno é " + maiorNotaDeterminadaDisciplina);
                break;
            case "B":
                for (int i = 0; i < tamanhoAlunos; i++) {
                    if (disciplinaB[i] > maiorNotaDeterminadaDisciplina) {
                        maiorNotaDeterminadaDisciplina = disciplinaB[i];
                        alunoMaiorNotaDeterminadaDisciplina = alunos[i];
                    }
                }
                System.out.println("Aluno com maior nota nessa disciplina: " + alunoMaiorNotaDeterminadaDisciplina + "\nA nota desse aluno é " + maiorNotaDeterminadaDisciplina);
                break;
            case "C":
                for (int i = 0; i < tamanhoAlunos; i++) {
                    if (disciplinaC[i] > maiorNotaDeterminadaDisciplina) {
                        maiorNotaDeterminadaDisciplina = disciplinaC[i];
                        alunoMaiorNotaDeterminadaDisciplina = alunos[i];
                    }
                }
                System.out.println("Aluno com maior nota nessa disciplina: " + alunoMaiorNotaDeterminadaDisciplina + "\nA nota desse aluno é " + maiorNotaDeterminadaDisciplina);
                break;
            case "D":
                for (int i = 0; i < tamanhoAlunos; i++) {
                    if (disciplinaD[i] > maiorNotaDeterminadaDisciplina) {
                        maiorNotaDeterminadaDisciplina = disciplinaD[i];
                        alunoMaiorNotaDeterminadaDisciplina = alunos[i];
                    }
                }
                System.out.println("Aluno com maior nota nessa disciplina: " + alunoMaiorNotaDeterminadaDisciplina + "\nA nota desse aluno é " + maiorNotaDeterminadaDisciplina);
                break;
        }
    }

    public void exibirListaAlunosResultadoFinal() {
        for (int i = 0; i < tamanhoAlunos; i++) {
            if (medias[i] >= 6) {
                System.out.println("O aluno " + alunos[i] + " está aprovado!");
            } else {
                System.out.println("O aluno " + alunos[i] + " está reprovado");
            }
        }
    }
}

package EstudoOO.roteiro7.parte1;

import EstudoOO.roteiro7.parte1.Aluno;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Aluno[] listaAlunos = new Aluno[3];
        Scanner entrada = new Scanner(System.in);

        Aluno aluno1 = new Aluno(111, "José", "Sistemas de Informação", 2019);
        Aluno aluno2 = new Aluno(222, "Maria", "Engenharia Civil", 2020);
        Aluno aluno3 = new Aluno(333, "Carlos", "Química", 2021);

        listaAlunos[0] = aluno1;
        listaAlunos[1] = aluno2;
        listaAlunos[2] = aluno3;

        System.out.println("           Lista de alunos");
        System.out.println("*************************************");
        for (int i = 0;i < 3;i++) {
            System.out.println("Matrícula: " + listaAlunos[i].getMatricula());
            System.out.println("Nome: " + listaAlunos[i].getNome());
            System.out.println("Curso: " + listaAlunos[i].getCurso());
            System.out.println("Ano de ingresso: " + listaAlunos[i].getAnoIngresso());
            System.out.println("********************************");
        }
    }
}

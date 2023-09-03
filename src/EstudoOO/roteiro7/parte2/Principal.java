package EstudoOO.roteiro7.parte2;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Aluno[] listaAlunos = new Aluno[3];
        Scanner entrada = new Scanner(System.in);

        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();
        Aluno aluno3 = new Aluno();

        listaAlunos[0] = aluno1;
        listaAlunos[1] = aluno2;
        listaAlunos[2] = aluno3;

        for (int i = 0;i < 3;i++) {
            int in;
            String in2;

            System.out.print("Matrícula: ");
            in = entrada.nextInt();
            listaAlunos[i].setMatricula(in);

            entrada.nextLine();

            System.out.print("Nome: ");
            in2 = entrada.nextLine();
            listaAlunos[i].setNome(in2);

            System.out.print("Curso: ");
            in2 = entrada.nextLine();
            listaAlunos[i].setCurso(in2);

            System.out.print("Ano de ingresso: ");
            in = entrada.nextInt();
            listaAlunos[i].setAnoIngresso(in);
            System.out.println("********************************");
        }

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

package EstudoOO.roteiro7.parte1;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        ArrayList<Aluno> listaAlunos = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);

        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();
        Aluno aluno3 = new Aluno();

        listaAlunos.add(aluno1);
        listaAlunos.add(aluno2);
        listaAlunos.add(aluno3);

        for (int i = 0;i < listaAlunos.size();i++) {
            int in;
            String in2;

            System.out.print("Matrícula: ");
            in = entrada.nextInt();
            listaAlunos.get(i).setMatricula(in);

            entrada.nextLine();

            System.out.print("Nome: ");
            in2 = entrada.nextLine();
            listaAlunos.get(i).setNome(in2);

            System.out.print("Curso: ");
            in2 = entrada.nextLine();
            listaAlunos.get(1).setCurso(in2);

            System.out.print("Ano de ingresso: ");
            in = entrada.nextInt();
            listaAlunos.get(i).setAnoIngresso(in);
            System.out.println("********************************");
        }

        System.out.println("           Lista de alunos");
        System.out.println("*************************************");
        for (int i = 0;i < listaAlunos.size();i++) {
            System.out.println("Matrícula: " + listaAlunos.get(i).getMatricula());
            System.out.println("Nome: " + listaAlunos.get(i).getNome());
            System.out.println("Curso: " + listaAlunos.get(i).getCurso());
            System.out.println("Ano de ingresso: " + listaAlunos.get(i).getAnoIngresso());
            System.out.println("********************************");
        }
    }
}

package EstudoOO.roteiro7.parte3;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        ArrayList<Aluno> listaAlunos = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);

        while (true) {
            int i = 0;
            int in;
            String in2;

            listaAlunos.add(i, new Aluno());

            System.out.print("Matrícula: ");
            in = entrada.nextInt();
            listaAlunos.get(i).setMatricula(in);

            entrada.nextLine();

            System.out.print("Nome: ");
            in2 = entrada.nextLine();
            listaAlunos.get(i).setNome(in2);

            System.out.print("Curso: ");
            in2 = entrada.nextLine();
            listaAlunos.get(i).setCurso(in2);

            System.out.print("Ano de ingresso: ");
            in = entrada.nextInt();
            listaAlunos.get(i).setAnoIngresso(in);

            entrada.nextLine();
            System.out.print("Adicionar mais alunos? (S/N): ");
            in2 = entrada.nextLine();
            if (in2.equals("N") || in2.equals("n")) { break; }
            i++;

            System.out.println("********************************");
        }

        Aluno.adicionarDisciplina("Carlos", "Matemática", listaAlunos);
        Aluno.adicionarDisciplina("Carlos", "História", listaAlunos);
        Aluno.listarDisciplinas("Carlos", listaAlunos);

        System.out.println("\n\n           Lista de alunos");
        System.out.println("*************************************");
        for (int i = listaAlunos.size() - 1;i >= 0;i--) {
            System.out.println("Matrícula: " + listaAlunos.get(i).getMatricula());
            System.out.println("Nome: " + listaAlunos.get(i).getNome());
            System.out.println("Curso: " + listaAlunos.get(i).getCurso());
            System.out.println("Ano de ingresso: " + listaAlunos.get(i).getAnoIngresso());
            System.out.println("Quantidade de disciplinas: " + listaAlunos.get(i).getQtdDisciplina());
            System.out.println("********************************");
        }
    }
}

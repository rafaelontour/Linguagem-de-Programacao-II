package EstudoOO.roteiro7.parte3;

import java.util.ArrayList;

public class Aluno {
    // Atributos
    private int matricula;
    private String nome;
    private String curso;
    private int anoIngresso;
    private int qtdDisciplina;
    private String situacao;
    private ArrayList<String> listaDisciplinas = new ArrayList<>();


    // Construtor
    Aluno() {
//        matricula     = pMatricula;
//        nome          = pNome;
//        curso         = pCurso;
//        anoIngresso   = pAnoIngresso;
//        qtdDisciplina = 0;
//        situacao      = "Não matriculado";
    }

    // Getters
    public int getMatricula() {
        return matricula;
    }
    public String getNome() {
        return nome;
    }
    public String getCurso() {
        return this.curso;
    }
    public int getAnoIngresso() { return this.anoIngresso; }
    public int getQtdDisciplina() {
        return this.qtdDisciplina;
    }


    // Setters
    public void setQtdDisciplina(int qtdDisciplina) {
        this.qtdDisciplina = qtdDisciplina;
        if (this.qtdDisciplina > 0) {
            this.situacao = "Matriculado";
        } else {
            this.situacao = "Não Matriculado";
        }
    }

    public void setMatricula(int matricula) { this.matricula = matricula; }
    public void setAnoIngresso(int anoIngresso) { this.anoIngresso = anoIngresso; }
    public void setCurso(String curso) { this.curso = curso; }
    public void setNome(String nome) {
        this.nome = nome;
    }


    // Outros métodos
    public static void adicionarDisciplina(String nome, String d, ArrayList<Aluno> lista) {
        for (int c = lista.size() -1 ;c >= 0;c--) {
            if (lista.get(c).getNome().equals(nome)) {
                lista.get(c).listaDisciplinas.add(d);
                lista.get(c).setQtdDisciplina(lista.get(c).listaDisciplinas.size());
            }
        }
    }

    public static void listarDisciplinas(String nome, ArrayList<Aluno> lista) {
        for (int c = lista.size() - 1;c >= 0;c--) {
            if (lista.get(c).getNome().equals(nome) && lista.get(c).listaDisciplinas.size() != 0) {
                System.out.println("\n           Lista de disciplina de " + nome);
                for (int i = lista.get(c).listaDisciplinas.size() - 1;i >= 0;i--) {
                        System.out.println(lista.get(c).listaDisciplinas.get(i));
                }
            } else {
                System.out.println("Sem disciplinas para listar");
            }
        }

    }
}

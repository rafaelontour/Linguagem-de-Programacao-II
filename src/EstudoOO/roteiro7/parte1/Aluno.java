package EstudoOO.roteiro7.parte1;

public class Aluno {
    // Atributos
    private int matricula;
    private String nome;
    private String curso;
    private int anoIngresso;
    private int qtdDisciplina;
    private String situacao;


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

}

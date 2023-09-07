package EstudoOO.roteiro4.parte4;

public class Aluno {
    private int matricula;
    private String nome;
    private String curso;
    private int anoIngresso;
    private int qtdDisciplina;
    private String situacao;

    Aluno(int pMatricula, String pNome, String pCurso, int pAnoIngresso){
        matricula     = pMatricula;
        nome          = pNome;
        curso         = pCurso;
        anoIngresso   = pAnoIngresso;
        qtdDisciplina = 0;
        situacao      = "Não matriculado";
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return this.curso;
    }

    public void setCurso(String curso) { this.curso = curso; }
    public int getAnoIngresso() { return this.anoIngresso; }
    public void setAnoIngresso(int anoIngresso) { this.anoIngresso = anoIngresso; }

    public int getQtdDisciplina() {
        return this.qtdDisciplina;
    }

    public void setQtdDisciplina(int qtdDisciplina) {
        this.qtdDisciplina = qtdDisciplina;
        if (this.qtdDisciplina > 0) {
            this.situacao = "Matriculado";
        } else {
            this.situacao = "Não Matriculado";
        }
    }
}

package EstudoOO.roteiro6.parte2;

public class Ligacao {

    // Atributos

    private String numOrigem;
    private String numDestino;
    private String localOrigem;
    private String localDestino;
    private Tempo horaInicio;
    private Tempo horaFim;


    // Construtor

    public Ligacao(String numOrigem, String numDestino, String localOrigem,
                   String localDestino) {
        this.numOrigem = numOrigem;
        this.numDestino = numDestino;
        this.localOrigem = localOrigem;
        this.localDestino = localDestino;
        this.horaInicio = horaInicio;
        this.horaFim = horaFim;
    }

    // Getters

    public String getNumOrigem() { return this.numOrigem; }
    public String getNumDestino() { return this.numDestino; }
    public String getLocalOrigem() { return this.localOrigem; }
    public String getLocalDestino() { return this.localDestino; }
    public Tempo getHoraInicio() { return this.horaInicio; }
    public Tempo getHoraFim() { return this.horaFim; }


    // Setters

    public void setNumOrigem(String numOrigem) { this.numOrigem = numOrigem; }
    public void setNumDestino(String numDestino) { this.numDestino = numDestino; }
    public void setLocalOrigem(String localOrigem) { this.localOrigem = localOrigem; }
    public void setLocalDestino(String localDestino) { this.localDestino = localDestino; }
    public void setHoraInicio(Tempo horaInicio) {this.horaInicio = horaInicio; }
    public void setHoraFim(Tempo horaFim) { this.horaFim = horaFim; }
}

package EstudoOO.roteiro6.parte3;

public class Ligacao {

    // Atributos

    private String numOrigem;
    private String numDestino;
    private String localOrigem;
    private String localDestino;
    private Tempo hmsINI;
    private Tempo hmsFIM;
    private int valor;


    // Construtor

    public Ligacao(String numOrigem, String numDestino, String localOrigem,
                   String localDestino, Tempo hmsINI, Tempo hmsFIM) {
        this.numOrigem    = numOrigem;
        this.numDestino   = numDestino;
        this.localOrigem  = localOrigem;
        this.localDestino = localDestino;
        this.hmsINI       = hmsINI;
        this.hmsFIM       = hmsFIM;
        this.valor        = 0;
    }

    // Getters

    public String getNumOrigem()    { return this.numOrigem; }
    public String getNumDestino()   { return this.numDestino; }
    public String getLocalOrigem()  { return this.localOrigem; }
    public String getLocalDestino() { return this.localDestino; }
    public Tempo getHmsINI()        { return this.hmsINI; }


    // Setters

    public void setNumOrigem(String numOrigem)       { this.numOrigem = numOrigem; }
    public void setNumDestino(String numDestino)     { this.numDestino = numDestino; }
    public void setLocalOrigem(String localOrigem)   { this.localOrigem = localOrigem; }
    public void setLocalDestino(String localDestino) { this.localDestino = localDestino; }


    // Outros métodos

    public void verificarNum(String num) {
        if (num == numOrigem) {
            System.out.println("O número informado é o número de origem da ligação.");
        } else if (num == numDestino) {
            System.out.println("O número informado é o número de destino");
        } else {
            System.out.println("O número informado não faz parte da ligação.");
        }
    }

    public int calcularValor(Tempo hmsINI, Tempo hmsFIM) {
        int vHora = Math.abs((hmsFIM.getHora() - hmsINI.getHora()) * 60);
        int vMinutos = Math.abs(hmsFIM.getMinuto() - hmsINI.getMinuto());

        if (hmsINI.getSegundo() > hmsFIM.getSegundo()) {
            if ((60 - hmsINI.getSegundo() + hmsFIM.getSegundo()) > 20) { vMinutos++; }
        } else {
            if (Math.abs((hmsINI.getSegundo() - hmsINI.getSegundo())) > 20) { vMinutos++; }
        }
        return vMinutos + vHora;
    }

}

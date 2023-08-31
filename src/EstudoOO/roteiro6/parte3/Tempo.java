package EstudoOO.roteiro6.parte3;

public class Tempo {
    public int hora;
    private int minuto;
    private int segundo;


    // Construtor

    public Tempo(int hora, int minuto, int segundo) {
        this.hora    = hora;
        this.minuto  = minuto;
        this.segundo = segundo;
    }


    // Getters
    public int getHora()    { return this.hora; }
    public int getMinuto()  { return this.minuto; }
    public int getSegundo() { return this.segundo; }

    // Setters

    public void setHora(int hora)       { this.hora = hora; }
    public void setMinuto(int minuto)   { this.minuto = minuto; }
    public void setSegundo(int segundo) { this.segundo = segundo; }

    // Outros métodos

}

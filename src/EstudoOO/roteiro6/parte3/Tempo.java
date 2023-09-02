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
    public static int calcularTempo(Tempo hmsINI, Tempo hmsFIM) {
        int tempoSegundosINI = 0;
        tempoSegundosINI += hmsINI.getHora() * 3600;
        tempoSegundosINI += hmsINI.getMinuto() * 60;
        tempoSegundosINI += hmsINI.getSegundo();

        int tempoSegundosFIM = 0;
        tempoSegundosFIM += hmsFIM.getHora() * 3600;
        tempoSegundosFIM += hmsFIM.getMinuto() * 60;
        tempoSegundosFIM +=  hmsFIM.getSegundo();

        int r = tempoSegundosFIM - tempoSegundosINI;

        return r / 60;
    }
}

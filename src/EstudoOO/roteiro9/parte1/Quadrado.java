package EstudoOO.roteiro9.parte1;

public class Quadrado implements FiguraGeometrica {

    // Atributos
    private double lado;

    // Construtor
    public Quadrado(int lado) {
        this.lado = lado;
    }

    // Getters
    public double getLado() { return this.lado; }

    // Setters
    public void setLado(int lado) { this.lado = lado; }

    // Médtodos da Interface
    @Override
    public String getNomeFigura() { return "Quadrado"; }
    @Override
    public double getArea() { return this.lado * this.lado; }
    @Override
    public double getPerimetro() { return this.lado * 4; }
}

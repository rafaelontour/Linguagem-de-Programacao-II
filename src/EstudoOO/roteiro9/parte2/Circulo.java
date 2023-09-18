package EstudoOO.roteiro9.parte2;

public class Circulo implements FiguraGeometrica {

    // Atributos
    private int raio;

    // Construtor
    public Circulo(int raio) {
        this.raio = raio;
    }

    // Getters
    public int getRaio() { return this.raio; }

    // Setters
    public void setRaio(int raio) { this.raio = raio; }

    // Métodos da Interface
    @Override
    public String getNomeFigura() { return "Círculo"; }
    @Override
    public double getArea() { return 3.14 * this.raio * this.raio; }
    @Override
    public double getPerimetro() { return 2 * 3.14 * this.raio; }
}

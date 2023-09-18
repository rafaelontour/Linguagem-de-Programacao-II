package EstudoOO.roteiro9.parte1;

public class Retangulo implements FiguraGeometrica {

    // Atributos
    private double altura;
    private double largura;

    // Construtor
    public Retangulo(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
    }

    // Getters
    public double getAltura() { return this.altura; }
    public double getLargura() { return this.largura; }

    // Setters
    public void setAltura(double altura) { this.altura = altura; }
    public void setLargura(double largura) { this.largura = largura; }

    // Métodos da Interface
    @Override
    public String getNomeFigura() { return "Retângulo"; }
    @Override
    public double getArea() { return this.largura * this.altura; }
    @Override
    public double getPerimetro() {
        return this.largura * 2 + this.largura * 2;
    }
}

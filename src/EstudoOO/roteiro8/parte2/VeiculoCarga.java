package EstudoOO.roteiro8.parte2;

public class VeiculoCarga extends Veiculo {
    private int pesoMax;

    // Construtor
    public VeiculoCarga(String placa, int anoFabricacao, int pesoMax) {
        super(placa, anoFabricacao);
        this.pesoMax = pesoMax;
    }

    // Getter
    public int getPesoMax() { return this.pesoMax; }

    // Setters
    public void setPesoMax(int pesoMax) { this.pesoMax = pesoMax; }

    // Outros métodos
    @Override
    public double calcPedagio() {
        super.taxaPedagio = 2.0;
        return super.taxaPedagio * this.pesoMax;
    }
}
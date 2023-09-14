package EstudoOO.roteiro8.parte3;

public class VeiculoPasseio extends Veiculo {
    private int qtdeMaxPassageiros;

    // Construtor
    public VeiculoPasseio(String placa, int anoFabricacao, int qtdeMaxPassageiros) {
        super(placa, anoFabricacao);
        this.qtdeMaxPassageiros = qtdeMaxPassageiros;
    }

    // Getter
    public int getQtdeMaxPassageiros() { return this.qtdeMaxPassageiros; }

    // Setter
    public void setQtdeMaxPassageiros(int qtdeMaxPassageiros) { this.qtdeMaxPassageiros = qtdeMaxPassageiros; }

    // Outros métodos
    @Override
    public double calcPedagio() {
        super.taxaPedagio = 5.0;
        return super.taxaPedagio * this.taxaPedagio;
    }

    @Override
    public String tipoVeiculo() {
        return "Veículo de Passeio";
    }
}
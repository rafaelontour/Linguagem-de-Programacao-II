package EstudoOO.roteiro8.parte1;

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
}
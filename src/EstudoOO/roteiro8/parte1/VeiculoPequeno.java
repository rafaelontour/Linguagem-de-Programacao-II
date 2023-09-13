package EstudoOO.roteiro8.parte1;

public class VeiculoPequeno extends Veiculo {
    private String modelo;

    // Construtor
    public VeiculoPequeno(String placa, int anoFabricacao, String modelo) {
        super(placa, anoFabricacao);
        this.modelo = modelo;
    }

    // Getter
    public String getModelo() { return this.modelo; }

    // Setter
    public void setModelo(String modelo) { this.modelo = modelo; }
}

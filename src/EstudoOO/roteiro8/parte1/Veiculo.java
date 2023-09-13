package EstudoOO.roteiro8.parte1;

public class Veiculo {

    //Atributos
    private String placa;
    private int anoFabricacao;


    // Construtor
    public Veiculo(String placa, int anoFabricacao) {
        this.placa = placa;
        this.anoFabricacao = anoFabricacao;
    }


    // Getters
    public String getPlaca() { return this.placa; }
    public int getAnoFabricacao() { return this.anoFabricacao; }


    // Setters
    public void setPlaca(String placa) { this.placa = placa; }
    public void setAnoFabricacao(int anoFabricacao) { this.anoFabricacao = anoFabricacao; }

}
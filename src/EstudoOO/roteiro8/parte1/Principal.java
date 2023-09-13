package EstudoOO.roteiro8.parte1;
public class Principal {
    public static void main(String[] args) {
        Veiculo v01 = new Veiculo("11111-BA", 2010);
        VeiculoCarga v02 = new VeiculoCarga("22222-BA", 2011, 5000);
        VeiculoPasseio v03 = new VeiculoPasseio("33333-BA", 2012, 5);
        VeiculoPequeno v04 = new VeiculoPequeno("33333-BA", 2012, "moto");
    }
}

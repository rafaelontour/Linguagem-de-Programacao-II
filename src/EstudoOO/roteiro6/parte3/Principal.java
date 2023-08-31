package EstudoOO.roteiro6.parte3;

public class Principal {
    public static void main(String[] args) {
        Tempo lig01INI = new Tempo(10, 20, 35);
        Tempo lig01FIM = new Tempo(10, 22, 40);
        Ligacao lig01  = new Ligacao("121212", "565656", "A", "B", lig01INI, lig01FIM);

        System.out.println("Valor da ligação: R$" + lig01.calcularValor(lig01INI, lig01FIM));
    }
}

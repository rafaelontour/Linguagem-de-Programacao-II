package EstudoOO.roteiro6.parte3;

public class Principal {
    public static void main(String[] args) {
        Tempo lig01INI = new Tempo(9, 10, 55);
        Tempo lig01FIM = new Tempo(10, 20, 16);
        Ligacao lig01 = new Ligacao("121212", "565656", "A", "B", lig01INI, lig01FIM);

        System.out.println("Valor da ligação: R$" + lig01.calcularValor(lig01INI, lig01FIM));
    }
}

package EstudoOO.roteiro5.parte3;

public class Principal {
    public static void main(String[] args) {
        Loja lojaA = new Loja("Lojão da cidade","Lojão Comércio LTDA", "11223344");
        Loja lojaB  = new Loja("Mercadão do povo","10101010");

        lojaA.setValorFat(10000);
        lojaB.setValorFat(20000);

        Loja.comparar(lojaA, lojaB);
    }

    public void compararNaoEstatico(Loja lojaA, Loja lojaB) {
        if (lojaA.getValorFat() > lojaB.getValorFat()) {
            System.out.println("Mercado de maior faturamento: " + lojaA.getNomeFantasia());
        } else {
            System.out.println("Mercado de maior faturamento: " + lojaB.getNomeFantasia());
        }
    }
}

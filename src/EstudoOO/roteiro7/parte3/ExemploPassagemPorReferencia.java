package EstudoOO.roteiro7.parte3;

public class ExemploPassagemPorReferencia {
    public static void main(String[] args) {
        MinhaClasse objeto = new MinhaClasse();
        objeto.valor = 10;

        System.out.println("Antes do método: " + objeto.valor);
        alterarValor(objeto);
        System.out.println("Depois do método: " + objeto.valor);
    }

    public static void alterarValor(MinhaClasse obj) {
        obj.valor = 20;
    }
}

class MinhaClasse {
    int valor;
}
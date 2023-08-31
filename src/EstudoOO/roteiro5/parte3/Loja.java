package EstudoOO.roteiro5.parte3;

import java.security.spec.RSAOtherPrimeInfo;

public class Loja {
    String nomeFantasia;
    String razaoSocial;
    String cnpj;
    double valorFat;
    double area;
    String nomeProprietario;


    // Construtores

    public Loja(String nomeFantasia, String razaoSocial, String cnpj) {
        this.nomeFantasia = nomeFantasia;
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
    }

    public Loja(String nomeFantasia, String cnpj) {
        this(nomeFantasia, nomeFantasia, cnpj);


    }


    // Getters

    public String getNomeFantasia() { return this.nomeFantasia; }
    public String getRazaoSocial() { return this.razaoSocial; }
    public String getCnpj() { return this.cnpj; }
    public double getValorFat() { return this.valorFat; }
    public double getArea() { return this.area; }


    // Setters

    public void setNomeFantasia(String nomeFantasia) { this.nomeFantasia = nomeFantasia; }
    public void setRazaoSocial(String razaoSocial) { this.razaoSocial = razaoSocial; }
    public void setCnpj(String cnpj) { this.cnpj = cnpj; }
    public void setValorFat(double valorFat) { this.valorFat = valorFat; }
    public void setArea(double area) { this.area = area; }

    // Outros métodos

    public static void comparar(Loja lojaA, Loja lojaB) {
        if (lojaA.getValorFat() > lojaB.getValorFat()) {
            System.out.println("Loja com maior faturamento: " + lojaA.getNomeFantasia());
        } else {
            System.out.println("Loja com maior faturamento: " + lojaB.getNomeFantasia());
        }
    }

    public void comparar_naoEstatica(Loja lojaB) {
        if (this.getValorFat() > lojaB.getValorFat()) {
            System.out.println("Loja com maior faturamento: " + this.nomeFantasia);
        } else {
            System.out.println("Loja com maior faturamento: " + lojaB.nomeFantasia);
        }
    }
}

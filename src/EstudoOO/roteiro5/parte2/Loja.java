package EstudoOO.roteiro5.parte2;

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
        this.razaoSocial  = razaoSocial;
        this.cnpj         = cnpj;
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
}

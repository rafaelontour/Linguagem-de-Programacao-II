package EstudoOO.roteiro8.parte3;

import EstudoOO.roteiro8.parte1.Veiculo;

public class Cliente {

    // Atributos
    private String cpf_cnpj;
    private String nome;
    private String endereco;
    private String email;
    private String telefone;
    private VeiculoPasseio veiculo;
    private VeiculoCarga veiculo2;
    private VeiculoPequeno veiculo3;

    // Construtor
    public Cliente(String cpf_cnpj, String nome, String endereco, String email, String telefone, VeiculoPasseio veiculo) {
        this.cpf_cnpj = cpf_cnpj;
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
        this.telefone = telefone;
        this.veiculo = veiculo;
    }

    public Cliente(String cpf_cnpj, String nome, String endereco, String email, String telefone, VeiculoCarga veiculo) {
        this.cpf_cnpj = cpf_cnpj;
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
        this.telefone = telefone;
        this.veiculo2 = veiculo;
    }

    public Cliente(String cpf_cnpj, String nome, String endereco, String email, String telefone, VeiculoPequeno veiculo) {
        this.cpf_cnpj = cpf_cnpj;
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
        this.telefone = telefone;
        this.veiculo3 = veiculo;
    }

    // Getters
    public String getCpf_cnpj() { return this.cpf_cnpj; }
    public String getNome() { return this.nome; }
    public String getEndereco() { return this.endereco; }
    public String getEmail() { return this.email; }
    public String getTelefone() { return this.telefone; }
    public VeiculoPasseio getVeiculo() { return this.veiculo; }
    public VeiculoCarga getVeiculo2() { return this.veiculo2; }
    public VeiculoPequeno getVeiculo3() { return this.veiculo3; }

    // Setters
    public void setNome(String nome) { this.nome = nome; }
    public void setCpf_cnpj(String cpf_cnpj) { this.cpf_cnpj = cpf_cnpj; }
    public void setEndereco(String endereco) { this.endereco = endereco; }
    public void setEmail(String email) { this.email = email; }
    public void setTelefone(String telefone) { this.telefone = telefone; }
}

package EstudoOO.roteiro8.parte2;

public class Cliente {

    // Atributos
    private String cpf_cnpj;
    private String nome;
    private String endereco;
    private String email;
    private String telefone;

    // Construtor
    public Cliente(String cpf_cnpj, String nome, String endereco, String email, String telefone) {
        this.cpf_cnpj = cpf_cnpj;
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
        this.telefone = telefone;
    }

    // Getters
    public String getCpf_cnpj() { return cpf_cnpj; }
    public String getNome() { return nome; }
    public String getEndereco() { return endereco; }
    public String getEmail() { return email; }
    public String getTelefone() { return telefone; }

    // Setters
    public void setNome(String nome) { this.nome = nome; }
    public void setCpf_cnpj(String cpf_cnpj) { this.cpf_cnpj = cpf_cnpj; }
    public void setEndereco(String endereco) { this.endereco = endereco; }
    public void setEmail(String email) { this.email = email; }
    public void setTelefone(String telefone) { this.telefone = telefone; }
}

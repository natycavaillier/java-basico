package aula5;

public class Pessoa {
    private String nome;
    private String endereco;
    private String telefone;
    private String cpf;

    //#region Encapsulamento de atributos [Getters e Setters]
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getEndereco() {
        return endereco;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getTelefone() {
        return telefone;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getCpf() {
        return cpf;
    }
    //#endregion
}

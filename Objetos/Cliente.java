package Objetos;

public class Cliente extends Pessoa {
    public Cliente(String nome, String cpf, String endereco, String telefone) {
        super(nome, cpf, endereco, telefone);
    }

    public String getNome() {
        return super.getNome();
    }

    public void setNome(String nome) {
        super.setNome(nome);
    }

    public String getEndereco() {
        return super.getEndereco();
    }

    public void setEndereco(String endereco) {
        super.setEndereco(endereco);
    }

    public String getTelefone() {
        return super.getTelefone();
    }

    public void setTelefone(String telefone) {
        super.setTelefone(telefone);
    }

    public void Gravar() {

    }

}

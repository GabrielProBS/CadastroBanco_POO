package Objetos;

public class ContaCorrente extends Conta {
    public ContaCorrente(String agencia, String numero) {
        super(agencia, numero);
    }

    public String getAgencia() {
        return super.getAgencia();
    }

    public void setAgencia(String agencia) {
        super.setAgencia(agencia);
    }

    public String getNumero() {
        return super.getNumero();
    }

    public void setNumero(String numero) {
        super.setNumero(numero);
    }
    
    public ContaCorrente() {}
}
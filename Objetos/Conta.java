package Objetos;

public abstract class Conta {
    private String agencia;
    private String numero;

    public Conta(String agencia, String numero) {
        this.agencia = agencia;
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Conta() {}
}

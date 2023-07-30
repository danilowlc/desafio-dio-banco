import lombok.Getter;
import lombok.Setter;

public abstract class Conta {

    private static int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1000;

    @Getter
    private int agencia;

    @Getter
    private int numero;

    @Getter
    @Setter
    private double saldo;

    @Getter
    @Setter
    private String tipo;

    public Conta() {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
    }

    @Override
    public String toString() {
        return getTipo()+ " -> { " +
                String.format("Agencia= 000%d", getAgencia()) +
                ", Numero= " + getNumero() +
                ", " + String.format("Saldo= %.2f", getSaldo()) +
                " }";
    }

    public void sacar(double valor){
        if (valor > 0){
            this.saldo -= valor;
        }
    }
    public void depositar(double valor){
        if (valor > 0){
            this.saldo += valor;
        }
    }
    public void transferir(Conta conta, double valor){
        if (valor > 0){
            this.sacar(valor);
            conta.depositar(valor);
        }

    }

}

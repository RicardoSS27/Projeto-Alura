public class Conta {
    float saldo;
    int numeroConta;
    int agencia;
    String nomeTitular;

    public void depositar(float valor) {
        this.saldo += valor;
    }

    public boolean sacar(float valor) {
        if (saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            System.out.println("Saldo Insuficiente!");
            return false;
        }
    }

    public boolean transferir(float valor, Conta numeroContaDestino) {
        if (saldo >= valor) {
            this.saldo -= valor;
            numeroContaDestino.depositar(valor);
            return  true;
        } else {
            System.out.println("Saldo Insuficiente!");
            return false;
        }
    }
}

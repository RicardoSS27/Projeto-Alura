public class ContaB {
    private float saldo;
    private int numeroConta;
    private int agencia;
    private ClienteB nomeTitular;
    private static int total;

    public ContaB(int agencia, int numeroConta) {
        ContaB.total++;
        System.out.println("Uma nova conta está sendo criada!");
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        System.out.println("Conta criada com sucesso!");
        System.out.println("O número da conta é " + this.numeroConta);
    }

    public void depositar(float valor) {
        this.saldo += valor;
    }

    public boolean sacar(float valor) {
        if (saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            System.out.println("Saldo Insuficiente para sacar!");
            return false;
        }
    }

    public boolean transferir(float valor, ContaB numeroContaDestino) {
        if (saldo >= valor) {
            this.saldo -= valor;
            numeroContaDestino.depositar(valor);
            return  true;
        } else {
            System.out.println("Saldo Insuficiente para transferir!");
            return false;
        }
    }

    public float getSaldo() {
        return this.saldo;
    }

    public int getnumeroConta(){
        return this.numeroConta;
    }

    public void setnumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public void setNomeTitular(ClienteB nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public ClienteB getNomeTitular() {
        return nomeTitular;
    }

    public static int getTotal (){
        return ContaB.total;
    }
}

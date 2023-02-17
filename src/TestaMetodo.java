public class TestaMetodo {
    public static void main(String[] args) {
        Conta novaConta01 = new Conta();
        novaConta01.saldo = 100;
        novaConta01.depositar(50);
        System.out.println(novaConta01.saldo);
        novaConta01.sacar(20);
        System.out.println(novaConta01.saldo);


        Conta novaConta02 = new Conta();
        novaConta01.transferir(20, novaConta02);
    }
}

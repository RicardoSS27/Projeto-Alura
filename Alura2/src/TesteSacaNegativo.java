public class TesteSacaNegativo {
    public static void main(String[] args) {
        ContaB novaConta01 = new ContaB();
        novaConta01.depositar(100);
        novaConta01.sacar(250);
        System.out.println(novaConta01.getSaldo());
    }
}

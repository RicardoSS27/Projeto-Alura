public class TesteSeteGet {
    public static void main(String[] args) {
        ContaB yohConta = new ContaB(1554, 16442);
        System.out.println(yohConta.getnumeroConta());
        yohConta.setnumeroConta(105063);
        System.out.println(yohConta.getnumeroConta());

        ClienteB yoh = new ClienteB();
        yohConta.setNomeTitular(yoh);
        System.out.println(yohConta.getNomeTitular());
        yoh.setNome("Yohana");
        System.out.println(yoh.getNome());
    }
}

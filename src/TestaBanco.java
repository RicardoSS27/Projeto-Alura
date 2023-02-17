public class TestaBanco {
    public static void main(String[] args) {
        Cliente sibelly = new Cliente();
        sibelly.cpf = "063.522.063-60";
        sibelly.nome = "Sibelly Borges";
        sibelly.profisssao = "estudante";

        System.out.println(sibelly.cpf);

        Conta contaSibelly = new Conta();
        contaSibelly.nomeTitular = sibelly;
        System.out.println(contaSibelly.nomeTitular);
        System.out.println(contaSibelly.nomeTitular.nome);
    }
}

public class Main {
    public static void main(String[] args) {

        Funcionario func = new Funcionario();
        String nome = "Davi";

        if (func instanceof InterfaceDAO) {
            func.salvar(nome);
            System.out.println("Nome cadastrado.");
        } else {
            System.out.println("Este objeto não é uma instância da interface InterfaceDAO.");
        }
    }
}
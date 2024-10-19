public class SistemaDeCadastro {
    public static void main(String[] args) {
        // Criar uma pessoa no sistema
        Pessoa marcos = new Pessoa("123", "Marcos"); // criei um objetos com as informações dos atributos

        // definimos o endereco de marcos
        marcos.setEndereco("Rua das Marias");

        // definir nome e cpf

        // imprimir o marcos sem o nome e cpf

        System.out.println(marcos.getNome() + " - " + marcos.getCpf());
    }
}

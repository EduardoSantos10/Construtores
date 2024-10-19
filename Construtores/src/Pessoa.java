public class Pessoa {
    private String nome;
    private String cpf;
    private String endereco;

    // Método construtor
    public Pessoa(String nome, String cpf) { // o nome deverá ser igual da classe
        this.cpf = cpf; // recebe parametros
        this.nome = nome; // a cada parametros que eu receber, eu posso atribuir aos atributos
        // THIS -> palavra reservada
    }

    public Pessoa(String nome) {
        super();
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String newEndereco) {
        endereco = newEndereco;
    }
}

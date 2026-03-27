public class Pessoa {
    String nome;
    int idade;
    String cpf;

    public Pessoa(String nome, int idade, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    public void fazerAniversario() {
        this.idade++;
        System.out.println(this.nome + " fez aniversário e agora tem " + this.idade + " anos.");
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + this.nome + ", Idade: " + this.idade + ", CPF: " + this.cpf + ".");
    }

    public static void main(String[] args) {
        System.out.println("\n--- Testando Pessoa ---");
        Pessoa minhaPessoa = new Pessoa("Ana Costa", 25, "987.654.321-00");
        minhaPessoa.exibirInformacoes();
        minhaPessoa.fazerAniversario();
        minhaPessoa.exibirInformacoes();
    }
}
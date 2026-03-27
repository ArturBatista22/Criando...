public class Produto {
    String nome;
    String codigo;
    double preco;
    int quantidadeEmEstoque;

    public Produto(String nome, String codigo, double preco, int quantidadeEmEstoque) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public void adicionarEstoque(int quantidade) {
        this.quantidadeEmEstoque += quantidade;
        System.out.println(quantidade + " unidades de " + this.nome + " adicionadas ao estoque. Total: " + this.quantidadeEmEstoque + ".");
    }

    public void removerEstoque(int quantidade) {
        if (this.quantidadeEmEstoque - quantidade < 0) {
            System.out.println("Estoque insuficiente para remover " + quantidade + " unidades de " + this.nome + ".");
        } else {
            this.quantidadeEmEstoque -= quantidade;
            System.out.println(quantidade + " unidades de " + this.nome + " removidas do estoque. Total: " + this.quantidadeEmEstoque + ".");
        }
    }

    public void exibirDetalhes() {
        System.out.println("Nome: " + this.nome + ", Código: " + this.codigo + ", Preço: R$" + this.preco + ", Estoque: " + this.quantidadeEmEstoque + ".");
    }

    public static void main(String[] args) {
        System.out.println("\n--- Testando Produto ---");
        Produto meuProduto = new Produto("Teclado Mecânico", "TEC005", 450.00, 20);
        meuProduto.exibirDetalhes();
        meuProduto.adicionarEstoque(10);
        meuProduto.removerEstoque(5);
        meuProduto.exibirDetalhes();
        meuProduto.removerEstoque(30); // Tentando remover mais do que tem
    }
}
public class Livro {
    String titulo;
    String autor;
    String isbn;
    int anoPublicacao;
    boolean disponivel;

    public Livro(String titulo, String autor, String isbn, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.anoPublicacao = anoPublicacao;
        this.disponivel = true;
    }

    public void emprestar() {
        if (this.disponivel) {
            this.disponivel = false;
            System.out.println("O livro \"" + this.titulo + "\" foi emprestado.");
        } else {
            System.out.println("O livro \"" + this.titulo + "\" não está disponível para empréstimo.");
        }
    }

    public void devolver() {
        if (!this.disponivel) {
            this.disponivel = true;
            System.out.println("O livro \"" + this.titulo + "\" foi devolvido.");
        } else {
            System.out.println("O livro \"" + this.titulo + "\" já está disponível.");
        }
    }

    public void exibirDetalhes() {
        System.out.println("Título: " + this.titulo + ", Autor: " + this.autor + ", ISBN: " + this.isbn + ", Ano: " + this.anoPublicacao + ", Disponível: " + (this.disponivel ? "Sim" : "Não") + ".");
    }

    public static void main(String[] args) {
        System.out.println("\n--- Testando Livro ---");
        Livro meuLivro = new Livro("A Revolução dos Bichos", "George Orwell", "978-85-359-0662-7", 1945);
        meuLivro.exibirDetalhes();
        meuLivro.emprestar();
        meuLivro.exibirDetalhes();
        meuLivro.devolver();
        meuLivro.exibirDetalhes();
    }
}
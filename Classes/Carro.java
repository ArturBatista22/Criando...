public class Carro {
    String marca;
    String modelo;
    int ano;
    double velocidadeAtual;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidadeAtual = 0.0;
    }

    public void acelerar(double incremento) {
        this.velocidadeAtual += incremento;
        System.out.println("O carro " + this.modelo + " acelerou para " + this.velocidadeAtual + " km/h.");
    }

    public void frear(double decremento) {
        if (this.velocidadeAtual - decremento < 0) {
            this.velocidadeAtual = 0;
        } else {
            this.velocidadeAtual -= decremento;
        }
        System.out.println("O carro " + this.modelo + " freou para " + this.velocidadeAtual + " km/h.");
    }

    public void exibirDetalhes() {
        System.out.println("Marca: " + this.marca + ", Modelo: " + this.modelo + ", Ano: " + this.ano + ", Velocidade Atual: " + this.velocidadeAtual + " km/h.");
    }

    public static void main(String[] args) {
        System.out.println("\n--- Testando Carro ---");
        Carro meuCarro = new Carro("Honda", "Civic", 2023);
        meuCarro.exibirDetalhes();
        meuCarro.acelerar(60);
        meuCarro.frear(25);
        meuCarro.exibirDetalhes();
    }
}
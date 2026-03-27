public class ContaBancaria {
    String numeroConta;
    String titular;
    double saldo;

    public ContaBancaria(String numeroConta, String titular, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado. Novo saldo: R$" + this.saldo + ".");
    }

    public void sacar(double valor) {
        if (this.saldo - valor < 0) {
            System.out.println("Saldo insuficiente para saque de R$" + valor + ". Saldo atual: R$" + this.saldo + ".");
        } else {
            this.saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado. Novo saldo: R$" + this.saldo + ".");
        }
    }

    public void exibirExtrato() {
        System.out.println("Conta: " + this.numeroConta + ", Titular: " + this.titular + ", Saldo: R$" + this.saldo + ".");
    }

    public static void main(String[] args) {
        System.out.println("\n--- Testando ContaBancaria ---");
        ContaBancaria minhaConta = new ContaBancaria("78901-2", "Pedro Santos", 500.00);
        minhaConta.exibirExtrato();
        minhaConta.depositar(200.00);
        minhaConta.sacar(100.00);
        minhaConta.exibirExtrato();
        minhaConta.sacar(1000.00); // Tentando sacar mais do que tem
    }
}
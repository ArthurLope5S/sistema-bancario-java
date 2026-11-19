public abstract class ContaBancaria {

    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de depósito inválido.");
            return;
        }

        saldo = saldo + valor;
    }

    public boolean sacar(double valor) {

        if (valor <= 0 || valor > saldo) {
            System.out.println("Saldo insuficiente ou valor inválido.");
            return false;
        }

        saldo = saldo - valor;
        return true;
    }

    public abstract void aplicarTaxaMensal();
}

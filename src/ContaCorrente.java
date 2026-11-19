public class ContaCorrente extends ContaBancaria {

    private double limiteChequeEspecial;

    public ContaCorrente(String titular, double saldo, double limiteChequeEspecial) {
        super(titular, saldo);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(double limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    @Override
    public boolean sacar(double valor) {

        double saldoDisponivel = getSaldo() + limiteChequeEspecial;

        if (valor <= 0 || valor > saldoDisponivel) {
            System.out.println("Saldo insuficiente ou valor inválido.");
            return false;
        }

        setSaldo(getSaldo() - valor);
        return true;
    }

    @Override
    public void aplicarTaxaMensal() {
        setSaldo(getSaldo() - 20.00);
        System.out.println("Taxa de manutenção aplicada: R$ 20,00");
    }
}

        this.taxaRendimento = taxaRendimento;
    }

    public double getTaxaRendimento() {
        return taxaRendimento;
    }

    public void setTaxaRendimento(double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }

    public void aplicarRendimento() {

        double valorRendimento = getSaldo() * taxaRendimento;

        setSaldo(getSaldo() + valorRendimento);
    }

    @Override
    public void aplicarTaxaMensal() {
        System.out.println("Conta Poupança isenta de taxa mensal.");
    }
}

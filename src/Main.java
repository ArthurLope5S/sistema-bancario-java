
        ContaCorrente conta1 = new ContaCorrente("Ana", 1000.0, 500.0);

        ContaPoupanca conta2 = new ContaPoupanca("Carlos", 2000.0, 0.02);

        conta1.depositar(200);
        conta2.depositar(300);

        conta1.sacar(1200);
        conta2.sacar(500);

        conta2.aplicarRendimento();

        System.out.println("=== FECHAMENTO MENSAL ===");

        processarFechamentoMensal(conta1);
        processarFechamentoMensal(conta2);

        System.out.println("\n=== DADOS DAS CONTAS ===");

        System.out.println("Titular: " + conta1.getTitular());
        System.out.println("Saldo: R$ " + conta1.getSaldo());

        System.out.println("------------------------");

        System.out.println("Titular: " + conta2.getTitular());
        System.out.println("Saldo: R$ " + conta2.getSaldo());

    }
}

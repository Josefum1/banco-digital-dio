public class ContaInvestimento extends Conta {

    double taxaDeJuros;
    int numeroDeMeses;

    public ContaInvestimento(Cliente cliente, double taxaDeJuros, int numeroDeMeses) {
        super(cliente);
        this.taxaDeJuros = taxaDeJuros;
        this.numeroDeMeses = numeroDeMeses;
    }

    public double getTaxaDeJuros() {
        return taxaDeJuros;
    }

    public int getNumeroDeMeses() {
        return numeroDeMeses;
    }


    @Override
    public double render(double valor) {
        for (int x = 0; x < numeroDeMeses; x++) {
            saldo += (valor * taxaDeJuros);
            valor = saldo;
        }
        return saldo;

    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Investimento ===");
        super.imprimirInfosComuns();
        System.out.printf("Taxa de Juros: %.2f%n", this.taxaDeJuros);
        System.out.printf("Numero de meses: %d%n", this.numeroDeMeses);
    }
}


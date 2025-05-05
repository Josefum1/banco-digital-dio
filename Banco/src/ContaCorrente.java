public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public double render(double valor) {
        return valor;
    }

    @Override
    public void imprimirExtrato() {
        saldo -= 0.50;
        System.out.println("=== Extrato Conta Corrente ===");
        System.out.println("Cobrada taxa de extrato de 50 centavos.");
        super.imprimirInfosComuns();
    }

}
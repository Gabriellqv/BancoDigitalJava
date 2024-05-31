public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente, String senha, double saldoInicial) {
        super(cliente, senha, saldoInicial);
    }

    public void imprimirExtrato() {
        System.out.println("---Extrato Conta Poupanca---");
        super.imprimirInfosComuns();
    }
}


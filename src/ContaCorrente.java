public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente, String senha, double saldoInicial) {
        super(cliente, senha, saldoInicial);
    }

    public void imprimirExtrato() {
        System.out.println("---Extrato Conta Corrente---");
        super.imprimirInfosComuns();
    }
}
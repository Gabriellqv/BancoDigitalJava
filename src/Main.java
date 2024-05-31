import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Cliente cliente = new Cliente();
        cliente.setNome("Gabriel");

        Conta cc = new ContaCorrente(cliente, "senha123", 1000.00);
        Conta poupanca = new ContaPoupanca(cliente, "senha456", 500.00);

        System.out.println("Bem vindo, " + cliente.getNome() + "!");

        int opcao;
        do {
            System.out.println("1- Extrato CC");
            System.out.println("2- Extrato Poupança");
            System.out.println("3- Sacar CC");
            System.out.println("4- Sacar Poupança");
            System.out.println("5- Depositar CC");
            System.out.println("6- Depositar Poupança");
            System.out.println("7- Transferir de CC para Poupança");
            System.out.println("8- Transferir de Poupança para CC");
            System.out.println("0- Sair");
            System.out.println("Escolha uma opção:");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    cc.imprimirExtrato();
                    break;
                case 2:
                    poupanca.imprimirExtrato();
                    break;
                case 3:
                    System.out.println("Digite o valor para sacar da conta corrente:");
                    double valorSaqueCC = scanner.nextDouble();
                    cc.sacar(valorSaqueCC);
                    break;
                case 4:
                    System.out.println("Digite o valor para sacar da conta poupança:");
                    double valorSaquePoupanca = scanner.nextDouble();
                    poupanca.sacar(valorSaquePoupanca);
                    break;
                case 5:
                    System.out.println("Digite o valor para depositar na conta corrente:");
                    double valorDepositoCC = scanner.nextDouble();
                    cc.depositar(valorDepositoCC);
                    break;
                case 6:
                    System.out.println("Digite o valor para depositar na conta poupança:");
                    double valorDepositoPoupanca = scanner.nextDouble();
                    poupanca.depositar(valorDepositoPoupanca);
                    break;
                case 7:
                    System.out.println("Digite o valor para transferir da conta corrente para poupança:");
                    double valorTransferenciaCCtoPoupanca = scanner.nextDouble();
                    cc.transferir(valorTransferenciaCCtoPoupanca, poupanca);
                    break;
                case 8:
                    System.out.println("Digite o valor para transferir da conta poupança para corrente:");
                    double valorTransferenciaPoupancaToCC = scanner.nextDouble();
                    poupanca.transferir(valorTransferenciaPoupancaToCC, cc);
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                    break;
            }
        } while (opcao != 0);

        scanner.close();
    }
}

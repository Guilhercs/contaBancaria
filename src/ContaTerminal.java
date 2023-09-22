import java.util.Scanner;
//import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem-vindo ao formulário de criação de conta bancária!");
        System.out.print("Digite o nome do titular da conta: ");
        String nomeTitular = scanner.nextLine();

        System.out.print("Digite o número da agência (4 dígitos): ");
        String inputAgencia = scanner.next();

        int agencia;
        if (inputAgencia.length() <= 4) {
            agencia = Integer.parseInt(inputAgencia);
        } else {
            System.out.println("Número de conta inválido. Digite (4) dígitos. Tente novamente.");
            return;
        }

        System.out.print("Digite o número da conta (6 dígitos): ");
        String inputNumeroConta = scanner.next();

        int numeroConta;
        if (inputNumeroConta.length() <= 6) {
            numeroConta = Integer.parseInt(inputNumeroConta);
        } else {
            System.out.println("Número de conta inválido. Digite (6) dígitos. Tente novamente.");
            return;
        }
        System.out.print("Digite o saldo inicial da conta: ");
        double saldoInicial = scanner.nextDouble();

        ContaBancaria conta = new ContaBancaria(nomeTitular, numeroConta, saldoInicial, agencia);

        System.out.println("\nConta bancária criada com sucesso!");
        System.out.println("Dados da conta:");
        System.out.println(conta);
    }
}

class ContaBancaria {
    private String nomeTitular;
    private int numeroConta;
    private int agencia;
    private double saldo;

    public ContaBancaria(String nomeTitular, int numeroConta, double saldo, int agencia) {
        this.nomeTitular = nomeTitular;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.agencia = agencia;
    }

    @Override
    public String toString() {
        return "Olá " + nomeTitular + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia
                + ", conta " + numeroConta + ", e seu saldo de R$" + saldo + " já está disponível para saque";
    }
}

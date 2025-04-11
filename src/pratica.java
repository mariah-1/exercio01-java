import java.util.Scanner;
import java.util.Random;

public class pratica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome = "jaqueline";
        String tipoConta = "corrente";
        double saldoInicial = 2500.00;

        System.out.println("*******************************\n\n");
        System.out.println("Nome = " + nome);
        System.out.println("Tipo da conta = " + tipoConta);
        System.out.println("Saldo inicial = " + saldoInicial);
        System.out.println("*******************************\n\n");

        int resultado = 0;

        while (resultado != 4) {
            System.out.println("Operações");
            System.out.println("1- Consultar saldos\n2- Deposito\n3- Transferir valor\n4- Sair");
            System.out.println("Digite uma opção:\n");
            resultado = scanner.nextInt();

            switch (resultado) {
                case 1:
                    System.out.println("Saldo: $" + saldoInicial + "\n");
                    break;
                case 2:
                    System.out.println("qual o valor do depósito:");
                    double valorRecebido = scanner.nextDouble();
                    saldoInicial = saldoInicial + valorRecebido;
                    System.out.println("Valor depositado \u2705");
                    System.out.println("Saldo atual: $" + saldoInicial + "\n");
                    break;
                case 3:
                    System.out.println("qual valor da trasferência:");
                    double valorTrasferido = scanner.nextDouble();
                    if (valorTrasferido > saldoInicial) {
                        System.out.println("saldo insuficiente\n");
                        break;
                    } else {
                        saldoInicial = saldoInicial - valorTrasferido;
                        System.out.println("Valor transferido \u2705");
                        System.out.println("Saldo atual: $" + saldoInicial + "\n");
                        break;
                    }
                case 4:
                    System.out.println("Finalizado");
                    break;

                default:
                    System.out.println("Entrada invalida!\n");
            }
        }
    }
}

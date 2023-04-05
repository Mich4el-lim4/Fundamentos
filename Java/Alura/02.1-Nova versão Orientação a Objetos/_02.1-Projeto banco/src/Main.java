import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome = "Michael";
        String tipDaConta = "Conta corrente";
        double saldo = 2500;
        int option = 0;

        System.out.println("********************************");
        System.out.println("Dados iniciais do cliente:");
        System.out.println();
        System.out.println(String.format("Nome: %s", nome));
        System.out.println(String.format("Tipo da conta: %s", tipDaConta));
        System.out.println(String.format("Saldo: R$%.2f", saldo));
        System.out.println("********************************");

        while (option != 4){
            String mensagem =
                    """
                    1- Consultar saldos
                    2- Receber valor
                    3- Transferir valor
                    4- Sair
                    """;
            System.out.println(mensagem);
            System.out.print("Enter the desired option: ");
            option = sc.nextInt();

            if (option == 1){
                System.out.println();
                System.out.println("current balance: " + saldo);
                System.out.println();
            } else if (option == 2){
                System.out.println();
                System.out.print("Digite o valor: ");
                double receber = sc.nextDouble();
                saldo += receber;
                System.out.println("current balance: " + saldo);
                System.out.println();
            } else if (option == 3){
                System.out.println();
                System.out.print("Amount to transfer: ");
                double transferir = sc.nextDouble();

                if (transferir > saldo){
                    System.out.println();
                    System.out.println("Não há saldo para realizar a transferência");
                    System.out.println();
                } else {
                    saldo -= transferir;
                    System.out.println("current balance: " + saldo);
                    System.out.println();
                }

            } else if (option != 4){
                System.out.println("Opção invalida");
            }
        }
    }
}
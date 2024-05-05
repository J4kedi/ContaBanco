import java.util.Scanner;

public class ContaTerminal {
    private Scanner input = new Scanner(System.in);
    private String nomeCliente;
    private int numeroAgencia;
    private int numeroConta;
    private float saldo;

    public void exibirPainel() {
        System.out.println();
        
        System.out.println("Por favor, digite seu nome: ");
        nomeCliente = input.nextLine();

        System.out.println("Por favor, digite o número da sua agência: ");
        numeroAgencia = input.nextInt();
        System.out.println("Por favor, digite o número da sua conta: ");
        numeroConta = input.nextInt();
        System.out.println("Por favor, digite o saldo da sua conta: ");
        saldo = input.nextFloat();

        System.out.printf("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}

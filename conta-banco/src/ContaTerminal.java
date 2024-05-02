import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar a classe scanner
        //Exibir as mensagens para o nosso usuario
        int numero = 0;
        String agencia;
        String nomeCliente;
        Double saldo;

        Scanner scanner = new Scanner(System.in);
        //Obter pela classe scanner os valores de nome, numero da conta e saldo
        System.out.println("Por favor, digite o numero da conta: ");
        numero = scanner.nextInt();
        System.out.println("Por favor, digite o numero da agencia: ");
        agencia = scanner.next();
        System.out.println("Por favor, digite o nome do cliente: ");
        nomeCliente = scanner.next();
        System.out.println("Por favor, digite o saldo da conta: ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Por favor, digite um valor válido para o saldo: ");
            scanner.next(); // Limpar o buffer de entrada
        }
        saldo = scanner.nextDouble();

        scanner.close();
        //Exibir os valores na tela
        System.out.println("ola " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta" + numero + " e seu saldo " + saldo + " já esta disponível para saque.");
    }
}

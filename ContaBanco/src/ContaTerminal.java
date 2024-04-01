import java.util.Locale;
import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       
        Scanner terminal = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Ola, seja bem vindo ao DigiBank!!!");
        System.out.println("Para criar a sua conta vamos precisar de algumas infomações.");

        System.out.println("Por favor, digite seu primeiro nome:");
        String nomeCliente = terminal.next();

        System.out.println("Por favor, digite seu sobrenome:");
        String sobrenomeCliente = terminal.next();

        System.out.println("Por favor, digite o número da conta:");
        int numeroConta = terminal.nextInt();

        System.out.println("OK, agora digite o número da Agência:");
        String agencia = terminal.next();
        
        long saldo = 0;

        System.out.println("Olá " + nomeCliente + " Danie"+ sobrenomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +", conta "+ numeroConta +" e seu saldo "+ saldo +" já está disponível para saque");

    }
}

import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("Olá seja bem vindo(a) ao seu banco");
        System.out.println("################################");
        System.out.println("Informe o  número da agência: ");
        int numero = s.nextInt();
        s.nextLine();
        System.out.println("Informe o código da sua agência: ");
        String agencia = s.nextLine();

        System.out.println("Informe o seu nome: ");
        String nome = s.nextLine();

        System.out.println("Informe o saldo da conta: ");
        double saldo = s.nextDouble();

        System.out.println("Olá "+nome+" ,obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo de R$:140"+saldo+" já está disponível para saque.");
    }
}

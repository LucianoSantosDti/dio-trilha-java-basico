import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        double saldo = 0; 
        boolean repita = true;
        
        while (repita) { 
        System.out.println("    BANCO DA GENTE, BEM VINDO(A)");
        System.out.println("#---------------------------------#");
        System.out.println("#      ESCOLHA A SUA OPERAÇÃO     #");
        System.out.println("#---------------------------------#");
          System.out.println("|  1----DEPOSITAR                 |");
          System.out.println("|  2----SACAR                     |");
          System.out.println("|  3----CONSULTAR SALDO           |");
          System.out.println("|  4----ENCERRAR                  |");
          System.out.println("#---------------------------------#");
       int opcao = scanner.nextInt();
        switch (opcao) {
            case 1:
        System.out.println("Informe o valor do deposito: ");
        double deposito= scanner.nextDouble();
        saldo = deposito+saldo;
        break;
            case 2:
                System.out.println("Informe o valor do saque: ");
                double saque= scanner.nextDouble();
                    if (saldo>=saque){
                        saldo = saldo-saque;
                    } else{
                        System.out.println("Você não tems saldo suficiente");
                    }
            break;       
            case 3:
                System.out.println("O seu saldo atual é : "+saldo); 
            break;      
            case 4:
                repita = false;
                System.out.println("Volte Sempre");
            break;
            default:
                    System.out.println("Opção inválida. Tente novamente."); 
            break;
        }
            
        }
    }
}
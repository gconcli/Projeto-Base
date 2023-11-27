import java.util.Scanner;

public class ProjetoBase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int saldo = 0;

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("____________________________________________");
        System.out.println("Bem vindo " + nome + " ao HomeBank SENAC!");
        System.out.println("____________________________________________");
        System.out.println("1 - Ver extrato da conta");
        System.out.println("2 - Depósito em conta");
        System.out.println("3 - Saque da conta ");
        System.out.println("0 - Sair");
        System.out.println("____________________________________________");
        System.out.println("Digite uma das opções acima: ");
        int Opcao = scanner.nextInt();

        switch (Opcao) {
            case 1:
                System.out.println("Seu saldo: " + saldo);
                break;
        
            default:
                break;
        }
    }
}
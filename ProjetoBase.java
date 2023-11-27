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
                System.out.println("Seu saldo: R$" + saldo);
                break;

            case 2:
                System.out.println("Quanto você deseja depositar? ");
                int deposito = scanner.nextInt();
                saldo = saldo + deposito;
                System.out.println("Adicionado com sucesso seu depósito no saldo!")
                break;

            case 3:
                System.out.println("Seu saldo: R$" + saldo);
                System.out.println("Quanto deseja sacar? ");
                int saque = scanner.nextInt();
                if (saque > saldo) {
                    System.out.println("Você não pode sacar um saldo maior que o seu!");
                    break;
                }
                else {
                    saldo = saldo - saque;
                    System.out.println("Saque realizado com sucesso!");
<<<<<<< HEAD
                    System.out.println("Seu saldo atual é de: R$" + saldo);
=======
>>>>>>> 1a6e39f3784a720d73a9e73d83f36a918d3f7b8a
                }
            
            case 0:
                System.out.println("Obrigado por escolher nosso banco. Até mais!");
                break;

            default:
                break;
        }
    }
}
import java.util.Scanner;

public class ProjetoBase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("____________________________________________");
        System.out.println("Bem vindo " + nome + " ao HomeBank SENAC!");
        System.out.println("____________________________________________");
    }
}

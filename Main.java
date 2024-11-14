import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual é o seu nome? ");
        String nome = scanner.nextLine();
        System.out.println("Olá, " + nome + "!");

        System.out.print("Quantos anos você tem? ");
        int idade = scanner.nextInt();
        System.out.println("Você tem " + idade + " anos.");

        if (idade >= 18) {
            System.out.println("Você é maior de idade!");
        } else {
            System.out.println("Você é menor de idade!");
        }

        scanner.close();
    }
}
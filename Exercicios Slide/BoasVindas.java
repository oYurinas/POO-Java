import java.util.Scanner;

public class BoasVindas {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Digite seu nome: ");
        String nome = input.nextLine();

        System.out.printf("Bem Vindo, %s", nome);

        input.close();
    }

}
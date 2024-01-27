import java.util.Scanner;

public class Fahrenheit{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Informe o grau em Celsius: ");
        float graus = input.nextFloat();

        System.out.printf("Graus em Fahrenheit: %.2f", ((graus * 1.8)+32));
    
        input.close();
    }

}
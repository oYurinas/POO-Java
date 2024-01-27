import java.util.Scanner;

public class Radianos{
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        float angulo;


        System.out.print("Informe o angulo em graus: ");
        angulo = input.nextFloat();

        System.out.printf("O angulo de %.0fº em radianos é de: %.2f rad", angulo, (angulo * (Math.PI/180)));
        System.out.printf("\nSeno: %f \nCosseno: %f \nTangente: %f \nCossecante: %f \nSecante: %f \nCotangente: %f", Math.sin(angulo), Math.cos(angulo), Math.tan(angulo), 1/Math.cos(angulo), 1/Math.sin(angulo), 1/Math.tan(angulo));

        input.close();
    }
}
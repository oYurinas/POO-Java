import java.util.Scanner;

public class DistanciaPontos {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        Double x1, y1, x2, y2, dist;

        System.out.println("Informe o valor de X1: ");
        x1 = input.nextDouble();
        System.out.println("Informe o valor de Y1: ");
        y1 = input.nextDouble();
        System.out.println("Informe o valor de X2: ");
        x2 = input.nextDouble();
        System.out.println("Informe o valor de Y2: ");
        y2 = input.nextDouble();

        dist = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));

        System.out.printf("A distancia é de: %f", dist);
        input.close();
    }
}

import java.util.Scanner;

public class Minutos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int min, dia = 0, horas = 0;

        System.out.print("Informe os minutos: ");
        min = input.nextInt();

        while (min >= 1440) {
            min-=1440;
            dia++;
        }
        while (min >= 24) {
            min-=24;
            horas++;
        }

        System.out.printf("%d minutos equivale a %d dias, %d horas e %d minutos", min, dia, horas, min);

        input.close();
    }
}

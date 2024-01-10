import java.util.Scanner;

public class UCD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int CDU, UDC;

        System.out.print("Informe primeiro numero: ");
        int n1 = input.nextInt();        
        System.out.print("Informe o segundo numero: ");
        int n2 = input.nextInt();
        System.out.print("Informe o terceiro numero: ");
        int n3 = input.nextInt();
        CDU = (((100*n1) + (10*n2)) + n3);
        UDC = (((100*n3) + (10*n1)) + n2);
        
        System.out.printf("\nFormato CDU: %d", CDU);
        System.out.printf("\nFormato UDC: %d", UDC);
        
        input.close();
    }
}
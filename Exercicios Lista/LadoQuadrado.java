import java.util.Scanner;

public class LadoQuadrado {

  public static void main (String[] args){
    
    Scanner input = new Scanner(System.in);
    
    System.out.printf("Informe o lado do quadrado: ");
    float result = input.nextFloat();

    result *= result;

    System.out.printf("Area do quadrado: %.2f", result);
    
    input.close();
  }

}

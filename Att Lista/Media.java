import java.util.Scanner;

public class Media {

  public static void main (String[] args){

    double num1, num2, num3, media;
    Scanner input = new Scanner(System.in);

    System.out.print("Primeiro valor: ");
    num1 = input.nextDouble();
    System.out.print("Segundo valor: ");
    num2 = input.nextDouble();
    System.out.print("Terceiro valor: ");
    num3 = input.nextDouble();

    media = (num1 + num2 + num3) / 3;

    System.out.print("Media: " + media);
    
    input.close();
  }

}
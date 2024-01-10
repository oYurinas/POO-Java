/*Escreva um programa que leia uma data com dia, mês e ano como
números inteiros e retorne a data no formato a seguir:
○ “[dia] de [mês] de [ano]”
○ “9 de agosto de 2021”
○ Utilize a estrutura if...else
● Informe também quantos dias tem o mês da data informada
○ Para simplificar, considere que fevereiro sempre tem 28 dias
○ Utilize a estrutura switch*/

import java.util.Scanner;

public class Data {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        int dia, mes, ano;
        
        System.out.print("Informe o dia: ");
        dia = entrada.nextInt();
        System.out.print("Informe o mes: ");
        mes = entrada.nextInt();
        System.out.print("Informe o ano: ");
        ano = entrada.nextInt();

        System.out.printf(dia + " de ");
        if (mes == 1) {
            System.out.print("Janeiro");
        } else if (mes == 2) {
            System.out.print("Fevereiro");
        } else if (mes == 3) {
            System.out.print("Marco");
        } else if (mes == 4) {
            System.out.print("Abril");
        } else if (mes == 5) {
            System.out.print("Maio");
        } else if (mes == 6) {
            System.out.print("Junho");
        } else if (mes == 7) {
            System.out.print("Julho");
        } else if (mes == 8) {
            System.out.print("Agosto");
        } else if (mes == 9) {
            System.out.print("Setembro");
        } else if (mes == 10) {
            System.out.print("Outubro");
        } else if (mes == 11) {
            System.out.print("Novembro");
        } else {
            System.out.print("Dezembro");
        }
        System.out.println(" de " + ano);

        switch(mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 dias");
                break;
            case 2:
                System.out.println("28 dias");
                break;
            default:
                System.out.println("30 dias");
        }

        entrada.close();
    }
}
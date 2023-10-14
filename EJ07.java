package Capitulo4;
/*Realiza un programa que calcule la media de tres notas.*/
import java.util.Scanner;

public class EJ07 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca las tres notas: ");
        double nota1 = s.nextDouble();
        double nota2 = s.nextDouble();
        double nota3 = s.nextDouble();
        double media = (nota1+nota2+nota3)/3;
        System.out.printf("media = %.2f\n", media);
        s.close();
    }
}

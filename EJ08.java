package Capitulo4;
/*Amplía el programa anterior para que diga la nota del boletín (insuficiente,
suficiente, bien, notable o sobresaliente).*/
import java.util.Scanner;

public class EJ08 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca las tres notas: ");
        double nota1 = s.nextDouble();
        double nota2 = s.nextDouble();
        double nota3 = s.nextDouble();
        double media = (nota1+nota2+nota3)/3;

        if(media>=9){
            System.out.printf("media = %.2f\n", media);
            System.out.println("La nota del boletín es: Sobresaliente");
        }
        if(media>=7 && media<9){
            System.out.printf("media = %.2f\n", media);
            System.out.println("La nota del boletín es: Notable");
        }
        if(media>=6 && media<7){
            System.out.printf("media = %.2f\n", media);
            System.out.println("La nota del boletín es: Bien");
        }
        if(media>=5 && media<6){
            System.out.printf("media = %.2f\n", media);
            System.out.println("La nota del boletín es: Suficiente");
        }
        if(media>=0 && media<5){
            System.out.printf("media = %.2f\n", media);
            System.out.println("La nota del boletín es: Insuficienete");
        }
        s.close();
    }
    
}

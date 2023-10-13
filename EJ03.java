package Capitulo4;
/*Escribe un programa en que dado un número del 1 a 7 escriba el correspondiente
nombre del día de la semana.*/
import java.util.Scanner;

public class EJ03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Escribe el número del día de la semana (1-7): ");
        int dia = s.nextInt();
        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Día no válido");
        }
        s.close();
    }
}

package Capitulo4;
/*Calcula la nota de un trimestre de la asignatura Programación. El programa
pedirá las dos notas que ha sacado el alumno en los dos primeros controles.
Si la media de los dos controles da un número mayor o igual a 5, el alumno
está aprobado y se mostrará la media. En caso de que la media sea un número
menor que 5, el alumno habrá tenido que hacer el examen de recuperación que
se califica como apto o no apto, por tanto se debe preguntar al usuario
¿Cuál ha sido el resultado de la recuperación? (apto/no apto). Si el
resultado de la recuperación es apto, la nota será un 5; en caso
contrario, se mantiene la nota media anterior.*/
import java.util.Scanner;

public class EJ21 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Programa que te dice apto o no apto en una asignatura");
        System.out.print("Por favor, introduce la nota del primer examen: ");
        float nota1 = s.nextFloat();
        System.out.print("Por favor, introduce la nota del segundo examen: ");
        float nota2 = s.nextFloat();
        float media = (nota1 + nota2)/2;

        if(media>=5){
            System.out.println("La nota media es: " + media);
        }else {
            System.out.println("¿Cuál ha sido el resultado de la recuperación:\nApto \nNo apto");
            System.out.print("=>");
            String respuesta = System.console().readLine();
            respuesta = respuesta.toLowerCase();
            if(respuesta.equals("apto")){
                System.out.print("La nota media obtenida es un 5");
            }else{
                System.out.println("La nota media es: " + media);
            }

        }
    }
}

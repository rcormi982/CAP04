package Capitulo4;
/*Escribe un programa que pida por teclado un día de la semana y que diga qué
asignatura toca a primera hora ese día.*/
public class EJ01 {
    public static void main(String[] args) {
        System.out.println("Diga el día de la semana: ");
        String dia = System.console().readLine();
        dia = dia.toLowerCase();//Preguntar como se pone para que coja indistintamente mayúsculas y minúsculas
        
        switch (dia) {
            case "lunes":
                System.out.println("Programación");
                break;
            case "martes":
                System.out.println("Lenguaje de marcas");
                break;
            case "miércoles":
                System.out.println("Sistemas informáticos");
                break;
            case "jueves":
                System.out.println("EIE");
                break;
            case "viernes":
                System.out.println("Programación");
                break;
            case "sábado":
                System.out.println("¡No hay clase!");
                break;
            case "domingo":
                System.out.println("¡No hay clase!");
                break;
            default:
                System.out.println("El día introducido no es correcto");

        }
    }
}

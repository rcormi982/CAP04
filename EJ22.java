package Capitulo4;
/*Realiza un programa que, dado un día de la semana (de lunes a viernes) y
una hora (horas y minutos), calcule cuántos minutos faltan para el fin de
semana. Se considerará que el fin de semana comienza el viernes a las 15:00h.
Se da por hecho que el usuario introducirá un día y hora correctos,
anterior al viernes a las 15:00h. */
public class EJ22 {
    public static void main(String[] args) {
        System.out.println("Programa que muestra cuántos minutos faltan para el fin de semana");
        System.out.print("Por favor introduce el día de la semana (lunes a viernes): ");
        String dia = System.console().readLine();
        dia = dia.toLowerCase();
        System.out.print("Por favor introduce la hora: ");
        int hora = Integer.parseInt(System.console().readLine());
        System.out.print("Por favor introduce los minutos: ");
        int minutos = Integer.parseInt(System.console().readLine());
        int diaNumerico = 0;
        switch (dia) {
            case "lunes":
                 diaNumerico = 1;
                break;
            case "martes":
                diaNumerico = 2;
                break;
            case "miercoles":
                diaNumerico = 3;
                break;
            case "jueves":
                diaNumerico = 4;
                break;
            case "viernes":
                diaNumerico = 5;
                break;
            default:
                System.out.print("El día introducido no es correcto");
                break;
        }
        int minutosTotales = (4*24*60) + (15*60); 
        int minutosActuales = (diaNumerico*24*60) + (15*60) + minutos;

        System.out.print("Los minutos que faltan para el fin de semana son: " + (minutosTotales - minutosActuales)+ " minutos.");
    }
}

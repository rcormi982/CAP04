package Capitulo4;
/*Implementa el juego piedra, papel y tijera. Primero, el usuario 1 introduce
su jugada y luego el usuario 2. Si alguno de los usuarios introduce una opción
incorrecta, el programa deberá mostrar un mensaje de error. */
public class EJ28 {
    public static void main(String[] args) {
        System.out.println("Juego piedra, papel o tijeras.");
        System.out.print("Turno del jugador 1 (piedra, papel o tijeras): ");
        String jugador1=System.console().readLine();
        System.out.print("Turno del jugador 2 (piedra, papel o tijeras): ");
        String jugador2=System.console().readLine();

        switch (jugador1) {
            case "piedra":
                if(jugador2.equals("piedra"))
                    System.out.println("Empate");
                if(jugador2.equals("papel"))
                    System.out.println("Gana el jugador 2");
                if(jugador2.equals("tijeras"))
                    System.out.println("Gana el jugador 1");
                break;
            case "papel":
                if(jugador2.equals("piedra"))
                    System.out.println("Gana el jugador 1");
                if(jugador2.equals("papel"))
                    System.out.println("Empate");
                if(jugador2.equals("tijeras"))
                    System.out.println("Gana el jugador 2");
                break;
            case "tijeras":
                if(jugador2.equals("piedra"))
                    System.out.println("Gana el jugador 2");
                if(jugador2.equals("papel"))
                    System.out.println("Gana el jugador 1");
                if(jugador2.equals("tijeras"))
                    System.out.println("Empate");
                break;
            default:
                System.out.println("Error");
                break;
        }
    }
}

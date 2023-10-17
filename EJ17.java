package Capitulo4;
/*Escribe un programa que diga cuál es la última cifra de un número
entero introducido por teclado.*/
public class EJ17 {
    public static void main(String[] args){
        System.out.println("Programa que te dice la última cifra de un número entero introducido por teclado");
        System.out.print("Por favor, introduzca un número: ");
        int numero = Integer.parseInt(System.console().readLine());
        System.out.println("El último número introducido es: "+ (numero%10));
    }
}

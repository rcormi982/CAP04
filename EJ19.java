package Capitulo4;
/*Realiza un programa que nos diga cuántos dígitos tiene un número
entero que puede ser positivo o negativo. Se permiten números de
hasta 5 dígitos.*/
public class EJ19 {
    public static void main(String[] args) {
        System.out.println("Programa que calcula las cifras introducidas de un número entero");
        System.out.print("Por favor, introduzca un número hasta 5 cifras: ");
        int numero = Integer.parseInt(System.console().readLine());
        int digito = 0;
        if(numero>-100000 && numero <=-10000)
            digito = 5;
        if(numero>=-10000 && numero<=-1000)
            digito = 4;
        if(numero>-1000 && numero<=-100)
            digito = 3;
        if(numero>-100 && numero<=-10)
            digito = 2;
        if(numero>-10 && numero<10)
            digito = 1;
        if(numero>=10 && numero<100)
            digito = 2;
        if(numero>=100 && numero<1000)
            digito = 3;
        if(numero>=1000 && numero<10000)
            digito = 4;
        if(numero>=10000 && numero<100000)
            digito = 5;
        System.out.println("El número introducido tiene: " + digito + " digitos");
    }
}

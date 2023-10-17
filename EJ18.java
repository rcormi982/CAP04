package Capitulo4;
/*Escribe un programa que diga cuál es la primera cifra de un número
entero introducido por teclado. Se permiten números de hasta 5 cifras. */
public class EJ18 {
    public static void main(String[] args) {
        System.out.println("Programa que te dice la primera cifra introducida de un número entero");
        System.out.print("Por favor, introduzca un número entero (hasta 5 cifras): ");
        int numero = Integer.parseInt(System.console().readLine());
        int primeraCifra=0;

        if(numero<10)
            primeraCifra=numero;

        if(numero>=10 && numero<100){
            primeraCifra=numero/10;
        }
        if(numero>=100 && numero<1000){
            primeraCifra=numero/100;
        }
        if(numero>=1000 && numero<10000){
            primeraCifra=numero/1000;
        }
        System.out.println("La primera cifra introducida es: " + primeraCifra);

    }
}

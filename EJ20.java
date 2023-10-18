package Capitulo4;
/*Realiza un programa que diga si un número entero positivo
introducido por teclado es capicúa. Se permiten números de
hasta 5 cifras.*/
public class EJ20 {
    public static void main(String[] args) {
        System.out.println("Programa que te dice si un número es capicúa");
        System.out.print("Por favor, introduzca un número entero positivo hasta 5 cifras: ");
        int n = Integer.parseInt(System.console().readLine());
        boolean capicua = false;

        if(n<10)
            capicua = true;
        if(n>=10 && n<100)
            if(n/10 == n%10)
                capicua = true;
        if(n>=100 && n<1000)
            if(n/100 == n%10)
                capicua = true;
        if(n>=1000 && n<10000)
            if(n/1000 == n%10 && (((n/100)%10) == ((n/10)%10)))
                capicua = true;
        if(n>=10000 && n<100000)
            if(n/10000 == n%10 && (((n/1000)%10) == ((n/10)%10)))
                capicua = true;
        if(capicua)
            System.out.println("El número introducido es capicúa");
        else
            System.out.println("El número introducido no es capicúa");

    }
}

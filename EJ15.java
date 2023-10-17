package Capitulo4;

import java.util.Scanner;

/*Escribe un programa que pinte una pirámide rellena con un carácter
introducido por teclado que podrá ser una letra, un número o un
símbolo como *, +, -, $, &, etc. El programa debe permitir al
usuario mediante un menú elegir si el vértice de la pirámide está
apuntando hacia arriba, hacia abajo, hacia la izquierda o hacia la
derecha.*/
public class EJ15 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Menú que dibuja una pirámide");
        System.out.println("1. Pirámide punta hacia arriba");
        System.out.println("2. Pirámide punta hacia abajo");
        System.out.println("3. Pirámide punta hacia la derecha");
        System.out.println("4. Pirámide punta hacia la izquierda");
        System.out.println("5. Salir");
        System.out.print("Introduzca una opción: ");
        int opcion = s.nextInt();
        switch (opcion) {
            case 1:
                System.out.print("Introduzca el caracter que quieres usar para pintar la pirámide: ");
                String c = System.console().readLine();
                System.out.println("    "+ c);
                System.out.println("  "+ c + " " + c + " " + c);
                System.out.println(c +" " + c +" " + c + " " + c + " " + c);
                break;
            case 2:
                System.out.print("Introduzca el caracter que quieres usar para pintar la pirámide: ");
                String d = System.console().readLine();
                System.out.println(d +" " + d +" " + d + " " + d + " " + d);
                System.out.println("  "+ d + " " + d + " " + d);
                System.out.println("    "+ d);
                break;
            case 3:
                System.out.print("Introduzca el caracter que quieres usar para pintar la pirámide: ");
                String e = System.console().readLine();
                System.out.println(e);
                System.out.println(e + " " + e);
                System.out.println(e + " " + e + " " + e);
                System.out.println(e + " " + e);
                System.out.println(e);
                break;
            case 4:
                System.out.print("Introduzca el caracter que quieres usar para pintar la pirámide: ");
                String f = System.console().readLine();
                System.out.println("    " + f);
                System.out.println("  " + f + " " + f);
                System.out.println(f + " " + f + " " + f);
                System.out.println("  " + f + " " + f);
                System.out.println("    " + f);
                break;
            case 5:
                System.out.println("Saliendo del programa...");
                System.exit(0);
            default:
                System.out.println("Opción no válida.");
                break;
        }



    }
}

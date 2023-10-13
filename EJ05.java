package Capitulo4;

import java.util.Scanner;

/*Realiza un programa que resuelva una ecuación de primer grado (del tipo ax+b =
0).*/
public class EJ05 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduzca los valores de a y b separados por espacio: ");
        double a = s.nextDouble();
        double b = s.nextDouble();
        double x;
        if(a==0){
            System.out.println("La ecuación no tiene solución");
        }else{
            x = -b/a;
            System.out.println("x = " + x);
        }
    }
}

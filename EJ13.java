package Capitulo4;

/*Escribe un programa que ordene tres números enteros introducidos por teclado.*/

import java.util.Scanner;

public class EJ13 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca los tres números: ");
        float num1 = s.nextFloat();
        float num2 = s.nextFloat();
        float num3 = s.nextFloat();
        float aux;

        if(num1>num2){
            aux = num1;
            num1 = num2;
            num2 = aux;
        }
        if(num2>num3){
            aux = num2;
            num2 = num3;
            num3 = aux;
        }
        if(num1>num2){
            aux = num1;
            num1 = num2;
            num2 = aux;
        }
        System.out.println("Los números ordenados son: " + num1 + ", " + num2 + ", " + num3);
        s.close();
    }
}

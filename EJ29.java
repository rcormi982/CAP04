package Capitulo4;

import java.util.Scanner;

/*Realiza un programa que calcule el precio de un desayuno. El programa
preguntará primero qué ha tomado el usuario de comer: palmera, donut o
pitufo. La palmera vale 1.40 € y el donut 1 €. En caso de tomar pitufo, el
programa debe preguntar además si era con aceite o con tortilla; el primero
vale 1’20 € y el segundo 1’60 €. Por último se pregunta por la bebida: zumo o
café a 1’50 y 1’20 respectivamente.*/
public class EJ29 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Calculo del precio del desayuno");
        System.out.print("¿Qué ha tomado de comer (palmera, donut o pitufo)?: ");
        String comida = s.nextLine();
        if (comida.equals("pitufo")){
            System.out.print("¿Con qué se ha tomado el pitufo (aceite o tortilla)?: ");
            String contenido = s.nextLine();
        }
        System.out.print("¿Qué ha tomado de beber (zumo o café)?: ");
        String bebida = s.nextLine();
        double precioComida = 0;
        double precioBebida = 0;
        if (comida.equals("pitufo")){
            Object contenido=0;
            if(contenido.equals("aceite")){
                precioComida = 1.20;
                System.out.printf("Pitufo con aceite: %.2f\n", precioComida);
            }else{
                precioComida = 1.60;
                System.out.printf("Pitufo con aceite: %.2f\n", precioComida);
            }
        }
        if(comida.equals("palmera")){
            precioComida = 1.40;
            System.out.printf("Palmera: %.2f\n", precioComida);
        }else if(comida.equals("donut")){
            precioComida = 1.00;
            System.out.printf("Donut: %.2f\n", precioComida);
        }   
        if(bebida.equals("zumo")){
            precioBebida = 1.50;
            System.out.printf("Zumo: %.2f\n", precioBebida);
        }else{
            precioBebida = 1.20;
            System.out.printf("Café: %.2f\n", precioBebida);
        }
        System.out.printf("Total desayuno: %.2f\n", precioBebida+precioComida);

        s.close();
    }
}



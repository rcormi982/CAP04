package Capitulo4;

import java.util.Scanner;

/*Escribe un programa que genere la nómina (bien desglosada) de un empleado
según las siguientes condiciones:
• Se pregunta el cargo del empleado (1 - Prog. junior, 2 - Prog. senior, 3 - Jefe
de proyecto), los días que ha estado de viaje visitando clientes durante el
mes y su estado civil (1 - Soltero, 2 - Casado).
• El sueldo base según el cargo es de 950, 1200 y 1600 euros según
si se trata de un prog. junior, un prog. senior o un jefe de proyecto
respectivamente.
• Por cada día de viaje visitando clientes se pagan 30 euros extra en
concepto de dietas. Al sueldo neto hay que restarle el IRPF, que será de
un 25% en caso de estar soltero y un 20% en caso de estar casado. */
public class EJ24 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Sueldo de un trabajador");
        System.out.println("Introduce tu cargo:\n1. Prog. junior\n2. Prog. senior\n3. Jefe de proyecto");
        System.out.print("=>");
        int tipoEmpleado = Integer.parseInt(s.nextLine());
        System.out.print("Por favor, introduce el número de días de viaje: ");
        int diasViaje = Integer.parseInt(s.nextLine());
        System.out.println("Por favor, introduce el estado civil:\n1. Soltero\n2. Casado");
        System.out.print("=>");
        int estado= Integer.parseInt(s.nextLine()); 
        double sueldo=0;
        switch (tipoEmpleado) {
            case 1:
                sueldo = 950;
                break;
            case 2:
                sueldo = 1200;
                break;
            case 3:
                sueldo = 1600;
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
        int IRPF=0;
        switch (estado) {
            case 1:
                IRPF = 25;
                break;
            case 2:
                IRPF = 20;
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
        System.out.printf("%-25s %6.2f\n","Sueldo base:", sueldo);
        System.out.printf("%-25s %4.2f\n", "Dietas:", (float)(diasViaje*30));
        System.out.printf("%-25s %6.2f\n", "Sueldo bruto:", (sueldo+diasViaje*30));
        System.out.printf("%-25s %6.2f\n", "Retención IRPF" + "("+IRPF+"):", IRPF*((sueldo+(diasViaje*30))/100));
        System.out.printf("%-25s %6.2f\n", "Sueldo neto:" , ((sueldo+diasViaje*30) -IRPF*((sueldo+(diasViaje*30))/100)));

        s.close();
    }
}

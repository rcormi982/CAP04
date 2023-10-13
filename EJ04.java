package Capitulo4;
/*Vamos a ampliar uno de los ejercicios de la relación anterior para considerar
las horas extras. Escribe un programa que calcule el salario semanal de un
trabajador teniendo en cuenta que las horas ordinarias (40 primeras horas de
trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16 euros
la hora.*/
public class EJ04 {
    public static void main(String[] args) {
        System.out.println("Introduzca el número de horas trabajadas: ");
        float numeroHoras = Float.parseFloat(System.console().readLine());
        double salarioSemanal;
        if(numeroHoras>=0 && numeroHoras<=40){
            salarioSemanal = 12*numeroHoras;
            System.out.printf("Su salario es %.2f ", salarioSemanal);
        }else if(numeroHoras>40){
                salarioSemanal = 12*40 + (numeroHoras - 40)*16;
                System.out.printf("Su salario es %.2f euros", salarioSemanal);
            }else{
                System.out.println("Formato no válido.");
            }    
    }
}

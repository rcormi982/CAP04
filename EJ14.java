package Capitulo4;
/*Realiza un programa que diga si un número introducido por teclado
es par y/o divisible entre 5.*/
public class EJ14 {
    public static void main(String[] args) {
        System.out.println("Introduzca un número: ");
        double num = Double.parseDouble(System.console().readLine());
        if(num%5==0){
            if(num%2==0){
                System.out.println("El " + num + " es par y divisible por 5.");
            }else{
                System.out.println("El " + num + " es divisible por 5, pero no es par.");
            }
        }else{
            if(num%2==0){
                System.out.println("El " + num + " es par pero no es divisible por 5.");
            }else{
                System.out.println("El " + num + " no es par ni tampoco es divisible por 5.");

            }
        }
    }
}

package Capitulo4;
/*Realiza un programa que calcule el tiempo que tardará en caer un objeto desde
una altura h. Aplica la fórmula t = raiz(2hg) siendo g = 9:81m/s2 */
public class EJ06 {
    final static double g = 9.81;//por qué se declara aquí
    public static void main(String[] args) {
        System.out.println("Introduzca la altura en metros desde la que cae el objeto: ");
        double h = Double.parseDouble(System.console().readLine());
        double tiempo = Math.sqrt(2*h/g);
        
        System.out.printf("tiempo = %.2f segundos%n", tiempo);
    }
}

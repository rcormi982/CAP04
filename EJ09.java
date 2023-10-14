package Capitulo4;
/*Realiza un programa que resuelva una ecuación de segundo grado (del tipo
ax2 + bx + c = 0).*/
public class EJ09 {
    public static void main(String[] args) {
        System.out.println("Introduzca el valor de a: ");
        double a = Double.parseDouble(System.console().readLine());
        System.out.println("Introduzca el valor de b: ");
        double b = Double.parseDouble(System.console().readLine());
        System.out.println("Introduzca el valor de c: ");
        double c = Double.parseDouble(System.console().readLine());

        if(a==0 && b==0 && c==0)
            System.out.println("La ecuación tiene infinitas soluciones");
        if(a==0 && b==0 && c!=0)
            System.out.println("La ecuación no tiene solución");

        if(a!=0 && b!=0 && c==0){
            int x1 = 0;
            double x2 = (-b-Math.sqrt(b*b - 4*a*c))/(2.0*a);
            System.out.printf("x1 = %d, x2 = %.2f\n", x1, x2);
        }
        if(a==0 && b!=0 && c!=0)
            System.out.println("x1 = x2 = " +-c/b);

        if(a!=0 && b!=0 && c!=0){
            double d = b*b - 4*a*c;
            double x1 = (-b+Math.sqrt(b*b - 4*a*c))/(2.0*a);
            double x2 = (-b-Math.sqrt(b*b - 4*a*c))/(2.0*a);
                if(d<0){
                    System.out.println("La ecuación no tiene soluciones reales");
                }else{
                    System.out.printf("x1 = %.2f\n", x1);
                    System.out.printf("x2 = %.2f\n", x2);
                }
        }
    }
}

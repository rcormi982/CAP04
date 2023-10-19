package Capitulo4;
/*La tienda online BanderaDeEspaña.es vende banderas personalizadas de la
máxima calidad y nos ha pedido hacer un configurador que calcule el precio
según el alto y el ancho. El precio base de una bandera es de un céntimo de
euro el centímetro cuadrado. Si la queremos con un escudo bordado, el precio
se incrementa en 2.50 € independientemente del tamaño. Los gastos de envío
son 3.25 €. El IVA ya está incluido en todas las tarifas.*/
public class EJ25 {
    public static void main(String[] args) {
        System.out.println("Programa que calcula el precio de la bandera");
        System.out.print("Introduzca la altura de la bandera en cms: ");
        float altura = Float.parseFloat(System.console().readLine());
        System.out.print("Introduzca la anchura de la bandera en cms: ");
        float anchura = Float.parseFloat(System.console().readLine());
        System.out.print("¿Quiere escudo bordado? (s/n): ");
        String bordado = System.console().readLine();
        double precio = 0;
        if(bordado.equals("s")){
            precio = (float)(0.01*altura*anchura);
            System.out.printf("%-25s %.2f euros\n", "Bandera de " + altura*anchura + " cm2", precio);
            System.out.printf("%-25s %10s\n", "Con escudo: ", "2,50 euros");
            System.out.printf("%-25s %10s\n", "Gastos de envío: ", "3,25 euros");
            System.out.printf("%-25s %.2f euros\n", "Total: ", (3.25+2.50+precio));
        }else{
            precio = (0.01*altura*anchura)+3.25;
            System.out.printf("%-25s %.2f euros\n", "Bandera de " + altura*anchura + " cm2", precio);
            System.out.printf("%-25s %10s\n", "Sin escudo: ", "0,00 euros");
            System.out.printf("%-25s %10s\n", "Gastos de envío: ", "3,25 euros");
            System.out.printf("%-25s %.2f euros\n", "Total: ", (3.25+precio));

        }
    }
}

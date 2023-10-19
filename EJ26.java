package Capitulo4;
/*Realiza un programa que calcule el precio de unas entradas de cine en función
del número de personas y del día de la semana. El precio base de una entrada
son 8 euros. El miércoles (día del espectador), el precio base es de 5 euros. Los
jueves son el día de la pareja, por lo que la entrada para dos cuesta 11 euros.
Con la tarjeta CineCampa se obtiene un 10% de descuento. Si un jueves, un
grupo de 6 personas compran entradas, el precio total sería de 33 euros ya
que son 3 parejas; pero si es un grupo de 7, pagarán 3 entradas de pareja más
1 individual que son 41 euros (33 + 8).*/
public class EJ26 {
    public static void main(String[] args) {
        System.out.println("Cálculo precio de entradas");
        System.out.print("Introduce el número de entradas que desea: ");
        int entradas = Integer.parseInt(System.console().readLine());
        System.out.print("Introduce el día de la semana: ");
        String diaSemana = System.console().readLine();
        diaSemana = diaSemana.toLowerCase();
        System.out.print("¿Tiene tarjeta CineCampa?(s/n): ");
        String tarjeta = System.console().readLine();
        double precioEntradasIndividual = 8;
        double precioEntradasPareja = 0;
        int entradasPareja = 0;
        double descuento= 0;
        
        switch (diaSemana) {
            case "miercoles":
                precioEntradasIndividual = 5;
                if(tarjeta.equals("s")){
                    descuento = (precioEntradasIndividual*0.10*entradas);
                }
                    System.out.println("Aquí tiene sus entradas. Gracias por su compra.");
                    System.out.printf("%-35s %d\n", "Entradas individuales: ", entradas);
                    System.out.printf("%-35s %.2f\n", "Precio por entrada individual", precioEntradasIndividual);
                    System.out.printf("%-35s %.2f\n", "Total", precioEntradasIndividual*entradas);
                    System.out.printf("%-35s %.2f\n", "Descuento", descuento);
                    System.out.printf("%-35s %.2f\n", "A pagar", (precioEntradasIndividual*entradas-descuento));
                break;
                case "jueves":
                entradasPareja = entradas / 2;
                int entradasIndividuales = entradas % 2;
                precioEntradasPareja = 11;
                if (tarjeta.equals("s")) {
                    descuento = ((precioEntradasIndividual * entradasIndividuales) + (entradasPareja * precioEntradasPareja)) * 0.10;
                }
                System.out.println("Aquí tiene sus entradas. Gracias por su compra.");
                System.out.printf("%-35s %d\n", "Entradas parejas: ", entradasPareja);
                System.out.printf("%-35s %.2f\n", "Precio por entrada de pareja", precioEntradasPareja);
                System.out.printf("%-35s %d\n", "Entradas individuales: ", entradasIndividuales);
                System.out.printf("%-35s %.2f\n", "Precio por entrada individual", precioEntradasIndividual);
                System.out.printf("%-35s %.2f\n", "Total", (precioEntradasIndividual * entradasIndividuales) + (entradasPareja * precioEntradasPareja));
                System.out.printf("%-35s %.2f\n", "Descuento", descuento);
                System.out.printf("%-35s %.2f\n", "A pagar", ((precioEntradasIndividual * entradasIndividuales) + (entradasPareja * precioEntradasPareja)) - descuento);
                break;

            default:
            if(tarjeta.equals("s")){
                    descuento = precioEntradasIndividual*0.10*entradas;
                }
                    System.out.println("Aquí tiene sus entradas. Gracias por su compra.");
                    System.out.printf("%-35s %d\n", "Entradas individuales: ", entradas);
                    System.out.printf("%-35s %.2f\n", "Precio por entrada individual", precioEntradasIndividual);
                    System.out.printf("%-35s %.2f\n", "Total", precioEntradasIndividual*entradas);
                    System.out.printf("%-35s %.2f\n", "Descuento", descuento);
                    System.out.printf("%-35s %.2f\n", "A pagar", (precioEntradasIndividual*entradas-descuento));
                break;
        }
    }
}

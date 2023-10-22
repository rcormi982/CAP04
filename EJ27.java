package Capitulo4;
/*Una pastelería nos ha pedido realizar un programa que haga presupuestos de
tartas. El programa preguntará primero de qué sabor quiere el usuario la tarta:
manzana, fresa o chocolate. La tarta de manzana vale 18 euros y la de fresa
16. En caso de seleccionar la tarta de chocolate, el programa debe preguntar
además si el chocolate es negro o blanco; la primera opción vale 14 euros y la
segunda 15. Por último se pregunta si se añade nata y si se personaliza con un
nombre; la nata suma 2.50 y la escritura del nombre 2.75. */
public class EJ27 {
    public static void main(String[] args) {
        System.out.println("Presupuesto de tartas");
        System.out.print("Elija un sabor(fresa, manzana o chocolate): ");
        String sabor = System.console().readLine();
        double precio=0;

        if(sabor.equals("manzana")){
            precio = 18;
        }
        if(sabor.equals("fresa")){
            precio = 16;
        }
        if(sabor.equals("chocolate")){
            System.out.print("¿Qué tipo de chocolate quiere?: ");
            String chocolate = System.console().readLine();
            if(chocolate.equals("negro"))
                precio=14;
            if(chocolate.equals("blanco"))
                precio=15;
        }
        System.out.print("Quiere nata (si/no): ");
        String nata = System.console().readLine();
        System.out.print("Quiere ponerle un nombre (si/no): ");
        String nombre  = System.console().readLine();
        System.out.printf("Tarta de %s: %.2f\n", sabor, precio);

        if(nata.equals("si")){
            System.out.printf("Con nata: %s\n", "2,50");
        }
        if(nombre.equals("si")){
            System.out.printf("Con nombre: %s\n", "2,75");
        }
        if(nata.equals("si")){
            if(nombre.equals("si")){
                precio = precio + 2.50 + 2.75;
            }else{
                precio = precio + 2.50;
            }
            System.out.printf("Total: %.2f\n", precio);
        }else{
            if(nombre.equals("si")){
                precio = precio + 2.75;
            }
            System.out.printf("Total: %.2f\n", precio);
        }
    }
}

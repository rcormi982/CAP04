package Capitulo4;
/*Escribe un programa que calcule el precio final de un producto según su
base imponible (precio antes de impuestos), el tipo de IVA aplicado (general,
reducido o superreducido) y el código promocional. Los tipos de IVA general,
reducido y superreducido son del 21%, 10% y 4% respectivamente. Los códigos
promocionales pueden ser nopro, mitad, meno5 o 5porc que significan
respectivamente que no se aplica promoción, el precio se reduce a la mitad,
se descuentan 5 euros o se descuenta el 5%. El ejercicio se da por bueno
si se muestran los valores correctos, aunque los números no estén tabulados.*/
import java.util.Scanner;

public class EJ23 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Programa que calcula el precio final");
        System.out.print("Por favor introduce el precio antes de impuestos:");
        double baseImponible = s.nextDouble();
        System.out.print("Por favor introduce el tipo de IVA (general, reducido o superreducido): ");
        String IVA = System.console().readLine();
        System.out.print("Por favor introduce el codigo de descuento (nopro, mitad, menos5 o 5porc): ");
        String codigo = System.console().readLine();
        double precioIVA;

        if(IVA.equals("general")){
            if(codigo.equals("nopro")){
                precioIVA = baseImponible*1.21;
                System.out.printf("%-25s %-25.2f\n", "Base imponible:", baseImponible);
                System.out.printf("%-25s %-25.2f\n", "IVA (21%): ", (baseImponible*0.21));
                System.out.printf("%-25s %-25.2f\n", "Precio con IVA: ", precioIVA);
                System.out.printf("%-25s %-25.2f\n", "Cód.promo.(nopro): ", precioIVA);
                System.out.printf("%-25s %-25.2f\n", "TOTAL: ", precioIVA);
            }
            if(codigo.equals("mitad")){
                precioIVA = baseImponible*1.21;
                System.out.printf("%-25s %-25.2f\n", "Base imponible:", baseImponible);
                System.out.printf("%-25s %-25.2f\n", "IVA (21%): ", (baseImponible*0.21));
                System.out.printf("%-25s %-25.2f\n", "Precio con IVA: ", precioIVA);
                System.out.printf("%-25s %-25.2f\n", "Cód.promo.(mitad): ", (precioIVA)-(precioIVA*0.50));
                System.out.printf("%-25s %-25.2f\n", "TOTAL: ", (precioIVA)-(precioIVA*0.50));    
            }
            if(codigo.equals("menos5")){
                precioIVA = baseImponible*1.21;
                System.out.printf("%-25s %-25.2f\n", "Base imponible:", baseImponible);
                System.out.printf("%-25s %-25.2f\n", "IVA (21%): ", (baseImponible*0.21));
                System.out.printf("%-25s %-25.2f\n", "Precio con IVA: ", precioIVA);
                System.out.printf("%-25s %-25s\n", "Cód.promo.(menos5): ", "5");
                System.out.printf("%-25s %-25.2f\n", "TOTAL: ", ((precioIVA)-5));    
            }
            if(codigo.equals("5porc")){
                precioIVA = baseImponible*1.21;
                System.out.printf("%-25s %-25.2f\n", "Base imponible:", baseImponible);
                System.out.printf("%-25s %-25.2f\n", "IVA (21%): ", (baseImponible*0.21));
                System.out.printf("%-25s %-25.2f\n", "Precio con IVA: ", precioIVA);
                System.out.printf("%-25s %-25.2f\n", "Cód.promo.(5porc): ", precioIVA*0.05);
                System.out.printf("%-25s %-25.2f\n", "TOTAL: ", ((precioIVA)-(precioIVA*0.05)));    
            }
        }
        if(IVA.equals("reducido")){
            if(codigo.equals("nopro")){
                precioIVA = baseImponible*1.10;
                System.out.printf("%-25s %-25.2f\n", "Base imponible:", baseImponible);
                System.out.printf("%-25s %-25.2f\n", "IVA (10%): ", (baseImponible*0.10));
                System.out.printf("%-25s %-25.2f\n", "Precio con IVA: ", precioIVA);
                System.out.printf("%-25s %-25.2f\n", "Cód.promo.(nopro): ", precioIVA);
                System.out.printf("%-25s %-25.2f\n", "TOTAL: ", precioIVA);
            }
            if(codigo.equals("mitad")){
                precioIVA = baseImponible*1.10;
                System.out.printf("%-25s %-25.2f\n", "Base imponible:", baseImponible);
                System.out.printf("%-25s %-25.2f\n", "IVA (10%): ", (baseImponible*0.10));
                System.out.printf("%-25s %-25.2f\n", "Precio con IVA: ", precioIVA);
                System.out.printf("%-25s %-25.2f\n", "Cód.promo.(mitad): ", (precioIVA)-(precioIVA*0.50));
                System.out.printf("%-25s %-25.2f\n", "TOTAL: ", (precioIVA)-(precioIVA*0.50));    
            }
            if(codigo.equals("menos5")){
                precioIVA = baseImponible*1.10;
                System.out.printf("%-25s %-25.2f\n", "Base imponible:", baseImponible);
                System.out.printf("%-25s %-25.2f\n", "IVA (10%): ", (baseImponible*0.10));
                System.out.printf("%-25s %-25.2f\n", "Precio con IVA: ", precioIVA);
                System.out.printf("%-25s %-25s\n", "Cód.promo.(menos5): ", "5");
                System.out.printf("%-25s %-25.2f\n", "TOTAL: ", ((precioIVA)-5));    
            }
            if(codigo.equals("5porc")){
                precioIVA = baseImponible*1.10;
                System.out.printf("%-25s %-25.2f\n", "Base imponible:", baseImponible);
                System.out.printf("%-25s %-25.2f\n", "IVA (10%): ", (baseImponible*0.10));
                System.out.printf("%-25s %-25.2f\n", "Precio con IVA: ", precioIVA);
                System.out.printf("%-25s %-25.2f\n", "Cód.promo.(5porc): ", precioIVA*0.05);
                System.out.printf("%-25s %-25.2f\n", "TOTAL: ", ((precioIVA)-(precioIVA*0.05)));    
            }
        }
        if(IVA.equals("superreducido")){
            if(codigo.equals("nopro")){
                precioIVA = baseImponible*1.04;
                System.out.printf("%-25s %-25.2f\n", "Base imponible:", baseImponible);
                System.out.printf("%-25s %-25.2f\n", "IVA (4%): ", (baseImponible*0.04));
                System.out.printf("%-25s %-25.2f\n", "Precio con IVA: ", precioIVA);
                System.out.printf("%-25s %-25.2f\n", "Cód.promo.(nopro): ", precioIVA);
                System.out.printf("%-25s %-25.2f\n", "TOTAL: ", precioIVA);
            }
            if(codigo.equals("mitad")){
                precioIVA = baseImponible*1.04;
                System.out.printf("%-25s %-25.2f\n", "Base imponible:", baseImponible);
                System.out.printf("%-25s %-25.2f\n", "IVA (4%): ", (baseImponible*0.04));
                System.out.printf("%-25s %-25.2f\n", "Precio con IVA: ", precioIVA);
                System.out.printf("%-25s %-25.2f\n", "Cód.promo.(mitad): ", (precioIVA)-(precioIVA*0.50));
                System.out.printf("%-25s %-25.2f\n", "TOTAL: ", (precioIVA)-(precioIVA*0.50));    
            }
            if(codigo.equals("menos5")){
                precioIVA = baseImponible*1.04;
                System.out.printf("%-25s %-25.2f\n", "Base imponible:", baseImponible);
                System.out.printf("%-25s %-25.2f\n", "IVA (4%): ", (baseImponible*0.04));
                System.out.printf("%-25s %-25.2f\n", "Precio con IVA: ", precioIVA);
                System.out.printf("%-25s %-25s\n", "Cód.promo.(menos5): ", "5");
                System.out.printf("%-25s %-25.2f\n", "TOTAL: ", ((precioIVA)-5));    
            }
            if(codigo.equals("5porc")){
                precioIVA = baseImponible*1.04;
                System.out.printf("%-25s %-25.2f\n", "Base imponible:", baseImponible);
                System.out.printf("%-25s %-25.2f\n", "IVA (4%): ", (baseImponible*0.04));
                System.out.printf("%-25s %-25.2f\n", "Precio con IVA: ", precioIVA);
                System.out.printf("%-25s %-25.2f\n", "Cód.promo.(5porc): ", precioIVA*0.05);
                System.out.printf("%-25s %-25.2f\n", "TOTAL: ", ((precioIVA)-(precioIVA*0.05)));    
            }
        }
        s.close();
    }
}

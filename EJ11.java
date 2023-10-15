package Capitulo4;
/*Escribe un programa que dada una hora determinada (horas y minutos), 
calcule los segundos que faltan para llegar a la medianoche.*/
public class EJ11 {
    public static void main(String[] args) {
        System.out.println("Introduce la hora (0-23): ");
        int hora = Integer.parseInt(System.console().readLine());
        System.out.println("Introduce los minutos (0-60):");
        int minutos = Integer.parseInt(System.console().readLine());

        if(hora==0 && minutos==0)
            System.out.println("Es medianoche");
        else{
            int segundosTranscurridos = (hora*3600)+(minutos*60);
            int segundosFaltan = (24*3600)-segundosTranscurridos;
            System.out.println("Los segundos que faltan para llegar a medianoche son: " + segundosFaltan + " segundos");
        }   
    }
}

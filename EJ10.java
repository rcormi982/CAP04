package Capitulo4;
/*Escribe un programa que nos diga el horóscopo a partir del día y el mes de
nacimiento.*/
import java.util.Scanner;

public class EJ10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca el día de nacimiento: ");
        int dia = Integer.parseInt(s.nextLine());
        System.out.println("Introduzca el mes de nacimiento: ");
        String mes = s.nextLine();
        String horoscopo = "";
        mes = mes.toLowerCase();
        switch (mes) {
            case "enero":
                if(dia>=1 && dia<=31){
                    if(dia<21)
                    horoscopo = "Capricornio";
                    else
                    horoscopo = "Acuario";
                    System.out.println("Su horoscopo es: " + horoscopo);   
                }else
                    System.out.println("El día introducido no es correcto.");
                break;
            case "febrero":
                if(dia>=1 && dia<=29){
                    if(dia<21)
                    horoscopo = "Acuario";
                    else
                    horoscopo = "Piscis";
                    System.out.println("Su horoscopo es: " + horoscopo);   
                }else
                    System.out.println("El día introducido no es correcto.");
                break;
            case "marzo":
                if(dia>=1 && dia<=31){
                    if(dia<21)
                    horoscopo = "Piscis";
                    else
                    horoscopo = "Aries";
                    System.out.println("Su horóscopo es: " + horoscopo);   
                }else
                    System.out.println("El día introducido no es correcto.");
                break;
            case "abril":
                if(dia>=1 && dia<=31){
                    if(dia<21)
                    horoscopo = "Aries";
                    else
                    horoscopo = "Tauro";
                    System.out.println("Su horóscopo es: " + horoscopo);   
                }else
                    System.out.println("El día introducido no es correcto.");
                break;
            case "mayo":
                if(dia>=1 && dia<=31){
                    if(dia<20)
                    horoscopo = "Tauros";
                    else
                    horoscopo = "Géminis";
                    System.out.println("Su horoscopo es: " + horoscopo);   
                }else
                    System.out.println("El día introducido no es correcto.");
                break;
            case "junio":
                if(dia>=1 && dia<=31){
                    if(dia<22)
                    horoscopo = "Géminis";
                    else
                    horoscopo = "Cáncer";
                    System.out.println("Su horoscopo es: " + horoscopo);   
                }else
                    System.out.println("El día introducido no es correcto.");
                break;
            case "julio":
                if(dia>=1 && dia<=31){
                    if(dia<22)
                    horoscopo = "Cáncer";
                    else
                    horoscopo = "Leo";
                    System.out.println("Su horoscopo es: " + horoscopo);   
                }else
                    System.out.println("El día introducido no es correcto.");
                break;
            case "agosto":
                if(dia>=1 && dia<=31){
                    if(dia<24)
                    horoscopo = "Leo";
                    else
                    horoscopo = "Virgo";
                    System.out.println("Su horoscopo es: " + horoscopo);   
                }else
                    System.out.println("El día introducido no es correcto.");
                break;
            case "septiembre":
                if(dia>=1 && dia<=31){
                    if(dia<23)
                    horoscopo = "Virgo";
                    else
                    horoscopo = "Libra";
                    System.out.println("Su horoscopo es: " + horoscopo);   
                }else
                    System.out.println("El día introducido no es correcto.");
                break;
            case "octubre":
                if(dia>=1 && dia<=31){
                    if(dia<23)
                    horoscopo = "Libra";
                    else
                    horoscopo = "Escorpio";
                    System.out.println("Su horoscopo es: " + horoscopo);   
                }else
                    System.out.println("El día introducido no es correcto.");
                break;
            case "noviembre":
                if(dia>=1 && dia<=31){
                    if(dia<23)
                    horoscopo = "Escorpio";
                    else
                    horoscopo = "Sagitario";
                    System.out.println("Su horoscopo es: " + horoscopo);   
                }else
                    System.out.println("El día introducido no es correcto.");
                break;
            case "diciembre":
                if(dia>=1 && dia<=31){
                    if(dia<21)
                    horoscopo = "Sagitario";
                    else
                    horoscopo = "Capricornio";
                    System.out.println("Su horoscopo es: " + horoscopo);   
                }else
                    System.out.println("El día introducido no es correcto.");
                break;
            default:
                System.out.println("El mes introducido no es correcto.");
                break;
        }
    }
}

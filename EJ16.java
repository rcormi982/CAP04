package Capitulo4;
/*Realiza un programa que nos diga si hay probabilidad de que
nuestra pareja nos está siendo infiel. El programa irá haciendo
preguntas que el usuario contestará con una v (verdadero) o una
f (falso). Cada pregunta contestada con v sumará 3 puntos.
Las preguntas contestadas con f no suman puntos. Utiliza el
fichero test_infidelidad.txt para obtener las preguntas y las
conclusiones del programa. */
public class EJ16 {
    public static void main(String[] args) {
        String respuesta;
        System.out.println("Test de infidelidad");
        System.out.println("1. Tu pareja parece más inquieta de lo habitual sin ningún motivo aparente:\na)V \nb)F");
        System.out.print("=>");
        respuesta = System.console().readLine();
        respuesta = respuesta.toLowerCase();
        int puntos = 0;

        if(respuesta.equals("v")){
            puntos+=3;
        }
        System.out.println("2. Ha aumentado sus gastos de vestuario:\na)(V)erdadero \nb)(F)also");
        System.out.print("=>");
        respuesta = System.console().readLine();
        if(respuesta.equals("v")){
            puntos+=3;
        }
        System.out.print("Los puntos obtenidos son: " + puntos);
    }

}

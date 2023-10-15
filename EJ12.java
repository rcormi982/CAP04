package Capitulo4;
/*Realiza un minicuestionario con 10 preguntas tipo test sobre las
asignaturas que se imparten en el curso. Cada pregunta acertada
sumará un punto. El programa mostrará al final la califcación
obtenida. Pásale el minicuestionario a tus compañeros y pídeles
que lo hagan para ver qué tal andan de conocimientos en las
diferentes asignaturas del curso.*/
public class EJ12 {
    public static void main(String[] args) {
        System.out.println("Cuestionario de 1ºDAM");
        String respuesta;
        int puntos = 0;

        System.out.println("1. ¿Cuál de los siguientes datos tiene mayor precisión en JAVA:");
        System.out.println("a) int\nb) double\nc) float");
        System.out.print("=> ");
        respuesta = System.console().readLine();

        if(respuesta.equals("b"))
            puntos++;

        System.out.println("2.¿Cuál es el lenguaje que se utiliza para hacer consultas en las base de datos:");
        System.out.println("a) XML\nb) Select\nc) SQL");
        System.out.print("=> ");
        respuesta = System.console().readLine();

        if(respuesta.equals("c"))
            puntos++;

        System.out.println("Los puntos obtenidos son: " + puntos + " puntos");

    }
}

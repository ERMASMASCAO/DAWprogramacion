package Tema4.Objetos;
/*
Crea una clase alumno con un identificador nombre y una clase 1CFSJ <----"ejemplo" se pueden crear alumnos con nombre e ID "Identificador"
o con las 3 cosas. También hay crear un metodo propio de los objetos llamado (PreguntarDuda) que tiene que imprimir "Levanta la mano"
aparte crear un contador alumnos del total de alumnos creados un metodo de clase llamado imprimir informe que muestra el total de alumnos
otro metodo de clase que se llama imprimir informe de alumnos al que se le pasa un array de alumnos y lo que hace el es imprimir.
*/

/**
 * 1CFSJ
 */

class Alumno{
    //Zona de atributos de clase

    private static int totalAlumnos = 0;

    //Zona de atributos de objetos

    private int id;
    private String nombre;
    private String grupo;

    //ZOnade métodos

    public Alumno (int identificador, String nombreAlumno){
        id = identificador;
        nombre = nombreAlumno;
        grupo = "No asignado";

        totalAlumnos++;
    }

    public Alumno (int identificador, String nombreAlumno, String grupoAlumno){
        id = identificador;
        nombre = nombreAlumno;
        grupo = grupoAlumno;

        totalAlumnos++;
    }

    public void PreguntarDuda(){
        System.out.println(nombre + "levanta la mano");
    }
    public static void imprimirInforme(){
        System.out.println("Total alumnos" + totalAlumnos);
    }
    public static void imprimirInformeAlumnos (Alumno[] alumnos){
        System.out.println("Nombre\t\t\tGrupo");
        for (Alumno alumno : alumnos) {
            System.out.println(alumno.nombre + "\t\t" + alumno.grupo);
        }
    }
}
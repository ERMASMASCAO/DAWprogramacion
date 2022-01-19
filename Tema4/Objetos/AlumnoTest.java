package Tema4.Objetos;

public class AlumnoTest {
    
    public static void main(String[]args) {
        Alumno a1, a2, a3, a4;
        
        a1= new Alumno(1, "Pablo");
        a2= new Alumno(2, "María", "1CFSJ");
        a3= new Alumno(3, "Francisco", "1CFSJ");
        a4= new Alumno(4, "Raul");

        a1.PreguntarDuda();
        a2.PreguntarDuda();

        Alumno [] lista = {a1,a2,a3,a4};

        Alumno.imprimirInforme();
        Alumno.imprimirInformeAlumnos(lista); 
    }
}

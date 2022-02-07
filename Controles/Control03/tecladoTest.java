package Controles.Control03;

public class tecladoTest {
     
    public static void main(String[] args) {
        
        // primero probamos la clase teclado, creando un teclado por defecto y luego uno personalizado, luego llamaremos al metodo print para ver el contador y sus atributos
        Teclado t1 = new Teclado();
        t1.print();
        Teclado t2 = new Teclado("Rojo", 60, "Inalambrico", "En", "Compacto");
        System.out.println("\n"); 
        t2.print();

        //Probar la clase ordenador 
        Ordenador o1 = new Ordenador();
        o1.imprimir();
        

    }
    
    
}
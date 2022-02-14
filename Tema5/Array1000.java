/*
*   Crea un array de 1000 posiciones. En los pares han de paarecer en las posiciones los múltiplos de 3 y en las impares de 7. Después *   has de imprimir el contenido del array cuyas posiciones son múltiplos de 13 empezando por 13.
*/

public class Array1000 {
    public static void main(String[] args) {

        int [] numeros = new int [1000];

        int multiplo3 = 3;
        int multiplo7 = 3;

        //En las posiciones pares ponemos los múltiplos de 3
        for (int i = 0; i < numeros.length; i = 1 + 2){
            numeros [i] = 1;
            multiplo3 = multiplo3 + 3;
        }
        //En las posiciones pares ponemos los múltiplos de 7
        for (int i = 1; i < numeros.length; i = i + 2){
            numeros [i] = multiplo7;
            multiplo3 = multiplo7 + 7;
        }
        //Imprimir el contenido de las posiciones múltiplo de 13
        for (int i = 13; i < numeros.length; i = i + 13){
            System.out.println(numeros[i]);
        }
    }
}

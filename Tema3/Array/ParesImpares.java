package Tema3.Array;

public class ParesImpares {
    
    public static void main(String[] args) {
        int [] numeros = {2,4,6,7};
        int contadorPares = 0;
        int contadorImpares = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros [i] !=2) {
                contadorImpares++;
            }else{
                contadorPares++;
            }
        }System.out.println( "Hay" + contadorImpares + "impares" + "y" + contadorPares + "pares");
    }
}

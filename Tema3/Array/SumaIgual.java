package Tema3.Array;

public class SumaIgual {
    
    public static void main(String[] args) {
        int [] vector = {1,2,3,4,5,6,7,3,9,10};
        int numero = 6;
    
        for (int i = 0; i < vector.length; i++) {
            for (int j = i + 1; j < vector.length; j++) {
                int suma = vector[i] + vector[j];
                if (suma == numero){
                    System.out.println(vector[i] + ", " + vector[j]);
                }
            }     
        }
    }
}

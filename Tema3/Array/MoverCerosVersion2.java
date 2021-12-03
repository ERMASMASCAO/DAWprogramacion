package Tema3.Array;
public class MoverCerosVersion2 {
    
    public static void main (String [] args){
        int [] vector = {1,2,3,0,0,4,0,5,6};
        int [] vectorCopia = new int [vector.length];

        int j = 0;
        for (int i = 0; i < vector.length; i++){
            if (vector [i] != 0){
                vectorCopia [j] = vector[i];
                j++;
            } 
        }
        vector = vectorCopia;
    }
}
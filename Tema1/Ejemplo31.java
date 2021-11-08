public class Ejemplo31 {
    public static void main(String[] args) {
        
        //DECLARACIÓN DE VARIABLES
        
        int [] mi_matriz = new int [10];

        mi_matriz[0]=100;
        mi_matriz[1]=200;
        mi_matriz[2]=300;
        mi_matriz[3]=400;
        mi_matriz[4]=500;
        mi_matriz[5]=600;
        mi_matriz[6]=700;
        mi_matriz[7]=800;
        mi_matriz[8]=900;
        mi_matriz[9]=1000;

        //EMPIEZA EL PROGRAMA

        for (int i = 0; i < 10; i++) {
            System.out.println("Valor del índice  " + i + " = " + mi_matriz[i]);
            
        }
    }
}

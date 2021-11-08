public class Ejemplo29 {
    public static void main(String[] args) {
        
        //DECLARACIÓN DE VAIABLES

        //INICIO DEL PROGRAMA
        for(int i=3;i<=100;i++){
			int count=0;
			for(int j=1;j<=i;j++){
				if(i%j==0){
					count++;
				}
			}
			if(count>=2){
				System.out.println(i);
			}
		}
    }
}

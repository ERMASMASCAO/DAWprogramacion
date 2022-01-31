
public class Pajaro {
    class Pajaro {


        // *** atributos o propiedades o campos ***
        private static int numPajaros = 0; //propiedad estática nº pájaros
        private char color; // propiedad o atributo color
        private int edad; // propiedad o atributo edad
       
        // *** métodos de la clase ***
        private static void nuevoPajaro() {
            numPajaros++;
        };
    
        public Pajaro() {
            color = 'v';
            edad = 0;
           nuevoPajaro();
        }
        public Pajaro(char c, int e) {
            color = c;
            edad = e;
            nuevoPajaro();
        }
    
        public Pajaro(char c) {
            color = c;
            edad = 0;
            nuevoPajaro();
        }
    
        public Pajaro(int e) {
            color = 'a';
            edad = e;
            nuevoPajaro();
        }
    
        static void muestraPajaros() {
            System.out.println(numPajaros);
        };
       
        public static void main(String[] args) { // metodo main
            Pajaro p1;
            Pajaro p2;
            p1 = new Pajaro();
            p2 = new Pajaro('a', 3);
            Pajaro.muestraPajaros();
           
        }
       }
}


        public class PajaroTest {
            public static void main(String[] args) {
                Pajaro p1, p2, p3, p4;
        
                p1 = new Pajaro('n',56);
                p2 = new Pajaro();
                p3 = new Pajaro('v');
                p4 = new Pajaro(13);
        
                Pajaro.muestraPajaros();
                System.out.println(Pajaro.numPajaros);
    }
}

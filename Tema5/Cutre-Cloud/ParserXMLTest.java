public class ParserXMLTest {

    public static void printXML(ParserXML imprimible) {
        System.out.println(imprimible.generatexml());
    }

    public static void main(String[] args) {
    
    Usuario u1 = new Usuario("klk@gmail.com", "klklklk");
    Media m1 = new Media( "nombre", "contenido", "tipo", "usuario");

    printXML(u1);
    printXML(m1);
}
}

public class ParserXMLTest {

    public static void printXML(ParserXML imprimible){
        System.out.println(imprimible.generateXML());
    }
    public static void main(String[] args) {
        Usuario u1 = new Usuario("kk@gmail.com", "blablabla");
        Media m1 = new Media("peli.avi", "sdfjlaksjdflkasjdf", MediaType.VIDEO, u1);

        printXML(u1);
        printXML(m1);
    }
}

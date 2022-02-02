public class MailTest {
    public static void main(String[] args) {
        MailServer server = new MailServer();

        MailClient Daniel = new MailClient(server, "Daniel");
        MailClient Raul = new MailClient(server, "Raul");


        System.out.println(server.howManyMailItems("Pepe"));

        Daniel.sendMailItem("Pepe", "Algo", "Hola");
        Raul.sendMailItem("Pepe", "Algo", "KLK");


        System.out.println(server.howManyMailItems("Pepe"));

        server.getNextMailItem("Pepe").print();

        System.out.println(server.howManyMailItems("Pepe"));
    }
}

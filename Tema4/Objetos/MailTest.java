public class MailTest {
    public static void main(String[] args) {
        MailServer server = new MailServer();

        MailClient daniel = new MailClient(server, "Daniel");
        MailClient raul = new MailClient(server, "Raul");


        System.out.println(server.howManyMailItems("Pepe"));

        daniel.sendMailItem("Pepe;Dani;Joan;Toni", "hola", "Algo");
        raul.sendMailItem("Pepe;Dani;Joan;Toni", "Hola", "Algo");


        System.out.println(server.howManyMailItems("Pepe"));
        System.out.println(server.howManyMailItems("Dani"));
        System.out.println(server.howManyMailItems("Joan"));
        System.out.println(server.howManyMailItems("Toni"));

        server.getNextMailItem("Pepe").print();
        server.getNextMailItem("Dani").print();
        server.getNextMailItem("Joan").print();
        server.getNextMailItem("Toni").print();


        System.out.println(server.howManyMailItems("Pepe"));
        System.out.println(server.howManyMailItems("Dani"));
        System.out.println(server.howManyMailItems("Joan"));
        System.out.println(server.howManyMailItems("Toni"));

    }
}

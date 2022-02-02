public class MailTest {
    public static void main(String[] args) {
        MailServer server = new MailServer();

        MailClient daniel = new MailClient(server, "Daniel");
        MailClient raul = new MailClient(server, "Raul");


        System.out.println(server.howManyMailItems("Pepe"));

        daniel.sendMailItem("Pepe;Dani;Joan;Toni", "hola", "Algo");
        raul.sendMailItem("Pepe;Dani;Joan;Toni", "Hola", "Algo");

        System.out.println();
        System.out.println("--------------------");
        System.out.println(server.howManyMailItems("Pepe"));
        System.out.println("--------------------");
        System.out.println(server.howManyMailItems("Dani"));
        System.out.println("--------------------");
        System.out.println(server.howManyMailItems("Joan"));
        System.out.println("--------------------");
        System.out.println(server.howManyMailItems("Toni"));
        System.out.println("--------------------");


        System.out.println("--------------------");
        server.getNextMailItem("Pepe").print();
        System.out.println("--------------------");
        server.getNextMailItem("Dani").print();
        System.out.println("--------------------");
        server.getNextMailItem("Joan").print();
        System.out.println("--------------------");
        server.getNextMailItem("Toni").print();

        System.out.println();
        System.out.println("--------------------");
        System.out.println(server.howManyMailItems("Pepe"));
        System.out.println("--------------------");
        System.out.println(server.howManyMailItems("Dani"));
        System.out.println("--------------------");
        System.out.println(server.howManyMailItems("Joan"));
        System.out.println("--------------------");
        System.out.println(server.howManyMailItems("Toni"));
        System.out.println("--------------------");
    }
}

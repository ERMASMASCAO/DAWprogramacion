
public class TicketMachineTest {
    public static void main(String[] args) {

        TicketMachine maquina = new TicketMachine(100);
        maquina.insertMoney(200);
        maquina.insertMoney(100);
        maquina.printTicket();
        maquina.prompt();
        maquina.showPrice();
        maquina.empty();
        maquina.getTotal();
    }
}

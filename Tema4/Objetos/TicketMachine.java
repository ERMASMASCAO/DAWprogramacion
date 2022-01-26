package Tema4.Objetos;
/**
 * TicketMachine models a naive ticket machine that issues
 * flat-fare tickets.
 * The price of a ticket is specified via the constructor.
 * It is a naive machine in the sense that it trusts its users
 * to insert enough money before trying to print a ticket.
 * It also assumes that users enter sensible amounts.
 *
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29
 */
public class TicketMachine
{
    // The price of a ticket from this machine.
    private int price;
    // The amount of money entered by a customer so far.
    private int balance;
    // The total amount of money collected by this machine.
    private int total;

    /**
     * Create a machine that issues tickets of the given price.
     * Note that the price must be greater than zero, and there
     * are no checks to ensure this.
     */
    public TicketMachine(int cost)
    {
        price = cost;
        balance = 0;
        total = 0;
    }

    /**
     * Return the price of a ticket.
     */
    public int getPrice()
    {
        return price;
    }
    // 1)Escribe un método selector llamado getTotal. Este método debe devolver el valor del campo total.
    public int getTotal()
    {
        return total;
    }
    // 2) Crea un método llamado setPrice(int cost) que le asigne el valor cost al campo price.
    public void setPrice(int cost) {
        this.price = cost;
    }
    /*  3) Añade un método denominado  prompt. Este método debe tener un tipo de
        retorno void y ningún parámetro. El cuerpo del método debe imprimir la siguiente línea  
        Please insert the correct amount of money. para informar al cliente de que introduzca la cantidad correcta de dinero.
    */
    public void prompt(){
        System.out.println("Please insert the correct amount of money");
    }
    /*
        4) Añade un método  showPrice. Debe tener un tipo de retorno  void  y ningún parámetro. El cuerpo del método debe imprimir: 
        The price of the ticket is xyz cents. 
    */
    /*
        5) Define   un   nuevo   constructor   para   la   clase.   Este   no   debe   admitir   ningún parámetro, por lo que se deberá 
        fijar el precio posteriormente llamando a setPrice.   Comprueba   la   implementación   creando   máquinas   con   ambos
        constructores.
    */
    public TicketMachine()
    {
        setPrice(0);
    }
    /*
        6) Crea un nuevo método, empty, que simule el efecto de extraer todo el dinero acumulado en la máquina. Este método debe 
        tener un tipo de retorno void y su cuerpo ha de asignar simplemente el valor  0  al campo  total. ¿Necesita este método algún 
        tipo de parámetro? Comprueba este método creando una máquina, introduciendo algo de dinero, imprimiendo billetes, comprobando 
        el total y luego vaciando la máquina. ¿Es el método empty un mutador o un selector?.
    */
    public void empty()
    {
        total = 0;
    }
    public void showPrice(){
        System.out.println("The pice of the ticket is  " + price + "  cents");
    }
    /**
     * Return the amount of money already inserted for the
     * next ticket.
     */
    public int getBalance()
    {
        return balance;
    }

    /**
     * Receive an amount of money from a customer.
     */
    public void insertMoney(int amount)
    {
        balance = balance + amount;
    }

    /**
     * Print a ticket.
     * Update the total collected and
     * reduce the balance to zero.
     */
    public void printTicket()
    {
        // Simulate the printing of a ticket.
        System.out.println("##################");
        System.out.println("# The BlueJ Line");
        System.out.println("# Ticket");
        System.out.println("# " + price + " cents.");
        System.out.println("##################");
        System.out.println();

        // Update the total collected with the balance.
        total = total + balance;
        // Clear the balance.
        balance = 0;
    }
}
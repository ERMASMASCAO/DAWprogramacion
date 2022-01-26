package Tema4.Objetos;

/**
 * TicketMachine models a ticket machine that issues
 * flat-fare tickets.
 * The price of a ticket is specified via the constructor.
 * Instances will check to ensure that a user only enters
 * sensible amounts of money, and will only print a ticket
 * if enough money has been input.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29
 */
public class TiketMachine2
{
    // The price of a ticket from this machine.
    private int price;
    // The amount of money entered by a customer so far.
    private int balance;
    // The total amount of money collected by this machine.
    private int total;

    private int discount;
    

    /**
     * Create a machine that issues tickets of the given price.
     */
    public TicketMachine(int cost)
    {
        price = cost;
        balance = 0;
        total = 0;
        discount = 0;
    }

    /**
     * @Return The price of a ticket.
     */
    public int getPrice()
    {
        return price;
    }
    public int getDiscout(){
        return discount;
    }
    public void setDsicount(){
        this.discount = 20;
    }
    public void resetDiscount(){
    this.discount = 0;
    }


    /**
     * Return The amount of money already inserted for the
     * next ticket.
     */
    public int getBalance()
    {
        return balance;
    }

    /**
     * Receive an amount of money from a customer.
     * Check that the amount is sensible.
     */
    public void insertMoney(int amount)
    {
        if(amount > 0) {
            balance = balance + amount;
        }
        else {
            System.out.println("Use a positive amount rather than: " +
                               amount);
        }
    }

    /**
     * Print a ticket if enough money has been inserted, and
     * reduce the current balance by the ticket price. Print
     * an error message if more money is required.
     */
    public void printTicket()
    {
        int actualPrice = price * (100 - discount/100)/100;
        int amountToPay = actualPrice - balance;

        if(amountToPay <= 0 ) {
            // Simulate the printing of a ticket.
            System.out.println("##################");
            System.out.println("# The BlueJ Line");
            System.out.println("# Ticket");
            System.out.println("# " + actualPrice + " cents.");
            System.out.println("##################");
            System.out.println();

            // Update the total collected with the price.
            total = total + actualPrice;
            // Reduce the balance by the price.
            balance = balance - actualPrice;
        }
        else {
            System.out.println("You must insert at least: " +
                               (amountToPay) + " more cents.");
                    
        }
    }

    /**
     * Return the money in the balance.
     * The balance is cleared.
     */
    public int refundBalance()
    {
        int amountToRefund;
        amountToRefund = balance;
        balance = 0;
        return amountToRefund;
    }
    
    /*
    Escribe un método llamado emptyMachine, diseñado para simular el vaciado del dinero acumulado en la máquina.Este método debe 
    reinicializar debe reinizializar el campo total a cero, pero también devolver el valor que tuviera almacenado en total antes 
    de la reinicialización.
    */
    public int emptyMachine()
    {
        int temp = this.total;
        this.total = 0;
        return temp;
    }
    /*
    Supongamos que queremos permitir que la máquina imprima billetes con descuento (20%) que se aplica cuando los usuarios pulsan
    un botón en la máquina física.Implementa un método llamado setDiscount, que realice esta operación.Antes de empezar a hacerlo
    piensa bien qué campos nuevos necesitas y qué métodos deberías cambiar.
    */
    public double setDiscount()
    {
    setDiscount();
    this.discount=20;
    {
    }
    }
}

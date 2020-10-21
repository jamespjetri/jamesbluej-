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
 * 
 * Modified by Student Name
 */
public class TicketMachine extends ticket
{
    // The price of a ticket from this machine.
    private int price;
    // The amount of money entered by a customer so far.
    private int balance;
    // The total amount of money collected by this machine.
    private int total;
    //
    private String purchasedTicket;
    
    private  Ticket ticketToAylesbury;
    
    private  Ticket ticketToAmersham;
    
    private  Ticket ticketToHighWycombe;
    
    /**
     * Create a machine that issues tickets of the given price.
     */
    public TicketMachine()
    {
        
        balance = 0;
        total = 0;
        
        createTicket();
    }
    public void createTicket()
    {
        ticketToAylesbury = new Ticket("Aylesbury", 220);
        ticketToAmersham = new Ticket("Amersham", 350);
        ticketToHighWycombe = new Ticket("High Wycombe", 120);
    }
    public void destination(String location)
    {
        if (location == "Aylesbury")
        {
            purchasedTicket = ticketToAylesbury.destination;
            price = ticketToAylesbury.price;
        }
        else if (location == "Amersham")
        {
            purchasedTicket = ticketToAmersham.destination;
            price = ticketToAmersham.price;
        }
        else if (location == "High Wycombe")
        {
            purchasedTicket = ticketToHighWycombe.destination;
            price = ticketToHighWycombe.price;
        }
        else
        {
            System.out.println(" please chose a ticket from the follwoing options ");
        
        }
    }
    
    
    
    
    /**
     * @Return The price of a ticket.
     */
    public int getPrice()
    {
        return price;
    }

    /**
     * Return The amount of money already inserted for the
     * next ticket.
     */
    public int getBalance()
    {
        return balance;
    }

    public void insertTenpence()
    {
        balance = balance + 10;
        System.out.println(" coins added: 10 pence");
        System.out.println(" Current Balance: " + balance);
 
    }   
    
    public void insertTwentypence()
    {
        balance = balance + 20;
        System.out.println(" coins added: 20 pence");
        System.out.println(" Current Balance: " + balance);
 
    }   
    
     public void insertHundredpence()
    {
        balance = balance + 100;
        System.out.println(" coins added: 100 pence");
        System.out.println(" Current Balance: " + balance);
 
    }   
    
     public void inserttwohundredpence()
    {
        balance = balance + 200;
        System.out.println(" coins added: 200 pence");
        System.out.println(" Current Balance: " + balance);
 
    }   
    
    /**
     * Print a ticket if enough money has been inserted, and
     * reduce the current balance by the ticket price. Print
     * an error message if more money is required.
     */
    public void printTicket()
    {
        if(balance >= price) 
        {
            // Simulate the printing of a ticket.
            System.out.println("##################");
            System.out.println("# The BlueJ Line");
            System.out.println("# Ticket" + purchasedTicket);
            System.out.println("# " + price + " cents.");
            System.out.println("##################");
            System.out.println();

            // Update the total collected with the price.
            total = total + price;
            // Reduce the balance by the price.
            balance = balance - price;
        }
        else 
        {
            System.out.println("You must insert at least: " +
                               (price - balance) + " more cents.");
                    
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
    
    public void printAllTickets()
    {
        System.out.print("Destination: " + ticketToAylesbury.destination + " ,");
        System.out.println("Price: " + ticketToAylesbury.price + " pence");
        
        System.out.print("Destination: " + ticketToAmersham.destination + " ,");
        System.out.println("Price: " + ticketToAmersham.price + " pence");
        
        System.out.print("Destination: " + ticketToHighWycombe.destination + " ,");
        System.out.println("Price: " + ticketToHighWycombe.price + " pence");
        
        
    }
}

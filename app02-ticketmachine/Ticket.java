import java.util.Date;
/**
 * Write a description of class Ticket here.
 *
 * @author (James Pjetri)
 * @version (16/10/2020)
 */
public class Ticket
{
    // instance variables - replace the example below with your own
    public  String destination;
    
    public int price;
    
    private Date datePruchased;
   

    /**
     * Constructor for objects of class Ticket
     */
    public Ticket(String ticketName, int price)
    
    {
        this.destination = ticketName;
        this.price = price;
        datePruchased = new Date();
    }

    public String getdestination()
    {
        return destination;
    }
    
    public int  getPrice()
    {
        return price;
    }
    
    public void print()
    {
        System.out.print("Destination: " + destination);
        System.out.println("Price: " + price + " pence");
    }
    
    
 }

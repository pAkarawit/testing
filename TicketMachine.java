public class TicketMachine
{
  private int price;    // price of a ticket
  private int balance;  // amount entered by customer
  private int total;    // total money in machine


  public TicketMachine(int ticketCost)
  { price = ticketCost;  // set the ticket price
    balance = 0;
    total = 0;
  }
public int getPrice()
 {  return price; }

  public int getBalance()
  { return balance; }

  public int getTotal()
  {  return total;  }
  public void insertMoney(int amount)
  // process money inserted into the machine
  {
    if (amount > 0)
      balance = balance + amount;
    else
      System.out.println("Use a positive amount: " + amount);
  }
public void printTicket()
  { if (balance >= price) {// if enough money inserted
      // Simulate the printing of a ticket.
      System.out.println("##################");
      System.out.println("# Ticket");
      System.out.println("# " + price + " baht.");
      System.out.println("##################");
      System.out.println();

      // Update the total collected with the price.
      total = total + price;
      // Reduce the balance by the prince.
      balance = balance - price;
    }
    else   // report error
      System.out.println(
          "You must insert at least: " + (price - balance) + " more baht.");
  }  // end of printTicket()
public int refundBalance()
  {
    int amountToRefund;
    amountToRefund = balance;
    balance = 0;    //clear ticket machine's balance
    return amountToRefund;   //return balance amount
  }

}  // end of TicketMachine class


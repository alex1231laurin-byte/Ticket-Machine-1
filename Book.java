
/**
 * Write a description of class Book here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Book
{
    // instance variables - replace the example below with your own
    private int price;
    private String title;
    private int balance;

    /**
     * Constructor for objects of class Book
     */
    public Book(int cost,String name)
    {
        // initialise instance variables
        price = cost;
        title = name;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String getTitle()
    {
        // put your code here
        return title;
    }
    
    public int getPrice()
    {
        return price;
    }
    
    public void insertMoney(int amount)
    {
        balance += amount;
    }
    
    public int getbalance()
    {
        return balance;
    }
}

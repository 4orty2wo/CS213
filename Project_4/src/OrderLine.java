/**
 * OrderLine class, describes an item in the order.
 * 
 * @author Seth Santos, Tiffany Chen
 * 
 */
public class OrderLine {
    private int lineNumber; //a serial number created when a sandwich is added to the order
    private Sandwich sandwich;
    private double price;

    /**
     * Class constructor that initializes the data fields of a order line.
     * 
     * @param lineNumber line number of order
     * @param sandwich the sandwich
     * @param price price of entire order
     */
    public OrderLine(int lineNumber, Sandwich sandwich, double price) {
        this.lineNumber = lineNumber;
        this.sandwich = sandwich;
        this.price = price;
    }

    /**
     * Getter method for line number
     * @return order line number
     */
    public int getLineNum() {
        return lineNumber;
    }

    /**
     * changes the line number of the sandwich.
     * @param num we want to change the line number to.
     */
    public void setLineNum(int num){
        lineNumber = num;
    }

    /**
     * Getter method for sandiwch
     * @return the sandwich in the orderline
     */
    public Sandwich getSandwich() {
        return sandwich;
    }

    /**
     * Getter method for price
     * @return the price of the orderline
     */
    public double getPrice() {
        return price;
    }

    /**
     * Formats the output of the orderline details
     * @return Type of sandwich, its ingredients, and the price
     */
    @Override
    public String toString() {
        return lineNumber + " " + sandwich.toString() + " Price $" + String.format("%.2f", getPrice());
    }
    
}

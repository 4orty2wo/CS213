import java.util.ArrayList;

public class Beef extends Sandwich {

    private final double initSandwichPrice = 10.99;

    /**
     * Default constructor
     */
    public Beef(){
        super();
        extras = new ArrayList<Extra>();
    }

    /**
     * Abstract method that returns the price for the beef sandwich
     * @return the price for the beef sandwich
     */
	@Override
	public double price() {
		// TODO Auto-generated method stub
		return PER_EXTRA * extras.size() + initSandwichPrice;
    }

    @Override
    public boolean add(Object obj) {
        Extra ingredient = (Extra) obj;
        extras.add(ingredient);
        return true;
    }

    @Override
    public boolean remove(Object obj) {
        Extra ingredient = (Extra) obj;
        extras.remove(ingredient);
        return true;
    }
    
    /**
     * Formats the output of the sandwich details
     * @return Type of sandwich, its ingredients, and the price
     */
    @Override
    public String toString() {
        return "Beef Sandwich; Roast Beef, Provolone Cheese, Mustard, Extra: " + super.toString() + price();
    }
    
}

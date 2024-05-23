public class Pizza
{
    private String pizzaType;
    private String pizzaToppings;
    private int pizzaSize;
    
    public Pizza(String theType, String theToppings, int theSize)
    {
        pizzaType = theType;
        pizzaToppings = theToppings;
        pizzaSize = theSize;
    }
    
    public String toString()
    {
        return pizzaType + " with " + pizzaToppings + " that comes in " + pizzaSize + " slices.";
    }
}

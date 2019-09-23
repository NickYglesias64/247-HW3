public class Sprinkles extends ToppingsDecorator {
    IceCream iceCream;

    /**
     * Adds Sprinkles to the ice cream
     * @param iceCream
     */
    public Sprinkles(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    /**
     * Adds the string sprinkles to the icecream
     * @return
     */
    public String toString() {
        return iceCream.toString() + " + Sprinkles";
    }

    /**
     * Adds the cost of sprinkles to the total cost
     * @return
     */
    public double getCost() {
        return iceCream.getCost() + 0.2;
    }
}

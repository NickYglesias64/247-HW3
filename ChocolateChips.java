public class ChocolateChips extends ToppingsDecorator{
    IceCream iceCream;

    /**
     * Creates the Chocolate Chips topping
     * @param iceCream
     */
    public ChocolateChips(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    /**
     * Adds the String when the Chocolate Chips are chosen
     * @return
     */
    public String toString() {
        return iceCream.toString() + " + chocolate chips";
    }

    /**
     * Adds the cost onto the total cost
     * @return
     */
    public double getCost() {
        return iceCream.getCost() + 0.3;
    }
}

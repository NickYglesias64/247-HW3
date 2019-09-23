public class Cherry extends ToppingsDecorator{
    IceCream iceCream;

    /**
     * Creates the Cherry topping
     * @param iceCream
     */
    public Cherry(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    /**
     * Adds the string when a cherry is chosen
     * @return
     */
    public String toString() {
        return iceCream.toString() + " + a cherry on top";
    }

    /**
     * adds the cost of the cherry onto the total cost
     * @return
     */
    public double getCost() {
        return iceCream.getCost() + 0.4;
    }
}

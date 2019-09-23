public abstract class IceCream {
    protected String description;

    /**
     * Creates the String of the description
     * @return
     */
    public String toString() {
        return description;
    }

    /**
     * creates the abstract version of the cost
     * @return
     */
    public abstract double getCost();

}

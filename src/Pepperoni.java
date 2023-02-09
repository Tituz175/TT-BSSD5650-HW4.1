public class Pepperoni extends ToppingDecorator {
    public Pepperoni(Pizza mTempPizza) {
        super(mTempPizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Pepperoni";
    }

    @Override
    public double getCost() {
        return super.getCost() + .50;
    }
}

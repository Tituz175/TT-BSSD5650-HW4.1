public class Mushrooms extends ToppingDecorator {
    public Mushrooms(Pizza mTempPizza) {
        super(mTempPizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Mushrooms";
    }

    @Override
    public double getCost() {
        return super.getCost() + .50;
    }
}

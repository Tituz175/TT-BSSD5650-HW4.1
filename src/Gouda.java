public class Gouda extends ToppingDecorator {
    public Gouda(Pizza mTempPizza) {
        super(mTempPizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Gouda";
    }

    @Override
    public double getCost() {
        return super.getCost() + .50;
    }
}

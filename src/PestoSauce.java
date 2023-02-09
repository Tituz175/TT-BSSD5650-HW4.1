public class PestoSauce extends ToppingDecorator {
    public PestoSauce(Pizza mTempPizza) {
        super(mTempPizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Pesto Sauce";
    }

    @Override
    public double getCost() {
        return super.getCost() + .50;
    }
}

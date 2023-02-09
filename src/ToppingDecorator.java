public abstract class ToppingDecorator implements Pizza {
    Pizza mTempPizza;

    public ToppingDecorator(Pizza mTempPizza) {
        this.mTempPizza = mTempPizza;
    }

    @Override
    public String getDescription() {
        return mTempPizza.getDescription();
    }

    @Override
    public double getCost() {
        return mTempPizza.getCost();
    }
}

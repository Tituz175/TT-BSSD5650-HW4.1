public class TomatoSauce extends ToppingDecorator {
    public TomatoSauce(Pizza mTempPizza) {
        super(mTempPizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Tomato Sauce";
    }

    @Override
    public double getCost() {
        return super.getCost() + .35;
    }
}

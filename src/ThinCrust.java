public class ThinCrust implements Pizza{
    @Override
    public String getDescription() {
        return "Thin Crust";
    }

    @Override
    public double getCost() {
        return 3.00;
    }
}

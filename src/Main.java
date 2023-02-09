public class Main {
    public static void main(String[] args) {
        Pizza pizza1 = new Mushrooms(new Mushrooms(new TomatoSauce(new Gouda(new Pepperoni(new ThinCrust())))));
        System.out.println(pizza1.getDescription());
        System.out.println(pizza1.getCost());

        Pizza pizza2 = new Onions(new Mushrooms(new PestoSauce(new AlfredoSauce( new ThinCrust()))));
        System.out.println(pizza2.getDescription());
        System.out.println(pizza2.getCost());

        Pizza pizza3 = new Gouda(new PestoSauce(new Lettuce(new Crustless())));
        System.out.println(pizza3.getDescription());
        System.out.println(pizza3.getCost());
    }
}
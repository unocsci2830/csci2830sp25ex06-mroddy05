package pizza.topping;
public class Chicken extends MeatTopping {
    @Override
    public String toString() {
        return "Chicken";
    }

    @Override
    public Double getPrice() {
        return 1.00;
    }
}

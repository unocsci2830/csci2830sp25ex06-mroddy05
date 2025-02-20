package pizza.topping;
public class Pepperoni extends MeatTopping {
    @Override
    public String toString() {
        return "Pepperoni";
    }

    @Override
    public Double getPrice() {
        return 0.90;
    }
}

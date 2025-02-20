package pizza.topping;
public class Sausage extends MeatTopping {
    @Override
    public String toString() {
        return "Sausage";
    }

    @Override
    public Double getPrice() {
        return 1.25;
    }
}

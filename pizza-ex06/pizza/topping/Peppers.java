package pizza.topping;
public class Peppers extends VeggieTopping {
    @Override
    public String toString() {
        return "Peppers";
    }

    @Override
    public Double getPrice() {
        return 0.50;
    }
}

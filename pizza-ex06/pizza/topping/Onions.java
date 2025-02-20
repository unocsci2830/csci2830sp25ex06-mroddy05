package pizza.topping;
public class Onions extends VeggieTopping {
    @Override
    public String toString() {
        return "Onions";
    }

    @Override
    public Double getPrice() {
        return 0.30;
    }
}

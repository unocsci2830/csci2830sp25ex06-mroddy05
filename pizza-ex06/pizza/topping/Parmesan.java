package pizza.topping;
public class Parmesan extends CheeseTopping {
    @Override
    public String toString() {
        return "Parmesan";
    }
    @Override
    public Double getPrice() {
        return 0.50;
    }
}

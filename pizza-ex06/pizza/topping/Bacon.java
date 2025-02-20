package pizza.topping;
public class Bacon extends MeatTopping {
    @Override
    public String toString() {
        return "Bacon";
    }

    @Override
    public Double getPrice() {
        return 1.10;
    }
}

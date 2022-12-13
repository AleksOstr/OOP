public class Milk extends Product{
    private String fatContent;

    public Milk(String name, double price, String fatContent) {
        super(name, price);
        this.fatContent = fatContent;
    }

    public String getFatContent() {
        return fatContent;
    }

    @Override
    public String toString() {
        return String.format("%s - %f - %s", super.getName(), super.getPrice(), this.getFatContent());
    }
}

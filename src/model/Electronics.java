package model;

public class Electronics extends Product {
    private String name;
    private Double price;

    public Electronics(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    @Override
    public Double accept(IProductVisitor visitor) {
        return visitor.visit(this);
    }
}

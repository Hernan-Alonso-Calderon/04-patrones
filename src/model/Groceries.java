package model;

public class Groceries extends Product {
    private String name;
    private Double price;

    public Groceries(String name, Double price) {
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

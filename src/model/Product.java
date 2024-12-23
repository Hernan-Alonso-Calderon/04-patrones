package model;

public abstract class Product {
    public abstract Double accept(IProductVisitor visitor);
}

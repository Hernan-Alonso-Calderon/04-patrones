package model;

public interface IProductVisitor {
    Double visit(Electronics electronics);
    Double visit(Groceries groceries);
}

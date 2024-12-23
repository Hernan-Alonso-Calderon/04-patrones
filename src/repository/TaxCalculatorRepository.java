package repository;

import model.Electronics;
import model.Groceries;
import model.IProductVisitor;

public class TaxCalculatorRepository implements IProductVisitor {
    @Override
    public Double visit(Electronics electronics) {
        return electronics.getPrice() * 0.15;
    }

    @Override
    public Double visit(Groceries groceries) {
        return groceries.getPrice() * 0.08;
    }
}

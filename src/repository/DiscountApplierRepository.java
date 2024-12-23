package repository;

import model.Electronics;
import model.Groceries;
import model.IProductVisitor;

public class DiscountApplierRepository implements IProductVisitor {
    @Override
    public Double visit(Electronics electronics) {
        return electronics.getPrice() * 0.10;
    }

    @Override
    public Double visit(Groceries groceries) {
        return groceries.getPrice() * 0.05;
    }
}

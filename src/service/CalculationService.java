package service;

import model.Electronics;
import model.Groceries;
import repository.DiscountApplierRepository;
import repository.TaxCalculatorRepository;

public class CalculationService {
    private DiscountApplierRepository discountApplier;
    private TaxCalculatorRepository taxCalculator;

    public CalculationService() {
        discountApplier = new DiscountApplierRepository();
        taxCalculator = new TaxCalculatorRepository();
    }

    public Double electronicsDiscountAplier(Electronics electronics){
       return electronics.accept(discountApplier);
    }

    public Double groceriesDiscountAplier(Groceries groceries){
        return groceries.accept(discountApplier);
    }

    public Double electronicsTaxCalculator(Electronics electronics){
        return electronics.accept(taxCalculator);
    }

    public Double groceriesTaxCalculator(Groceries groceries){
        return groceries.accept(taxCalculator);
    }
}

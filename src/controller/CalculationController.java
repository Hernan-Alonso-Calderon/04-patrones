package controller;

import model.Electronics;
import model.Groceries;
import service.CalculationService;

public class CalculationController {
    private CalculationService calculationService;

    public CalculationController() {
        this.calculationService = new CalculationService();
    }

    public void calculateElectronicsDiscount(String name, Double price){
        Electronics electronics = new Electronics(name,price);
        Double discount = calculationService.electronicsDiscountAplier(electronics);
        System.out.println("Applying 10% discount to " + electronics.getName() +
                ". Discount: $" + discount);
    }

    public void calculateGroceriesDiscount(String name, Double price){
        Groceries groceries = new Groceries(name,price);
        Double discount = calculationService.groceriesDiscountAplier(groceries);
        System.out.println("Applying 5% discount to " + groceries.getName() +
                ". Discount: $" + discount);
    }

    public void calculateElectronicsTax(String name, Double price){
        Electronics electronics = new Electronics(name,price);
        Double tax = calculationService.electronicsTaxCalculator(electronics);
        System.out.println("Calculating 15% tax for " + electronics.getName() +
                ". Tax: $" + tax);
    }

    public void calculateGroceriesTax(String name, Double price){
        Groceries groceries = new Groceries(name,price);
        Double tax = calculationService.groceriesTaxCalculator(groceries);
        System.out.println("Calculating 7% tax for " + groceries.getName() +
                ". Tax: $" + tax);
    }
}

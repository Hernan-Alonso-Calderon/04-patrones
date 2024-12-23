import controller.CalculationController;

public class Main {
    public static void main(String[] args) {
        CalculationController controller = new CalculationController();

        controller.calculateElectronicsDiscount("PC",3500000.0);
        controller.calculateGroceriesDiscount("eggs",18000.0);
        controller.calculateElectronicsTax("earphones",250000.0);
        controller.calculateGroceriesTax("milk",12000.0);
    }
}
package lista1;

public class Exercicio7 {
    private App app = new App();
    
    public void solved(){
        double factoryCost = app.readDouble("Digite o custo de fábrica do carro: ",false);

        double consumerCost = calculate(factoryCost);

        System.out.println("O custo ao consumidor do carro é: R$" + consumerCost);
    }

    public double calculate(double factoryCost) {
        double distributorPercentage = 0.28;
        double taxesPercentage = 0.45;

        double consumerCost = factoryCost + (factoryCost * distributorPercentage) + (factoryCost * taxesPercentage);

        return consumerCost;
    }
}

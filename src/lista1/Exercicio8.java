package lista1;

public class Exercicio8 {
    private App app = new App();

    public void solved() {
        double a = app.readDouble("Digite o valor de a: ",false);
        double b = app.readDouble("Digite o valor de b: ",false);
        double c = app.readDouble("Digite o valor de c: ",false);
        double d = app.readDouble("Digite o valor de d: ",false);
        double e = app.readDouble("Digite o valor de e: ",false);
        double f = app.readDouble("Digite o valor de f: ",false);

        double[] result = calculate(a, b, c, d, e, f);
        System.out.println("O valor de x é: " + result[0]);
        System.out.println("O valor de y é: " + result[1]);
    }

    static double[] calculate(double a, double b, double c, double d, double e, double f) {
        double[] result = new double[2]; 

        double denominator = a * e - b * d; 

        result[0] = (c * e - b * f) / denominator;
        result[1] = (a * f - c * d) / denominator;

        return result;
    }
}

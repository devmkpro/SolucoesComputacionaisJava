package lista1;

public class Exercicio1 {

    private App app = new App();

    public void solved() {
        double x1 = app.readDouble("Digite a coordenada x do primeiro ponto: ");
        double y1 = app.readDouble("Digite a coordenada y do primeiro ponto: ");
        double x2 = app.readDouble("Digite a coordenada x do segundo ponto: ");
        double y2 = app.readDouble("Digite a coordenada y do segundo ponto: ");

        double distancia = calculate(x1, y1, x2, y2);

        System.out.printf("A distância entre os pontos (%.2f, %.2f) e (%.2f, %.2f) é: %.2f%n", x1, y1, x2, y2, distancia);
    }

    double calculate(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

}

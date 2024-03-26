package lista2;

public class Exercicio7 {

    private App app = new App();

    public void solved() {
        double Y, X, X_anterior;
        final double e = 0.1;
        int iteracoes = 0;

        Y = app.readDouble("Digite um número positivo: ", true);

        X = Y / 2;

        do {
            X_anterior = X;
            X = X - (X * X - Y) / (2 * X);
            iteracoes++;
        } while (Math.abs(X - X_anterior) >= e);

        System.out.println("Raiz quadrada aproximada: " + X);
        System.out.println("Raiz quadrada real: " + Math.sqrt(Y));
        System.out.println("Diferença: " + (X - Math.sqrt(Y)));
        System.out.println("Número de iterações: " + iteracoes);
      
    }
}

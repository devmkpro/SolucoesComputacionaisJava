package lista2;

public class Exercicio4 {

    public App app = new App();

    public void solved() {
        double[][] matriz = lerMatriz();

        double somaImpares = calcularSomaColunasImpares(matriz);
        System.out.println("Soma das colunas ímpares: " + somaImpares);

        double media = calcularMediaSegundaQuartaColunas(matriz);
        System.out.println("Média da segunda e quarta colunas: " + media);

        modificarMatriz(matriz);

        System.out.println("Matriz modificada:");
        imprimirMatriz(matriz);
    }

    private double[][] lerMatriz() {
        double[][] matriz = new double[3][6];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.println("Digite o valor da posição [" + i + "][" + j + "]: ");
                matriz[i][j] = app.readDouble("Digite um valor inteiro", false);
            }
        }

        return matriz;
    }

    private double calcularSomaColunasImpares(double[][] matriz) {
        double somaImpares = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 1; j < 6; j += 2) {
                somaImpares += matriz[i][j];
            }
        }
        return somaImpares;
    }

    private double calcularMediaSegundaQuartaColunas(double[][] matriz) {
        double somaMedia = 0;
        for (int i = 0; i < 3; i++) {
            somaMedia += matriz[i][1] + matriz[i][3];
        }
        return somaMedia / 6;
    }

    private void modificarMatriz(double[][] matriz) {
        for (int i = 0; i < 3; i++) {
            matriz[i][5] = matriz[i][0] + matriz[i][1];
        }
    }

    private void imprimirMatriz(double[][] matriz) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}

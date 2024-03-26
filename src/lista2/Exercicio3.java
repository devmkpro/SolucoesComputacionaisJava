package lista2;

public class Exercicio3 {

    private App app = new App();

    public void solved() {
        int[][] matriz = new int[3][3];
        int somaDiagonal = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite o valor da posição [" + i + "][" + j + "]: ");
                matriz[i][j] = app.readInt("Digite um número inteiro", false);
                if (i == j) {
                    somaDiagonal += matriz[i][j];
                }
            }
            
        }
        System.out.println("Matriz:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Soma da diagonal principal: " + somaDiagonal);

    }

}

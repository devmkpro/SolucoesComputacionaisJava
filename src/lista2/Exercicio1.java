package lista2;

/**
 * Exercicio1
 */
public class Exercicio1 {

    private App app = new App();
    
    public void solved()
    {
        int[] arrays = new int[10];
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int posicaoMax = 0;
        int posicaoMin = 0;

        for (int i = 0; i < arrays.length; i++) {
            System.out.println("Digite a posição " + i + " do array");
            arrays[i] = app.readInt("Digite um número inteiro", false);
            if (arrays[i] > maior) {
                maior = arrays[i];
                posicaoMax = i;
            }
            if (arrays[i] < menor) {
                menor = arrays[i];
                posicaoMin = i;
            }
        }

        

        System.out.printf("O maior número é %d, na posição %d\n", maior, posicaoMax);
        System.out.printf("O menor número é %d, na posição %d\n", menor, posicaoMin);
    }


}
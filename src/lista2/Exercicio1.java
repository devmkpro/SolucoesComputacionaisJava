package lista2;

/**
 * Exercicio1
 */
public class Exercicio1 {

    private App app = new App();
    
    public void solved()
    {
        int[] array = new int[10];
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int posicaoMax = 0;
        int posicaoMin = 0;

        for (int i = 0; i < array.length; i++) {
            System.out.println("Digite a posição " + i + " do array");
            array[i] = app.readInt("Digite um número inteiro", false);

            if (array[i] > maior) {
                maior = array[i];
                posicaoMax = i;
            } else if (array[i] < menor) {
                menor = array[i];
                posicaoMin = i;
            }
        }

        

        System.out.printf("O maior número é %d, na posição %d\n", maior, posicaoMax);
        System.out.printf("O menor número é %d, na posição %d\n", menor, posicaoMin);
    }


}
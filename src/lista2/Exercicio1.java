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

        for (int i = 0; i < arrays.length; i++) {
            System.out.println("Digite a posição " + i + " do array");
            arrays[i] = app.readInt("Digite um número inteiro", false);
            maior = Math.max(maior, arrays[i]);
            menor = Math.min(menor, arrays[i]);
        }

        System.out.printf("O maior número é %d e o menor número é %d%n", maior, menor);
    }


}
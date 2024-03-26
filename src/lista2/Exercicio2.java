package lista2;

import java.util.Arrays;

/**
 * Exercicio1
 */
public class Exercicio2 {

    private App app = new App();
    
    public void solved()
    {
        int[] arrays = new int[12];

        for (int i = 0; i < arrays.length; i++) {
            System.out.println("Digite a posição " + i + " do array");
            arrays[i] = app.readInt("Digite um número inteiro", false);
        }

        System.out.println("Ordem inversa: ");
        for (int i = 11; i >= 0; i--)
        {
            System.out.println(arrays[i]);
        }

        System.out.println("Ordem crescente: ");
        Arrays.sort(arrays);

        for (int i = 0; i < arrays.length; i++)
        {
            System.out.println(arrays[i]);
        }


    }


}
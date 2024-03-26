package lista2;

public class Exercicio6 {

    private App app = new App();

    public void solved() {

        double[] vet = new double[10];
        double soma = 0, media;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o valor da posição " + i + ": ");
            vet[i] = app.readDouble("Digite o valor da posição " + i + ": ", false);
            soma += vet[i];
        }

        media = soma / 10;
        double variancia = 0;

        for (int i = 0; i < 10; i++) {
            variancia += Math.pow(vet[i] - media, 2);
        }

        variancia /= 9;
        double desvioPadrao = Math.sqrt(variancia);

        System.out.println("Desvio padrão: " + desvioPadrao);
    }
}

package lista2;

public class Exercicio5 {
    
    private App app = new App();

    public void solved(){
        int numero = app.readInt("Digite um valor inteiro:", true);

        System.out.println("Número Digitado: " + numero);
        System.out.print("Números inteiros pares entre 1 e " + numero + ": ");
        for (int i = 2; i <= numero; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

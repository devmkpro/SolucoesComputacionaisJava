package lista1;

public class Exercicio5 {
    private App app = new App();
    
    public void solved(){
        double nota1 = app.readDouble("Digite a primeira nota: ");
        double nota2 = app.readDouble("Digite a segunda nota: "); 
        double nota3 = app.readDouble("Digite a terceira nota: ");

        double mediaFinal = calculate(nota1, nota2, nota3);

        System.out.println("A média final do aluno é: " + mediaFinal);
    }

    public double calculate(double nota1, double nota2, double nota3) {
        double peso1 = 2.3;
        double peso2 = 3;
        double peso3 = 5;

        double mediaFinal = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3);

        return mediaFinal;
    }
}

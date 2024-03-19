package lista1;

public class Exercicio2 {

    private App app = new App();

    public void solved(){
        double a = app.readInt("Digite o valor de a: ", true);
        double b = app.readInt("Digite o valor de b: ", true);
        double c = app.readInt("Digite o valor de c: ", true);

        
        double d = calculate(a, b, c);
        System.out.println("O resultado da expressão é: " + d);
    }

    public double calculate(double a, double b, double c) {

        double r = Math.pow(a+b, 2);
        double s = Math.pow(b+c, 2);
        double d = (r+s)/2;

        return d;

    }


    
}

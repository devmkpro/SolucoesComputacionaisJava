package lista1;

public class Exercicio3 {
    private App app = new App();
    
    public void solved(){
        int age = app.readInt("Digite a idade em anos: ");
        int months = app.readInt("Digite a idade em meses: "); 
        int days = app.readInt("Digite a idade em dias: ");

        int totalDays = calculate(age, months, days);

        System.out.println("A idade aproximada em dias é: " + totalDays);
    }

    public int calculate(int age, int months, int days) {
        int totalDays = age * 365 + months * 30 + days; // A questão não exige precisão, então 1 mês = 30 dias e anos bissextos não são considerados
        return totalDays;
    }
}

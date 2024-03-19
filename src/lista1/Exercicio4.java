package lista1;

public class Exercicio4 {
    private App app = new App();
    
    public void solved(){
        int totalDays = app.readInt("Digite a idade em dias: ", false);

        int[] idade = calculate(totalDays);

        System.out.println("A idade expressa em anos, meses e dias é: " + idade[0] + " anos, " + idade[1] + " meses, " + idade[2] + " dias");
    }

    public int[] calculate(int totalDays) {
        int[] idade = new int[3]; 
    
        idade[0] = totalDays / 365;
        totalDays %= 365;

        idade[1] = totalDays / 30;
        totalDays %= 30;
    
        idade[2] = totalDays;

        return idade;
    }
}

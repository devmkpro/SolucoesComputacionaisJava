package lista1;

public class Exercicio6 {
    private App app = new App();
    
    public void solved(){
        int duracaoSegundos = app.readInt("Digite a duração do evento em segundos: ");

        int[] duracao = calculate(duracaoSegundos);

        System.out.println("A duração do evento é: " + duracao[0] + " horas, " + duracao[1] + " minutos, " + duracao[2] + " segundos");

    }

    public int[] calculate(int durationSeconds) {
        int[] duration = new int[3]; 

        duration[0] = durationSeconds / 3600;
        durationSeconds %= 3600;  // horas

        duration[1] = durationSeconds / 60;
        durationSeconds %= 60;  // minutos

        duration[2] = durationSeconds; // segundos

        return duration;
    }
}

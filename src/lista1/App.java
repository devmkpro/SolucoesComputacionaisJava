package lista1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class App {

    public static Scanner sc = new Scanner(System.in);

    private void menu() {
        clearConsole();
        System.out.println("1 - Exercicio 1");
        System.out.println("2 - Exercicio 2");
        System.out.println("3 - Exercicio 3");
        System.out.println("4 - Exercicio 4");
        System.out.println("5 - Exercicio 5");
        System.out.println("6 - Exercicio 6");
        System.out.println("7 - Exercicio 7");
        System.out.println("8 - Exercicio 8");
        System.out.println("0 - Sair");
    }

    public static void main(String[] args) {
        App app = new App();
        app.menu();
        int opcao = app.readInt("Digite a opção desejada: ");
        while (opcao != 0) {
            try {
                if (opcao >= 1 && opcao <= 8) {
                    Class<?> exercicioClass = Class.forName("lista1.Exercicio" + opcao);
                    Object exercicio = exercicioClass.getDeclaredConstructor().newInstance();
                    Method solvedMethod = exercicioClass.getDeclaredMethod("solved");
                    solvedMethod.invoke(exercicio);
                } else {
                    System.out.println("Opção inválida");
                }
            } catch (ClassNotFoundException | NoSuchMethodException | IllegalAccessException | InstantiationException | InvocationTargetException e) {
                System.out.println("Erro ao executar o exercício: " + e.getMessage());
            }
            System.out.println("Pressione enter para continuar");
            sc.nextLine();
            app.menu();
            opcao = app.readInt("Digite a opção desejada: ");
        }
    }

    public double readDouble(String message) {
        return readNumber(message, Double::parseDouble);
    }

    public int readInt(String message) {
        return readNumber(message, Integer::parseInt);
    }

    
    private <T> T readNumber(String message, NumberParser<T> parser) {
        boolean isValid = false;
        T number = null;
        while (!isValid) {
            System.out.println(message);
            try {
                number = parser.parse(sc.nextLine());
                isValid = true;
            } catch (NumberFormatException e) {
                System.out.println("Número inválido");
            }
        }
        return number;
    }

    public static void clearConsole() {
        try {
            final String os = System.getProperty("os.name");

            if (os.contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (final Exception e) {
            System.out.println("Erro ao limpar o console: " + e.getMessage());
        }
    }

    private interface NumberParser<T> {
        T parse(String input) throws NumberFormatException;
    }
}

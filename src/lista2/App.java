package lista2;

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
        System.out. println("7 - Exercicio 7");
        System.out.println("8 - Exercicio 8");
        System.out.println("0 - Sair");
    }

    public static void main(String[] args) {
        App app = new App();
        app.menu();
        int opcao = app.readInt("Digite a opção desejada: ", false);
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
            opcao = app.readInt("Digite a opção desejada: ", false);
        }
    }

    public double readDouble(String message, Boolean requiredPositiveNumber) {
        return readNumber(message, Double::parseDouble, requiredPositiveNumber);
    }

    public int readInt(String message, Boolean requiredPositiveNumber) {
        return readNumber(message, Integer::parseInt, requiredPositiveNumber);
    }

    public String readString() {
        return sc.nextLine();
    }
  
    private <T> T readNumber(String message, NumberParser<T> parser, Boolean requiredPositiveNumber) {
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

            if (requiredPositiveNumber && isValid) {
                if (number instanceof Double) { // transformar em double para melhorar a precisão
                    isValid = (Double) number > 0;
                } else if (number instanceof Integer) {
                    isValid = (Integer) number > 0;
                }
                if (!isValid) {
                    System.out.println("Número deve ser positivo");
                }
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

    private interface NumberParser<T> { // classe abstrata
        T parse(String input) throws NumberFormatException;
    }
}

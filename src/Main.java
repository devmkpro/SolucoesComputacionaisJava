import java.util.Scanner;

public class Main {

    private void menu() {
        System.out.println("Selecione a lista que deseja entrar (digite o número correspondente): ");
        System.out.println("1 - Lista 1");
        System.out.println("0 - Sair");
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        String[] listaClasses = {"lista1.App"};
        
        boolean controleLaco = true;
        while (controleLaco) {
            main.menu();
            if (scanner.hasNextInt()) {
                int opcao = scanner.nextInt();
                scanner.nextLine(); 

                if (opcao == 0) {
                    System.out.println("Saindo...");
                    controleLaco = false;
                } else if (opcao >= 1 && opcao <= listaClasses.length) {
                    String listaClass = listaClasses[opcao - 1];
                    try {
                        Class<?> appClass = Class.forName(listaClass);
                        appClass.getDeclaredMethod("main", String[].class).invoke(null, (Object) null);
                    } catch (Exception e) {
                        System.out.println("Erro ao executar a lista: " + e.getMessage());
                    }
                } else {
                    System.out.println("Opção inválida");
                }
            } else {
                System.out.println("Por favor, digite um número válido.");
                scanner.nextLine(); 
            }
        }
        
        scanner.close();
    }
}

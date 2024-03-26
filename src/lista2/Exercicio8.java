package lista2;
import java.util.Scanner;

public class Exercicio8 {
    
    private App app = new App();

    public void solved () {
        Scanner sc = new Scanner(System.in);
        String numeroCartao = lerNumeroCartao(sc);

        if (!validarNumeroCartao(numeroCartao)) {
            System.out.println("Número de cartão inválido!");
            return;
        }

        String bandeira = identificarBandeira(numeroCartao);
        int digitoVerificador = calcularDigitoVerificador(numeroCartao);

        if (verificarCartaoValido(numeroCartao, digitoVerificador)) {
            System.out.println("Cartão válido! Bandeira: " + bandeira);
        } else {
            System.out.println("Cartão inválido!");
        }
    }

    private String lerNumeroCartao(Scanner sc) {
        System.out.print("Digite o número do cartão de crédito/débito (16 dígitos): ");
        return sc.nextLine();
    }

    private boolean validarNumeroCartao(String numeroCartao) {
        return numeroCartao.length() == 16;
    }

    private String identificarBandeira(String numeroCartao) {
        int primeiroDigito = Integer.parseInt(numeroCartao.substring(0, 1));
        int segundoDigito = Integer.parseInt(numeroCartao.substring(1, 2));

        if (primeiroDigito == 4) {
            return "Visa";
        } else if (primeiroDigito == 5) {
            if (segundoDigito >= 1 && segundoDigito <= 5) {
                return "Mastercard";
            } else if (segundoDigito == 0 || (segundoDigito >= 6 && segundoDigito <= 9)) {
                return "Maestro";
            }
        } else if (primeiroDigito == 3) {
            int segundoDigitoAmex = Integer.parseInt(numeroCartao.substring(1, 2));
            if (segundoDigitoAmex == 4 || segundoDigitoAmex == 7) {
                return "American Express";
            }
        }
        return "Outra Bandeira";
    }

    private int calcularDigitoVerificador(String numeroCartao) {
        int soma = 0;
        for (int i = 0; i < 15; i++) {
            int digito = Integer.parseInt(numeroCartao.substring(i, i + 1));
            if (i % 2 == 0) {
                digito *= 2;
                if (digito > 9) {
                    String strDigito = String.valueOf(digito);
                    digito = Integer.parseInt(strDigito.substring(0, 1)) + Integer.parseInt(strDigito.substring(1, 2));
                }
            }
            soma += digito;
        }
        int digitoVerificador = 10 - (soma % 10);
        if (digitoVerificador == 10) {
            digitoVerificador = 0;
        }
        return digitoVerificador;
    }

    private boolean verificarCartaoValido(String numeroCartao, int digitoVerificador) {
        return digitoVerificador == Integer.parseInt(numeroCartao.substring(15, 16));
    }
}

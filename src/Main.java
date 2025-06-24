import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws /* IOException, InterruptedException */ Exception {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("\n=== Conversor de Moedas ===");
            System.out.println("1. USD  =>> BRL");
            System.out.println("2. BRL  =>> USD");
            System.out.println("3. EUR  =>> BRL");
            System.out.println("4. BRL  =>> EUR");
            System.out.println("5. JPY  =>> BRL");
            System.out.println("6. BRL  =>> JPY");
            System.out.println("7. KRW  =>> BRL");
            System.out.println("8. BRL  =>> KRW");
            System.out.println("0. SAIR");
            System.out.println("Digite uma opção");
            int opcao = scanner.nextInt();

            if (opcao == 0) {
                continuar = false;
                System.out.println("Encerrando ...");
                break;
            }

            String de = "", para = "";
            switch (opcao) {
                case 1 -> { de = "USD"; para = "BRL";}
                case 2 -> { de = "BRL"; para = "USD";}
                case 3 -> { de = "EUR"; para = "BRL";}
                case 4 -> { de = "BRL"; para = "EUR";}
                case 5 -> { de = "JPY"; para = "BRL";}
                case 6 -> { de = "BRL"; para = "JPY";}
                case 7 -> { de = "KRW"; para = "BRL";}
                case 8 -> { de = "BRL"; para = "KRW";}
                default -> {
                    System.out.println("Opção inválida!");
                    continue;
                }
            }

            System.out.println("Digite o valor");
            double valor = scanner.nextDouble();
            double resultado = Conversor.converter(de,para, valor);

            System.out.printf("Resultado: %.2f %s = %.2f %s%n", valor, de, resultado,para);
        }

         scanner.close();
    }
}


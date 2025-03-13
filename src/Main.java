import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cofrinho cofrinho = new Cofrinho();

        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Adicionar Moeda");
            System.out.println("2. Remover Moeda");
            System.out.println("3. Listar Moedas");
            System.out.println("4. Calcular Total em Real");
            System.out.println("5. Sair");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {
                System.out.println("Escolha a moeda a ser adicionada:");
                System.out.println("1. Euro");
                System.out.println("2. Dólar");
                System.out.println("3. Iene");
                System.out.println("4. Real");
                int moedaEscolhida = scanner.nextInt();
                System.out.println("Digite o valor da moeda:");
                double valor = scanner.nextDouble();

                switch (moedaEscolhida) {
                    case 1:
                        cofrinho.adicionarMoeda(new Moeda.Euro(valor));
                        break;
                    case 2:
                        cofrinho.adicionarMoeda(new Moeda.Dolar(valor));
                        break;
                    case 3:
                        cofrinho.adicionarMoeda(new Moeda.Iene(valor));
                        break;
                    case 4:
                        cofrinho.adicionarMoeda(new Moeda.Real(valor));
                        break;
                    default:
                        System.out.println("Opção inválida.");
                }

            } else if (opcao == 2) {
                System.out.println("Ainda não implementado.");

            } else if (opcao == 3) {
                cofrinho.listarMoedas();
            } else if (opcao == 4) {
                System.out.println("Total em Reais: " + cofrinho.calcularTotalEmReal());
            } else if (opcao == 5) {
                System.out.println("Saindo...");
                break;
            } else {
                System.out.println("Opção inválida.");
            }
        }

        scanner.close();
    }
}

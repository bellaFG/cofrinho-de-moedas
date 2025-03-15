import java.util.Scanner;

public class Main {
    // Códigos ANSI SGR para cores e estilos no terminal
    public static final String RESET = "\u001B[0m";
    public static final String BOLD = "\u001B[1m";

    // Códigos para cores de fundo
    public static final String BG_GREEN = "\u001B[42m";
    public static final String BG_RED = "\u001B[41m";
    public static final String BG_BLUE = "\u001B[44m";
    public static final String BG_YELLOW = "\u001B[43m";
    public static final String BG_PURPLE = "\u001B[45m";

    // Códigos para cores do texto
    public static final String TEXT_GREEN = "\u001B[32m";
    public static final String TEXT_RED = "\u001B[31m";
    public static final String TEXT_BLUE = "\u001B[34m";
    public static final String TEXT_YELLOW = "\u001B[33m";
    public static final String TEXT_PURPLE = "\u001B[35m";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Objeto para entrada de dados pelo usuário
        Cofrinho cofrinho = new Cofrinho(); // Instância do Cofrinho para armazenar moedas

        // Loop infinito para exibir o menu até que o usuário escolha sair
        while (true) {
            exibirBanner(); // Exibe um banner inicial

            // Exibe opções do menu com cores
            System.out.println(" " + BG_GREEN + BOLD + " 1️⃣  Adicionar Moeda " + RESET);
            System.out.println(" " + BG_RED + BOLD + " 2️⃣  Remover Moeda " + RESET);
            System.out.println(" " + BG_BLUE + BOLD + " 3️⃣  Listar Moedas " + RESET);
            System.out.println(" " + BG_YELLOW + BOLD + " 4️⃣  Calcular Total em Real " + RESET);
            System.out.println(" " + BG_PURPLE + BOLD + " 5️⃣  Sair " + RESET);

            System.out.print("\n👉 Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer do teclado

            switch (opcao) {
                case 1:
                    // Adicionar Moeda
                    System.out.println("\n" + BG_GREEN + BOLD + " 🟢 ADICIONAR MOEDA " + RESET);
                    System.out.println(TEXT_GREEN + "1️⃣ Euro (€)");
                    System.out.println("2️⃣ Dólar ($)");
                    System.out.println("3️⃣ Iene (¥)");
                    System.out.println("4️⃣ Real (R$)" + RESET);
                    System.out.print("👉 Digite sua opção: ");
                    int moedaEscolhida = scanner.nextInt();

                    System.out.print("🪙 Digite a quantidade: ");
                    int quantidade = scanner.nextInt();

                    // Cria a moeda correspondente e adiciona ao cofrinho
                    switch (moedaEscolhida) {
                        case 1 -> cofrinho.adicionarMoeda(new Moeda.Euro(quantidade));
                        case 2 -> cofrinho.adicionarMoeda(new Moeda.Dolar(quantidade));
                        case 3 -> cofrinho.adicionarMoeda(new Moeda.Iene(quantidade));
                        case 4 -> cofrinho.adicionarMoeda(new Moeda.Real(quantidade));
                        default -> System.out.println(TEXT_RED + "🚫 Opção inválida!" + RESET);
                    }
                    break;

                case 2:
                    // Remover Moeda
                    System.out.println("\n" + BG_RED + BOLD + " 🔴 REMOVER MOEDA " + RESET);
                    System.out.println(TEXT_RED + "1️⃣ Euro (€)");
                    System.out.println("2️⃣ Dólar ($)");
                    System.out.println("3️⃣ Iene (¥)");
                    System.out.println("4️⃣ Real (R$)" + RESET);
                    System.out.print("👉 Digite sua opção: ");
                    moedaEscolhida = scanner.nextInt();

                    System.out.print("🔻 Digite a quantidade a remover: ");
                    quantidade = scanner.nextInt();

                    // Remove a quantidade especificada da moeda escolhida
                    switch (moedaEscolhida) {
                        case 1 -> cofrinho.removerMoeda("Euro", quantidade);
                        case 2 -> cofrinho.removerMoeda("Dólar", quantidade);
                        case 3 -> cofrinho.removerMoeda("Iene", quantidade);
                        case 4 -> cofrinho.removerMoeda("Real", quantidade);
                        default -> System.out.println(TEXT_RED + "🚫 Opção inválida!" + RESET);
                    }
                    break;

                case 3:
                    // Listar Moedas
                    System.out.println("\n" + BG_BLUE + BOLD + " 🔵 LISTAR MOEDAS " + RESET);
                    System.out.println(TEXT_BLUE + "📜 Moedas no cofrinho:" + RESET);
                    cofrinho.listarMoedas();
                    break;

                case 4:
                    // Calcular o valor total das moedas em reais
                    System.out.println("\n" + BG_YELLOW + BOLD + " 🟡 CALCULAR TOTAL " + RESET);
                    System.out.println(TEXT_YELLOW + "💰 Total em reais: R$" + cofrinho.calcularTotalEmReal() + RESET);
                    break;

                case 5:
                    // Encerrar o programa
                    System.out.println("\n" + BG_PURPLE + BOLD + " 🟣 SAINDO... " + RESET);
                    System.out.println(TEXT_PURPLE + "👋 Obrigado por usar o Cofrinho Virtual! Até mais!" + RESET);
                    scanner.close();
                    return; // Encerra o programa

                default:
                    System.out.println(TEXT_RED + "🚫 Opção inválida! Tente novamente." + RESET);
            }
        }
    }

    // Método para exibir um banner de boas-vindas ao usuário
    public static void exibirBanner() {
        System.out.println("=================================================");
        System.out.println(BOLD + "      🏦  BEM-VINDO AO SEU COFRINHO VIRTUAL  🏦" + RESET);
        System.out.println(BOLD + "     📌 Gerencie suas moedas com facilidade! 💸" + RESET);
        System.out.println("=================================================");
    }
}

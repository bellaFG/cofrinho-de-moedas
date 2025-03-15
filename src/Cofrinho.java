import java.util.ArrayList;
import java.util.List;

// Classe Cofrinho que gerencia uma coleção de moedas
class Cofrinho {
    private List<Moeda> moedas; // Lista para armazenar todas as moedas adicionadas ao cofrinho

    // Construtor da classe Cofrinho, inicializa a lista de moedas
    public Cofrinho() {
        this.moedas = new ArrayList<>();
    }

    // Método para adicionar uma moeda ao cofrinho
    // Se a moeda já existir, apenas aumenta sua quantidade
    public void adicionarMoeda(Moeda novaMoeda) {
        for (Moeda moeda : moedas) {
            if (moeda.getNome().equals(novaMoeda.getNome())) {
                moeda.adicionarQuantidade(novaMoeda.getQuantidade());
                return;
            }
        }
        moedas.add(novaMoeda); // Caso não exista, adiciona a nova moeda à lista
    }

    // Método para remover uma determinada quantidade de uma moeda específica
    public void removerMoeda(String nomeMoeda, int quantidade) {
        for (Moeda moeda : moedas) {
            if (moeda.getNome().equals(nomeMoeda)) {
                moeda.removerQuantidade(quantidade);
                return;
            }
        }
        System.out.println("Moeda não encontrada."); // Caso a moeda não esteja na lista
    }

    // Método para listar todas as moedas do cofrinho
    public void listarMoedas() {
        if (moedas.isEmpty()) {
            System.out.println("O cofrinho está vazio.");
        } else {
            for (Moeda moeda : moedas) {
                System.out.println(moeda.getQuantidade() + "x " + moeda.getNome() + " (" + moeda.getSimbolo() + " " + moeda.getValor() + " cada)");
            }
        }
    }

    // Método para calcular o total em reais (BRL), convertendo todas as moedas armazenadas
    public double calcularTotalEmReal() {
        double total = 0;
        for (Moeda moeda : moedas) {
            total += moeda.converterParaReal();
        }
        return total;
    }
}

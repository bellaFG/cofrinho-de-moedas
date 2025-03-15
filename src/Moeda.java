// Classe abstrata Moeda, aplicando o conceito de herança.
// Todos os atributos são privados para encapsulamento.
abstract class Moeda {
    private String nome;
    private double valor;
    private String simbolo;
    private int quantidade;

    // Construtor da classe Moeda
    public Moeda(String nome, double valor, String simbolo, int quantidade) {
        this.nome = nome;
        this.valor = valor;
        this.simbolo = simbolo;
        this.quantidade = quantidade;
    }

    // Método abstrato para converter o valor da moeda para Real (BRL)
    public abstract double converterParaReal();

    // Métodos de acesso (getters) para os atributos privados
    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    // Adiciona uma quantidade à moeda existente no cofrinho
    public void adicionarQuantidade(int qtd) {
        this.quantidade += qtd;
    }

    // Remove uma quantidade de moedas, garantindo que não fique negativa
    public void removerQuantidade(int qtd) {
        if (this.quantidade >= qtd) {
            this.quantidade -= qtd;
        } else {
            System.out.println("Não há moedas suficientes para remover.");
        }
    }

    // Classes internas que representam tipos de moeda específicos
    // Cada classe herda Moeda e implementa o método converterParaReal()

    static class Real extends Moeda {
        public Real(int quantidade) {
            super("Real", 1.00, "R$", quantidade);
        }

        @Override
        public double converterParaReal() {
            return getValor() * getQuantidade();
        }
    }

    static class Euro extends Moeda {
        public Euro(int quantidade) {
            super("Euro", 6.22, "€", quantidade);
        }

        @Override
        public double converterParaReal() {
            return getValor() * getQuantidade();
        }
    }

    static class Dolar extends Moeda {
        public Dolar(int quantidade) {
            super("Dólar", 5.50, "$", quantidade);
        }

        @Override
        public double converterParaReal() {
            return getValor() * getQuantidade();
        }
    }

    static class Iene extends Moeda {
        public Iene(int quantidade) {
            super("Iene", 0.045, "¥", quantidade);
        }

        @Override
        public double converterParaReal() {
            return getValor() * getQuantidade();
        }
    }
}

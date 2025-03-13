
abstract class Moeda {
    private String nome;
    private static double valor;
    private String simbolo;


    public Moeda(String nome, double valor, String simbolo) {
        this.nome = nome;
        Moeda.valor = valor;
        this.simbolo = simbolo;
    }

    public abstract double converterParaReal();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        Moeda.valor = valor;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }


    static class Real extends Moeda {

        public Real(double valor) {
            super("Real", 1.00, "R$");
        }
        @Override
        public double converterParaReal() {
            return valor;
        }
    }

    static class Euro extends Moeda {

        public Euro(double valor) {
            super("Euro", 6.22, "€");
        }

        @Override
        public double converterParaReal() {
            return valor * 6.22;
        }
    }

    static class Dolar extends Moeda {

        public Dolar(double valor) {
            super("Dolar", 5.50, "$");
        }

        @Override
        public double converterParaReal() {
            return valor * 5.50;
        }
    }

    static class Iene extends Moeda {

        public Iene(double valor) {
            super("Iene", 0.048, "¥");
        }
        @Override
        public double converterParaReal() {
            return valor * 0.045;
        }
    }
}
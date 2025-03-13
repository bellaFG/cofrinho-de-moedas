import java.util.ArrayList;
import java.util.List;

class Cofrinho {

    private List<Moeda> moedas;

    public Cofrinho(){
        this.moedas = new ArrayList<>();
    }
    public void adicionarMoeda(Moeda moeda){
        moedas.add(moeda);
    }
    public boolean removerMoeda(Moeda moeda){
        return moedas.remove(moeda);
    }
    public void listarMoedas(){
        if (moedas.isEmpty()){
            System.out.println("O cofrinho está vazio.");
        }else {
            for (Moeda moeda : moedas){
                System.out.println(moeda.getNome() + " " + moeda.getSimbolo() + " " + moeda.getValor());
            }
        }
    }

    public double calcularTotalEmReal() {
        double total = 0;
        for (Moeda moeda : moedas) {
            total += moeda.converterParaReal();
        }
        return total;
    }
}
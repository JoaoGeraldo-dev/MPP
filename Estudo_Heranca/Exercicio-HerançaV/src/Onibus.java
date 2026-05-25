public class Onibus extends Veiculo {
    private int qtdePassageiros;

    public Onibus() {}

    // AJUSTE: Construtor preparado para receber os 4 parâmetros do botão 
    public Onibus(String nome, String fabricante, double precoVenda, int qtdePassageiros) {
        super(nome, fabricante, precoVenda);
        this.qtdePassageiros = qtdePassageiros;
    }

    public int getQtdePassageiros() { return qtdePassageiros; }
    public void setQtdePassageiros(int qtdePassageiros) { this.qtdePassageiros = qtdePassageiros; }

    @Override
    public String toString() {
        return "Onibus"; // Exigido pelo PDF 
    }

    @Override
    public double calcularIPVA() {
        return this.getPrecoVenda() * 0.015; // 1,5% do valor de venda 
    }
}
public class Automovel extends Veiculo {
    private int potencia;

    public Automovel() {}

    // Construtor completo 
    public Automovel(String nome, String fabricante, double precoVenda, int potencia) {
        super(nome, fabricante, precoVenda);
        this.potencia = potencia;
    }

    public int getPotencia() { return potencia; }
    public void setPotencia(int potencia) { this.potencia = potencia; }

    @Override
    public String toString() {
        return "Automovel"; // Exigido pelo PDF 
    }

    @Override
    public double calcularIPVA() {
        return this.getPrecoVenda() * 0.04; // 4% do valor de venda 
    }
}
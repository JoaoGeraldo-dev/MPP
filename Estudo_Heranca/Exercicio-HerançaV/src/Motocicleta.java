public class Motocicleta extends Veiculo {
    private int cilindradas;

    public Motocicleta() {}

    // Construtor completo que o botão precisa chamar [cite: 34]
    public Motocicleta(String nome, String fabricante, double precoVenda, int cilindradas) {
        super(nome, fabricante, precoVenda);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() { return cilindradas; }
    public void setCilindradas(int cilindradas) { this.cilindradas = cilindradas; }

    @Override
    public String toString() {
        return "Motocicleta"; // Exigido pelo PDF [cite: 18]
    }

    @Override
    public double calcularIPVA() {
        return this.getPrecoVenda() * 0.02; // 2% do valor de venda [cite: 18]
    }
}
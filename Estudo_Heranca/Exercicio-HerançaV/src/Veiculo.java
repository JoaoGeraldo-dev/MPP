public class Veiculo {
    private String nome;
    private String fabricante;
    private double precoVenda;

    public Veiculo() {}

    public Veiculo(String nome, String fabricante, double precoVenda) {
        this.nome = nome;
        this.fabricante = fabricante;
        this.precoVenda = precoVenda;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getFabricante() { return fabricante; }
    public void setFabricante(String fabricante) { this.fabricante = fabricante; }

    public double getPrecoVenda() { return precoVenda; }
    public void setPrecoVenda(double precoVenda) { this.precoVenda = precoVenda; }

    @Override
    public String toString() {
        return "Veiculo"; // Exigido pelo PDF [cite: 15]
    }

    public double calcularIPVA() {
        return this.precoVenda * 0.10; // 10% do valor de venda [cite: 15]
    }
}
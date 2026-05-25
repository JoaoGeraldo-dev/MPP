public class Caminhonete extends Automovel {

    public Caminhonete() {}

    // CORREÇÃO: Construtor que recebe os parâmetros e repassa para o Automóvel 
    public Caminhonete(String nome, String fabricante, double precoVenda, int potencia) {
        super(nome, fabricante, precoVenda, potencia);
    }

    @Override
    public String toString() {
        return "Caminhonete"; // Exigido pelo PDF [cite: 57]
    }

    @Override
    public double calcularIPVA() {
        // Inicialmente o valor de Automovel, mas com acréscimo de 10% (multiplica por 1.10) [cite: 57]
        return super.calcularIPVA() * 1.10;
    }
}
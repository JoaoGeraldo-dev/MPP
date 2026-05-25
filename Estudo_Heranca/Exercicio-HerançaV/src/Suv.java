public class Suv extends Automovel {

    public Suv() {}

    // CORREÇÃO: O botão envia 4 parâmetros, então a SUV precisa repassar para o Automóvel 
    public Suv(String nome, String fabricante, double precoVenda, int potencia) {
        super(nome, fabricante, precoVenda, potencia);
    }

    @Override
    public String toString() {
        return "SUV"; // Exigido pelo PDF 
    }

    @Override
    public double calcularIPVA() {
        // Inicialmente o valor de Automovel, mas com 10% de desconto (multiplica por 0.90) 
        return super.calcularIPVA() * 0.90;
    }
}
public abstract class Veiculo implements Servico {
    private String modelo;
    private String placa;

    public Veiculo(String modelo,String placa){
        this.modelo = modelo;
        this.placa = placa;
    }


    public void exibirDados(){
        System.out.println("modelo: " + modelo);
        System.out.println("placa: " + placa);
        System.out.println("O valor do serviço é: " + calcularServico());
    }

    public abstract double calcularServico();

}

public class Medicos {
    private String nome;
    private double valorConsulta;
    private int qtdeConsulta;
    private double sal;

    
     public Medicos(String nome, double valorConsulta, int qtdeConsulta){
     this.nome = nome;
     this.valorConsulta = valorConsulta;
     this.qtdeConsulta = qtdeConsulta;
 }
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorConsulta() {
        return valorConsulta;
    }

    public void setValorConsulta(double valorConsulta) {
        this.valorConsulta = valorConsulta;
    }

    public int getQtdeConsulta() {
        return qtdeConsulta;
    }

    public void setQtdeConsulta(int qtdeConsulta) {
        this.qtdeConsulta = qtdeConsulta;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }
    
    public void calcularSalario(){
        sal = qtdeConsulta * valorConsulta;
    }
    
    
}

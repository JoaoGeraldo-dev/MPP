
public class Funcionarios {
  private int matricula;
  private String nome;
  private double salario;


  public Funcionarios(){
      matricula = 0;
      nome = "";
      salario = 0;
  }

    public Funcionarios(int matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
        this.salario = 0;
    }

    /**
     * @return the matricula
     */
    public int getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the salario
     */
    public double getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public void calcularSalario(){
        this.salario = 2000;
    }
    
  
  


}


public class Professor extends Funcionarios
{
    public int cargaHoraria;

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    
    
    
    
    public Professor() {
    }

    public Professor(int matricula, String nome, int cargaHoraria) {
        super(matricula, nome);
        this.cargaHoraria = cargaHoraria;
    }
     @Override
   public void calcularSalario(){
       super.calcularSalario();
     
       double novoSalario = cargaHoraria * 50 * 4.5;
       
       setSalario(novoSalario);
   }
    
     @Override
    public String toString() {
       String resposta = String.format("Prof. %d - %s - R$ %.2f", getMatricula(),
               getNome(), getSalario());
       return resposta;
    }
}


public class AuxiliarAdministrativo extends Funcionarios 
{

    public AuxiliarAdministrativo() {
        super();
    }

    public AuxiliarAdministrativo(int matricula, String nome) {
        super(matricula, nome);
    }
    
   @Override
   public void calcularSalario(){
       super.calcularSalario();
       
       double reajuste = getSalario() * 10/100;
       double novoSalario = getSalario()+ reajuste;
       
       setSalario(novoSalario);
   }
    
    @Override
    public String toString() {
       String resposta = "O salario do " + getNome() + " é " + getSalario(); 
       return resposta;
    }

}

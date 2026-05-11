
        
public class DiretorServico extends AuxiliarAdministrativo  {
    
    public DiretorServico(){
        super();
    }
    
    public DiretorServico(int matricula, String nome){
        super(matricula, nome);
        
    }
    @Override
   public void calcularSalario(){
       super.calcularSalario();
       
       double reajuste = getSalario() * 0.5;
       double novoSalario = getSalario()+ reajuste;
       
       setSalario(novoSalario);
       
   }
      @Override
    public String toString() {
       String resposta = String.format("DirSer. %d - %s - R$ %.2f", getMatricula(),
               getNome(), getSalario());
       return resposta;
    }
}

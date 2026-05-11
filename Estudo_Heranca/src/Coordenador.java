public class Coordenador extends Professor {

    private int qtdeTurma;
    
    public Coordenador(){
        super();
    }
    
    public Coordenador(int matricula, String nome, int cargahoraria,int qtdeTurma ){
        super(matricula, nome, cargahoraria);
        this.qtdeTurma = qtdeTurma;
    }
    
        @Override
   public void calcularSalario(){
       super.calcularSalario();
     
       double novoSalario = getSalario() + 150 * qtdeTurma;
       
       setSalario(novoSalario);
   }
   
      @Override
    public String toString() {
       String resposta = String.format("Cordenador. %d - %s - R$ %.2f - %d", getMatricula(),
               getNome(), getSalario(), getQtdeTurma());
       return resposta;
    }

    public int getQtdeTurma() {
        return qtdeTurma;
    }

    public void setQtdeTurma(int qtdeTurma) {
        this.qtdeTurma = qtdeTurma;
    }
    
}

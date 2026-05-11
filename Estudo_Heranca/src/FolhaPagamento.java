import java.util.List;
import java.util.ArrayList;
public class FolhaPagamento {
    
    private List<Funcionarios> listaFuncionarios;
    
    public FolhaPagamento(){
        listaFuncionarios = new ArrayList<Funcionarios>();
    }
    
    public void adicionarFuncionario(Funcionarios novo){
        listaFuncionarios.add(novo);
    }
    
    public void exibirFuncionarios(){
        for(Funcionarios func : listaFuncionarios){
            func.calcularSalario();
            System.out.println(func);
        }
    }
    
    public double calcularTotal(){
        double total = 0;
        for(Funcionarios func : listaFuncionarios){
            func.calcularSalario();
           total = total + func.getSalario();
        }
        return total;
    }
    
}


public class Personal implements FolhaPagamento
{
private String nome;
private String Cref;

    public Personal(String nome, String Cref) {
        this.nome = nome;
        this.Cref = Cref;
    }

    @Override
    public String toString() {
    return "Nome: " + nome + "CREF: " + Cref;
    }

    @Override
    public double calcularSalario() {
    return 1800.00;
    }
    
    
}



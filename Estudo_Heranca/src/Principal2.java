
public class Principal2 {


    public static void main(String[] args) {
        FolhaPagamento folha = new FolhaPagamento();
        folha.adicionarFuncionario(new AuxiliarAdministrativo(1001, "marcelo"));
        folha.adicionarFuncionario(new DiretorServico(1002, "Danilo"));
        folha.adicionarFuncionario(new Coordenador(1003,"Victor", 20,5));
       
        System.out.println(String.format("O valor total da  folha de pagamento é %.2f", folha.calcularTotal()));
        System.out.println("\n abaxio serao exibidos os funcionarios: ");
        folha.exibirFuncionarios();
    }
    
}

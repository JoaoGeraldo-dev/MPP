
public class Principal
{

    public static void main(String[] args)
    {
       AuxiliarAdministrativo func1 = new AuxiliarAdministrativo();
       func1.setMatricula(1001);
       func1.setNome("João Geraldo");
       func1.calcularSalario();
       
       System.out.println(func1);
       
       
       AuxiliarAdministrativo func2 = new AuxiliarAdministrativo(1002, "Vitor");
       func2.calcularSalario();
       System.out.println(func2);
       
        Professor func3 = new Professor(1003, "Guilherme", 40);
        func3.calcularSalario();
        System.out.println(func3);
        
        
        Professor func4 = new Professor(1004, "Miguel", 40);
        func4.calcularSalario();
        System.out.println(func4);
        
        DiretorServico func5 = new DiretorServico(1005, "Danilo");
        func5.calcularSalario();
        System.out.println(func5);
        
        DiretorEscola func6 = new DiretorEscola(1006, "Romeu", 20);
         func6.calcularSalario();
        System.out.println(func6);
    
            Coordenador func7 = new Coordenador(1006, "Julio", 20,5);
         func7.calcularSalario();
        System.out.println(func7);
    
    }
    
   
}

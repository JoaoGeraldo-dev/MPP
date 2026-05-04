
public class Principal
{

    public static void main(String[] args)
    {
       AuxiliarAdministrativo func1 = new AuxiliarAdministrativo();
       func1.setMatricula(1001);
       func1.setNome("João Geraldo");
       func1.calcularSalario();
       
       System.out.println(func1);
       
    }
    
}

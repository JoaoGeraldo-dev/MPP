
public class Principal {

   
    public static void main(String[] args)
    {
     Supervisor objeto = new Supervisor();
     objeto.setNome("Nanilo");
     objeto.setTempo(10);
     objeto.calcularSalario();
     
     System.out.println("O salario é " + objeto.getSalario());
    
    
    Gerente objeto2 = new Gerente("Helena", 4);
    objeto2.calcularSalario();
    System.out.println("O salario é " + objeto2.getSalario());
    }
    
}

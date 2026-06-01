
public class Principal {
    public static void main(String[] args) {
        Personal objeto = new Personal("Matheus", "102030");
        System.out.println(objeto);
        System.out.println("Salario: " + objeto.calcularSalario());
    }
}

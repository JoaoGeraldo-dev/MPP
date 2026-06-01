

public class Principal {
    public static void main(String[] args) {
        System.out.println("Estudo de Classes abstratas");
        Cachorro objeto = new Cachorro("totó");
        System.out.println("Olá" + objeto.getNome());
        objeto.emitirSom();
        
       (new Boto("Safadao")).emitirSom();
       (new Gato("Gataomiau")).emitirSom();
    
    
    }    
}

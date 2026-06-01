public class Boto extends Animal {

    public Boto(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        String msg = String.format("O boto %s faz oi casada", getNome());
        System.out.println(msg);
    }
    
}

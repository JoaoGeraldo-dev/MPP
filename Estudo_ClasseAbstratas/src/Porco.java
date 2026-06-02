public class Porco extends Animal{

    public Porco(String nome){super(nome);}

    @Override
    public void emitirSom(){
        String msg = String.format("O porco %s faz avante palestra!!", getNome());
        System.out.println(msg);

    }
}

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Veiculo> listaV = new ArrayList<>();

        listaV.add(new Carro("fiesta","oi1025"));
        listaV.add(new Moto("mt-07","oi1077"));

        for(Veiculo v : listaV){
            v.exibirDados();
        }
        }

    }

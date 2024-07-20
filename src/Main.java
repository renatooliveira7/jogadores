import Jogadores.Jogador1;
import Jogadores.Jogador2;
import Jogadores.Jogador3;

public class Main {

    public static void main(String[] args) {
        
        Jogador1 jogador1 = new Jogador1("Cristiano Ronaldo", 1.87, 83, "nada");
        Jogador2 jogador2 = new Jogador2("Neymar Jr", 1.75, 68, "nada");
        Jogador3 jogador3 = new Jogador3("Lionel Messi", 1.70, 67, "nada");

        System.out.println("O jogador 1 é o " + jogador1.getNome());
        System.out.println("O jogador 2 é o " + jogador2.getNome());
        System.out.println("O jogador 3 é o " + jogador3.getNome());

        System.out.println("A perna boa de Cristiano Ronaldo é " + jogador1.getPernaBoa());
        System.out.println("A perna boa de Lionel Messi é " + jogador2.getPernaBoa());
        System.out.println("A perna boa de Neymar Jr é " + jogador3.getPernaBoa());

        System.out.println("Cristiano Ronaldo fez o gol e está " + jogador1.interagir("fez o gol"));
        System.out.println("Lionel Messi perdeu a partida e está " + jogador2.interagir("perdeu a partida"));
        System.out.println("Neymar Jr perdeu o gol e está " + jogador3.interagir("perdeu o gol"));
    }
}


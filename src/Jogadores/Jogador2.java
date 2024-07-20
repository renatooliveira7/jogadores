package Jogadores;

public class Jogador2 extends Jogador {

    static String pernaBoa;

    public String getPernaBoa(){
        return "Esquerda";
    }

    public Jogador2(String nome, double altura, double peso, String emoçao){
        super(nome, altura, peso, emoçao);
    }
    
    @Override
    public String toString(){
        return "Jogador2{" +
                "nome='" + nome + '\'' +
                '}';
    }

    @Override
    public void pernaBoa(){
        System.out.println("Esquerda");
    }

    public String interagir(String acao){

        switch (acao){
            case "fez o gol": this.emoçao = "feliz"; break;
            case "perdeu a partida": this.emoçao = "triste"; break;
            case "perdeu o gol": this.emoçao = "bravo"; break;
            default: this.emoçao = "normal";
        }

        return this.emoçao;
        
    }

}

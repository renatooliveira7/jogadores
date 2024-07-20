package Jogadores;

public abstract class Jogador {

    protected String nome;
    protected double altura;
    protected double peso;
    protected String emoçao;

    public Jogador(String nome, double altura, double peso, String emoçao){
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
        this.emoçao = emoçao;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getAltura(){
        return this.altura;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    public double getPeso(){
        return this.peso;
    }

    public void setPeso(double peso){
        this.peso = peso;
    }

    public void pernaBoa(){}
}
package br.com.zup.diagrama;

public class Rasteiros extends Inimigos{
    private double dano_espinho;

    public Rasteiros(String nome, double vida, double dano_espinho) {
        super(nome, vida);
        this.dano_espinho = dano_espinho;
    }

    public double getDano_espinho() {
        return dano_espinho;
    }

    public void setDano_espinho(double dano_espinho) {
        this.dano_espinho = dano_espinho;
    }
    public double aplicar_dano (){
        double dano=10;
        return dano;
    }
}

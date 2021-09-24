package br.com.zup.diagrama;

public class Voadores extends Inimigos{
    private double dano_tiro;

    public Voadores(String nome, double vida, double dano_tiro) {
        super(nome, vida);
        this.dano_tiro = dano_tiro;
    }

    public double getDano_tiro() {
        return dano_tiro;
    }

    public void setDano_tiro(double dano_tiro) {
        this.dano_tiro = dano_tiro;
    }
    public double aplicar_dano (){
        double dano=10;
        return dano;
    }
}


package br.com.zup.diagrama;

public class Guerreiro extends Heroi{
    private double poder_ataque;

    public Guerreiro(String nome, double vida, double poder_ataque) {
        super(nome, vida);
        this.poder_ataque = poder_ataque;
    }

    public double getPoder_ataque() {
        return poder_ataque;
    }

    public void setPoder_ataque(double poder_ataque) {
        this.poder_ataque = poder_ataque;
    }

    public double aplicar_dano (){
         double dano=20;
        return dano;
    }


}

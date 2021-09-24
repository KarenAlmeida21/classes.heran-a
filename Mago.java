package br.com.zup.diagrama;

public class Mago extends Heroi{
    private double poder_magico;


    public Mago(String nome, double vida, double poder_magico) {
        super(nome, vida);
        this.poder_magico = poder_magico;
    }



    public double getPoder_magico() {

        return poder_magico;
    }

    public void setPoder_magico(double poder_magico) {

        this.poder_magico = poder_magico;
    }


    public double getVida() {
        return super.getVida();
    }

   public double aplicar_magia (){
      double  magia=25;

      return magia;
    }

   }



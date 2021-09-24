package br.com.zup.diagrama;

public class Main {
    public static void main(String[] args) {
        Mago mago = new Mago("Flamel", 200, 65);
        System.out.println(" Vida do mago : " + mago.exibir_vida());
        Guerreiro guerreiro = new Guerreiro("Sam", 200, 65);
        System.out.println(" Vida do guerreiro : " + guerreiro.exibir_vida());


        Rasteiros rasteiro = new Rasteiros("John", 100, 25);
        System.out.println(" Vida do rasteiro : " + rasteiro.exibir_vida());
        Voadores voadores = new Voadores("Dean", 100, 25);
        System.out.println(" Vida do voador : " + voadores.exibir_vida());
        System.out.println("-----------------------------------");


        System.out.println("Guerreiro vs Voador");
        //testando método troca_nome
        guerreiro.trocar_nome("Lian");
        System.out.println("Nome do guerreiro: " + guerreiro.getNome());
        rasteiro.trocar_nome("Bryan");
        System.out.println("Nome do voador: " + voadores.getNome());
        System.out.println("LUTEM!");

        guerreiro.aplicar_dano();
        voadores.receber_dano(guerreiro.getPoder_ataque());
        System.out.println("Voador sofre ataque de guerreiro e sua vida atual é: " + voadores.exibir_vida());
        guerreiro.receber_dano(voadores.getDano_tiro());
        System.out.println("Guerreiro sofre ataque e sua vida tual é: " + guerreiro.exibir_vida());
        System.out.println("-----------------------------------");

        System.out.println("Mago vs Rasteiro");
        //testando método troca_nome
        mago.trocar_nome("Gain");
        System.out.println("Nome do mago: " + mago.getNome());
        rasteiro.trocar_nome("Moor");
        System.out.println("Nome do rasteiro: " + rasteiro.getNome());
        System.out.println("LUTEM!");

        mago.aplicar_magia();
        rasteiro.receber_dano(mago.getPoder_magico());
        System.out.println("Rasteiro sofre ataque de mago e sua vida atual é: " + rasteiro.exibir_vida());
        mago.receber_dano(rasteiro.aplicar_dano());
        System.out.println("Mago sofre ataque e sua vida tual é: " + mago.exibir_vida());
        System.out.println("FIM DE LUTA!");




    }
}

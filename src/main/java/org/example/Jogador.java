package org.example;

public class Jogador extends Pessoa implements Recuperar, Loja{

    private int nivel;
    private boolean passeBatalha;
    private int vida;
    private int escudo;

    Skin[] skins = new Skin[1];
    Mochila[] mochilas = new Mochila[1];

    public Jogador(String nome, int nivel, boolean passeBatalha, int vida, int escudo) {
        super(nome);
        this.nivel = nivel;
        this.passeBatalha = passeBatalha;
        this.vida = vida;
        this.escudo = escudo;
    }

    void adicionarMochila(Mochila m1){
        for(int i = 0; i < mochilas.length; i++){
            if (mochilas[i] == null){
                mochilas[i] = m1;
                break;
            }
        }
    }

    void adicionarSkin(Skin s1){
        for(int i = 0; i < skins.length; i++){
            if (skins[i] == null){
                skins[i] = s1;
                break;
            }
        }
    }


    public int getVida() {

        return vida;
    }

    public void setVida(int vida) {

        this.vida = vida;
    }

    int getNivel = 0;

    public int getGetNivel() {
        return getNivel;
    }

    public void setGetNivel(int getNivel) {
        this.getNivel = getNivel;
    }

    @Override
    public void fazMissao() {
        System.out.println(getNome() + " completou um missão!" );
        getNivel++;

    }
    public void mostraInfo() {
        System.out.println("Infoformações do Jogador:");
        System.out.println("Nível: "+this.nivel);
        System.out.println("Possui passe de batalha?: "+this.passeBatalha);
        System.out.println("Vida: "+this.vida);
        System.out.println("Escudo: "+this.escudo);
        for (int i = 0; i < mochilas.length; i++) {
            if (mochilas[i] != null) {
                System.out.println("Informações da mochila:");
                System.out.println("Raridade: " + mochilas[i].getRaridade());
            }
            else
                System.out.println("O jogador não possui mochila.");
        }
        for (int i = 0; i < skins.length; i++) {
            if (skins[i] != null) {
                System.out.println("Informações da skin:");
                System.out.println("Nome: " + skins[i].getNome());
                System.out.println("Raridade: " + skins[i].getRaridade());
            }
            else
                System.out.println("O jogador não possui skin.");
        }

    }

    @Override
    public void recuperarVida() {
        if(getVida() <= 85)
            vida += 15;
        else
            vida = 100;
        System.out.println(vida);
    }

    @Override
    public void recuperarEscudo() {
        if(getEscudo() <= 75)
            escudo += 25;
        else
            escudo = 100;
        System.out.println(escudo);
    }

    private int getEscudo() {
        return escudo;
    }

    public int getNivel() {
        return nivel;
    }

    public boolean isPasseBatalha() {
        return passeBatalha;
    }

    public void setEscudo(int escudo) {
        this.escudo = escudo;
    }

    public void setPasseBatalha(boolean passeBatalha) {
        this.passeBatalha = passeBatalha;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    @Override
    public void gastarVbucks() {
        System.out.println("Gastou VBucks na loja");

    }

    @Override
    public void comprarVbucks() {
        System.out.println("Comprou VBucks na loja");
    }
}

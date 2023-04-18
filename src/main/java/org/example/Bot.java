package org.example;

public class Bot extends Pessoa implements Interacao{
    private boolean hostil;

    public Bot(String nome, boolean hostil) {
        super(nome);
        this.hostil = hostil;
    }

    public void mostraInfo(){
        System.out.println("Infoformações do Bot:");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Hostilidade: " + this.hostil);
    }

    @Override
    public void fazMissao(){
        if(hostil)
            System.out.println("Atrapalhou o jogador a fazer a missão");
        else
            System.out.println("Ajudou o jogador a fazer a missão");
    }

    @Override
    public void passarMissao() {
        if(hostil)
            System.out.println("Este Bot não passa missões!");
        else
            System.out.println("Este Bot passa missões!");

    }
}

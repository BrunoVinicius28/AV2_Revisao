package org.example;

public class Main {
    public static void main(String[] args) {
        Pessoa[] pessoas = new Pessoa[10];
        Bot[] bots = new Bot[10];
        Skin[] skins = new Skin[1];
        Mochila[] mochilas = new Mochila[1];

        Jogador j1 = new Jogador("Bruno", 12, true,57, 70);
        Mochila m1 = new Mochila("épico");
        j1.adicionarMochila(m1);
        Skin s1 = new Skin("Mago", "épico");
        j1.adicionarSkin(s1);
        Bot b1 = new Bot ("Fábio", true);

        skins[0] = s1;
        mochilas[0] = m1;

        pessoas[0] = j1;
        pessoas[1] = b1;

        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i] != null) {
                if (pessoas[i] instanceof Jogador) {
                    Jogador j = (Jogador) pessoas[i];
                    System.out.println("Ações do Jogador: ");
                    j.fazMissao();
                    j.recuperarVida();
                    j.recuperarEscudo();
                    j.gastarVbucks();
                    j.comprarVbucks();
                    j.mostraInfo();
                    System.out.println("-----------------------------------");
                }
                if (pessoas[i] instanceof Bot) {
                    Bot b = (Bot) pessoas[i];
                    System.out.println("Ações do Bot: ");
                    b.mostraInfo();
                    b.fazMissao();
                    b.passarMissao();
                }
            }
        }
        System.out.println("-----------------------------------");
        System.out.println("Total de pessoas que foram criadas");
        System.out.println(Pessoa.qtdPessoa);


        /*
        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i] != null) {
                pessoas[i].fazMissao();
                pessoas[i].mostraInfo();
            }
        }


         */
    }
}
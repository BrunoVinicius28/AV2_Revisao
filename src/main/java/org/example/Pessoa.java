package org.example;

public abstract class Pessoa {
    public static int qtdPessoa;
    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
        qtdPessoa++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public void mostraInfo(){
        System.out.println(qtdPessoa);

    }
    public abstract void fazMissao();

}

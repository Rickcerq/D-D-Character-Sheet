package Java;

public class Personagem {
    private String nome;
    private Raça Raça;
    private Classe Classe;
    private int Nivel = 0;
    private String Antecendente;
    private Alinhamento Alinhamento;
    private int PontosExp = 0;

    public Personagem(String nome, Raça Raça, Classe Classe, String Antecendente, Alinhamento Alinhamento) {
        this.nome = nome;
        this.Raça = Raça;
        this.Classe = Classe;
        this.Antecendente = Antecendente;
        this.Alinhamento = Alinhamento;
    }


}
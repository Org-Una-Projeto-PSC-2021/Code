public class Personagens {
    private String nome;
    private boolean status;
    private int vida;
    private String habilidades;
    

private Personagens(String nome, boolean status, int vida, String habilidades) {
    this.nome = nome;
    this.status = status;
    this.vida = vida;
    this.habilidades = habilidades;
}

    Personagens silvio = new Personagens("Silvio Santos", true, 100, "Dinheiro, Fama e Carisma");
    Personagens guerreiro = new Personagens("Guerreiro", true, 100, "Força, Brutalidade e Magia");
    Personagens aluno = new Personagens("Aluno Acadêmico", true, 100, "Inteligência, Sono e Força de Vontade");
    Personagens mago = new Personagens("Mago Implacável", true, 100, "Poder, Força e Resistência");
    Personagens estrategista = new Personagens("Mestre Estratégico", true, 100, "Inteligência, Conhecimento e Paciência");

}

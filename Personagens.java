public class Personagens {
    private String nome;
    private boolean status;
    private int vida;
    private String habilidades;
    

    public Personagens(String nome, boolean status, int vida, String habilidades) {
        this.nome = nome;
        this.status = status;
        this.vida = vida;
        this.habilidades = habilidades;
    }

    // Getters e Setters
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public boolean getStatus() {
        return this.status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
    public int getVida() {
        return this.vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
    public String getHabilidades() {
        return this.habilidades;
    }

    public void setHabilidades(String habilidades) {
        this.habilidades = habilidades;
    }

}
